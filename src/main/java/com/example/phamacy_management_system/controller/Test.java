package com.example.phamacy_management_system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auth")
public class Test {
    @GetMapping("/test")
    public void Test(){
        System.out.println("hello");
    }
}
