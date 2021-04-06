package com.springboot.usercenter.service;

import com.springboot.common.User;
import org.springframework.stereotype.Service;
import com.springboot.usercenter.dao.UserMapper;

import javax.annotation.Resource;

/**
 * Created by Cherie on 2021/01/28
 **/
@Service
public class UserService {

    @Resource
    private UserMapper userMapper;

    public User getUserById(long userId) {
        return userMapper.findById(userId);
    }

    public User createUser(User user) {
        return user;
    }

}
