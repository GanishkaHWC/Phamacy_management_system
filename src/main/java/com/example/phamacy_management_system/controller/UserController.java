package com.example.phamacy_management_system.controller;

import com.example.phamacy_management_system.dto.UserRegistrationDto;
import com.example.phamacy_management_system.repository.UserRepository;
import com.example.phamacy_management_system.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/auth")
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping("/signup")
    public ResponseEntity<?> registerUserAccount(@Valid @RequestBody UserRegistrationDto userRegistrationDto){
        userService.save(userRegistrationDto);
        return ResponseEntity.ok("User registered successfully!");
    }
}
