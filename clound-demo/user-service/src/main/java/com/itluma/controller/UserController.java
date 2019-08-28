package com.itluma.controller;

import com.itluma.pojo.User;
import com.itluma.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author:wangjun
 * @Data:Createa in 2019/8/27 0027 21:21
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public List<User> list(){
        return userService.selectAll();
    }

    @GetMapping("get/{id}")
    public User selectOne(@PathVariable("id") int id){
        return userService.selectOne(id);
    }
}
