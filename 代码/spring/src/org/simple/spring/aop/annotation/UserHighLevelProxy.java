package org.simple.spring.aop.annotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class UserHighLevelProxy {

    @Before(value = "execution(* org.simple.spring.aop.annotation.UserDao.add(..))")
    public void before(){
        System.out.println("UserHighLevelProxy......");
    }

}
