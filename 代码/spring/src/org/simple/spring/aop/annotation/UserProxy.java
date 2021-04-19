package org.simple.spring.aop.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UserProxy {

    @Before(value = "execution(* org.simple.spring.aop.annotation.UserDao.add(..))")
    public void before(){
        System.out.println("before......");
    }

    @After(value = "execution(* org.simple.spring.aop.annotation.UserDao.add(..))")
    public void after(){
        System.out.println("after......");
    }

    @Around(value = "execution(* org.simple.spring.aop.annotation.UserDao.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕之前......");
        proceedingJoinPoint.proceed();
        System.out.println("环绕之后......");
    }

    @AfterReturning(value = "execution(* org.simple.spring.aop.annotation.UserDao.add(..))")
    public void afterReturning(){
        System.out.println("afterReturning......");
    }

    @AfterThrowing(value = "execution(* org.simple.spring.aop.annotation.UserDao.add(..))")
    public void afterThrowing(){
        System.out.println("afterThrowing......");
    }
}
