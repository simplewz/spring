package org.simple.spring.transaction;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(locations = "classpath:spring-tx.xml")
//@ExtendWith(SpringExtension.class)
//@ContextConfiguration(locations = "classpath:spring-tx.xml")
public class TestJunit5 {

    @Autowired
    private AccountService accountService;

    @Test
    public void testTransfer(){
        accountService.transfer();
    }
}
