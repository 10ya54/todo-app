package com.example.tododemo.domain.service;

import com.example.tododemo.domain.model.User;
import com.example.tododemo.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class LoginServiceImpl implements LoginService {
    private final UserRepository userRepository;

    @Override
    public User login(String userId, String password) {
        User user = userRepository.findOne(userId);
        log.info(String.valueOf(user));
        if (user == null || !password.equals(user.getUserPassword())) {
            return null;
        }
        return user;
    }
}
