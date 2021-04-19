package org.simple.spring.annotation;

import org.springframework.stereotype.Repository;

@Repository(value = "userDao")
public class UserDaoImpl implements UserDao {

    @Override
    public void addUser() {
        System.out.println("UserDao addUser......");
    }
}
