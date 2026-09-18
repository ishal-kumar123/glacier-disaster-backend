package org.example.glacierdisasterbackend.controller;

import org.example.glacierdisasterbackend.model.LoginRequest;
import org.example.glacierdisasterbackend.model.User;
import org.example.glacierdisasterbackend.service.JwtService;
import org.example.glacierdisasterbackend.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    private final UserService userService;
    private final JwtService jwtService;

    public UserController(UserService userService,
                          JwtService jwtService) {
        this.userService = userService;
        this.jwtService = jwtService;
    }

    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody User user) {

        User savedUser = userService.registerUser(user);

        return ResponseEntity.ok(savedUser);
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(
            @RequestBody LoginRequest loginRequest) {

        boolean valid = userService.loginUser(
                loginRequest.getEmail(),
                loginRequest.getPassword()
        );

        if (valid) {

            String token = jwtService.generateToken(
                    loginRequest.getEmail()
            );

            return ResponseEntity.ok(token);
        }

        return ResponseEntity.status(401)
                .body("Invalid email or password");
    }
}