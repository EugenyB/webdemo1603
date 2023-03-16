package com.example.webdemo1603.controller;

import com.example.webdemo1603.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    @PostMapping("/hello")
    public String hello(@RequestParam("username") String name, @RequestParam("userage") int age, Model model) {
        User user = new User(name, age);
        model.addAttribute("user", user);
        return "hello";
    }
}
