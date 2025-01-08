package com.example.tododemo.domain.service;

import com.example.tododemo.domain.model.User;

public interface LoginService {
    User login(String userId, String password);
}
