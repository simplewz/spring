package org.simple.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    @Value(value = "test")
    private String name;

    //@Autowired
    //@Qualifier(value = "userDao")
    @Resource
    //@Resource(name = "userDao")
    private UserDao userDao;

    public void addUser(){
        System.out.println("添加用户方法......");
        userDao.addUser();
        System.out.println(name);
    }

}
