package org.simple.spring.transaction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Service
//@Transactional(propagation = Propagation.REQUIRED)
public class AccountServiceImpl implements AccountService{

    private static final Logger logger= LoggerFactory.getLogger(AccountServiceImpl.class);

    @Autowired
    private AccountDao accountDao;

    @Override
    public void transfer() {
        logger.info("开始转账方法");
        logger.info("账户lucy减少100");
        accountDao.reduceMoney();
        //int a=5/0;
        logger.info("账户mary增加100");
        accountDao.addMoney();
        logger.info("转账结束");
    }
}
