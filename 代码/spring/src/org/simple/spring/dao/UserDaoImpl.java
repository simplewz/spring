package org.simple.spring.dao;

import org.simple.spring.entity.User;

public class UserDaoImpl implements UserDao{

    @Override
    public void insert(User user) {
        System.out.println("UserDao Insert ......");
    }
}
