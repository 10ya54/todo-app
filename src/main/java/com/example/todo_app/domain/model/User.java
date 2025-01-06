package com.example.todo_app.domain.model;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class User {
    private String userId;
    private String username;
    private String userEmail;
    private String userPassword;
    private Timestamp createdAt;
}
