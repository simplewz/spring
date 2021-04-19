package org.simple.spring.aop.xml;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

public class UserDaoProxy {

    public void before(){
        System.out.println("before......");
    }


    public void after(){
        System.out.println("after......");
    }


    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕之前......");
        proceedingJoinPoint.proceed();
        System.out.println("环绕之后......");
    }


    public void afterReturning(){
        System.out.println("afterReturning......");
    }


    public void afterThrowing(){
        System.out.println("afterThrowing......");
    }
}
