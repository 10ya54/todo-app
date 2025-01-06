package com.example.todo_app.app.controller;

import com.example.todo_app.app.form.LoginForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String login(Model model, LoginForm form) {
        return "login";
    }

    @PostMapping("/login")
    public String loginProcess(Model model, LoginForm form) {
        return "redirect:/top";
    }
}
