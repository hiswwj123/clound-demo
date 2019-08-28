package com.itluma.service;

import com.itluma.dao.UserDao;
import com.itluma.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:wangjun
 * @Data:Createa in 2019/8/27 0027 21:59
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public List<User> getUsers(List<Long> ids){
        List<User> userList = new ArrayList<>();
        for (Long id:ids) {
            User user = userDao.get(id);
            userList.add(user);
        }
        System.out.println(userList);
        return userList;
    }

}
