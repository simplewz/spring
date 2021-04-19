package org.simple.spring.transaction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;


public class Client {

    public static void main(String[] args) {
        //ApplicationContext context=new ClassPathXmlApplicationContext("classpath:spring-tx.xml");
        /*
        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService accountService = context.getBean("accountServiceImpl", AccountServiceImpl.class);
        accountService.transfer();
        */

        GenericApplicationContext genericApplicationContext=new GenericApplicationContext();
        genericApplicationContext.refresh();
        genericApplicationContext.registerBean("account",Account.class,()->new Account());
        Account account=(Account) genericApplicationContext.getBean("account");
        System.out.println(account);
    }

}
