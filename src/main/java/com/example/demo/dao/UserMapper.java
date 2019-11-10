package com.example.demo.dao;

import com.example.demo.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
//@Component
public interface UserMapper {

    List<User> getAllUser();
}
