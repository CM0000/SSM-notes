package com.itheima.service;

import com.itheima.domain.User;

import java.util.List;

public interface UserService {
    public List<User> findAll();
    public User findUserById(Integer id);
}
