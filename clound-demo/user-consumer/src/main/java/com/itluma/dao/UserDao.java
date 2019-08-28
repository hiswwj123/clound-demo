package com.itluma.dao;

import com.itluma.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @Author:wangjun
 * @Data:Createa in 2019/8/27 0027 21:53
 */
@Component
public class UserDao {
    @Autowired
    private RestTemplate restTemplate;

    public User get(Long id){
        return restTemplate.getForObject("http://localhost:8081/user/get/"+id,User.class);
    }

}
