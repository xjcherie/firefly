package com.springboot.usercenter.controller;

import com.springboot.common.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.usercenter.service.UserService;

import javax.annotation.Resource;

/**
 * Created by Cherie on 2021/01/28
 **/
@RestController
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/users/{userId}")
    public User getUser(@PathVariable("userId") long userId) {
        return userService.getUserById(userId);
    }

    @GetMapping("/users")
    public User getUser(@RequestBody User user) {
        return userService.createUser(user);
    }

}
