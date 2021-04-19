package org.simple.spring.service;

import org.simple.spring.entity.User;
import org.simple.spring.dao.UserDao;

public class UserServiceImpl implements UserService {

    UserDao userDao;

    @Override
    public void addUser(User user) {
        System.out.println("UserService addUser ......");
        userDao.insert(user);
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
