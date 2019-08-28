package com.itluma.service;

import com.itluma.pojo.User;

import java.util.List;

/**
 * @Author:wangjun
 * @Data:Createa in 2019/8/27 0027 21:10
 */
public interface UserService {
    List<User> selectAll();
    User selectOne(int id);
}
