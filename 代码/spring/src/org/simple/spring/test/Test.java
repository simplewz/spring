package org.simple.spring.test;

import org.simple.spring.aop.xml.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        //通过Spring的配置文件创建Spring容器
        ApplicationContext context=new ClassPathXmlApplicationContext("aop-xml.xml");
        //ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
        //获取Spring容器中配置的对象
        UserDao userDao = context.getBean("userDao",UserDao.class);
        //通过对象进行业务操作
        userDao.add();
    }
}
