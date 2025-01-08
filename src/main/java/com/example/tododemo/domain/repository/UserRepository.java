package com.example.tododemo.domain.repository;

import com.example.tododemo.domain.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserRepository {
    User findOne(String userId);
}
