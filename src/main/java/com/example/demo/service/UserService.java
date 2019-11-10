package com.example.demo.service;

import com.example.demo.dao.UserMapper;
import com.example.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public List<User> getAllUser(){
        return userMapper.getAllUser();
    }

}
