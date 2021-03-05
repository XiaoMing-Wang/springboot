package com.wd.springboot_1.service;

import com.wd.springboot_1.dao.UserDao;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service

//业务逻辑层
public class UserService {

    @Resource
    private UserDao userDao;

    public void test() {
        System.out.println("UserService");
        userDao.test();
    }

}
