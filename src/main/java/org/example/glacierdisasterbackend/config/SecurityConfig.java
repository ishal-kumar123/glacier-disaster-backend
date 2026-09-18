package org.example.glacierdisasterbackend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
public class SecurityConfig {

    private final JwtAuthenticationFilter jwtAuthenticationFilter;

    public SecurityConfig(JwtAuthenticationFilter jwtAuthenticationFilter) {
        this.jwtAuthenticationFilter = jwtAuthenticationFilter;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http)
            throws Exception {

        http
                .csrf(csrf -> csrf.disable())

                .sessionManagement(session ->
                        session.sessionCreationPolicy(
                                SessionCreationPolicy.STATELESS
                        )
                )

                .authorizeHttpRequests(auth -> auth

                        // Public
                        .requestMatchers(
                                "/api/users/register",
                                "/api/users/login"
                        ).permitAll()

                        // Rescue Team only
                        .requestMatchers("/api/rescue-operations/**")
                        .hasRole("RESCUE_TEAM")

                        // Authority only
                        .requestMatchers("/api/danger-zones/**")
                        .hasAnyRole("AUTHORITY", "ADMIN")

                        .requestMatchers("/api/alerts/**")
                        .hasAnyRole("AUTHORITY", "ADMIN")

                        // Admin only
                        .requestMatchers("/api/rescue-stations/**")
                        .hasRole("ADMIN")

                        // All remaining APIs
                        .anyRequest().authenticated()
                )

                .addFilterBefore(
                        jwtAuthenticationFilter,
                        UsernamePasswordAuthenticationFilter.class
                );

        return http.build();
    }
}