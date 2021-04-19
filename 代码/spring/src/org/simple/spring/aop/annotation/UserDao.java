package org.simple.spring.aop.annotation;

import org.springframework.stereotype.Component;

@Component
public class UserDao {

    public int add(){
        System.out.println("调用方法......");
        return 1;
    }

}
