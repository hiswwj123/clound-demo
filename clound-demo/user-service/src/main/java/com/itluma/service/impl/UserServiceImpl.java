package com.itluma.service.impl;

import com.itluma.mapper.UserMapper;
import com.itluma.pojo.User;
import com.itluma.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:wangjun
 * @Data:Createa in 2019/8/27 0027 21:10
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public List<User> selectAll() {
        return userMapper.selectAll();
    }

    @Override
    public User selectOne(int id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
