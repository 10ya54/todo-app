package com.example.tododemo.app.controller;

import com.example.tododemo.app.form.LoginForm;
import com.example.tododemo.domain.model.User;
import com.example.tododemo.domain.service.LoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class LoginController {
    private final LoginService loginService;

    @GetMapping("/login")
    public String login(Model model, LoginForm form) {
        return "login";
    }

    @PostMapping("/login")
    public String loginProcess(Model model, LoginForm form) {
        User user = loginService.login(form.getUserId(), form.getPassword());
        if (user == null) {
            model.addAttribute("errorMsg", "ログインに失敗しました");
            return "login";
        }
        return "redirect:/top";
    }
}
