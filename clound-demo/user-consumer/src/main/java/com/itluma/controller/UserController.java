package com.itluma.controller;

import com.itluma.pojo.User;
import com.itluma.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author:wangjun
 * @Data:Createa in 2019/8/27 0027 22:04
 */
@RestController
@RequestMapping("/consumer")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/get")
    public List<User> getUser(@RequestParam("ids") List<Long> ids){
        System.out.println(ids);
        return userService.getUsers(ids);
    }
}
