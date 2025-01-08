package com.example.tododemo.domain.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class User {
    private String userId;
    private String userName;
    private String userEmail;
    private String userPassword;
    private LocalDateTime createdAt;
}
