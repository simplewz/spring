package org.simple.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-jdbc.xml");
        //BookService bookService=context.getBean("bookServiceImpl",BookServiceImpl.class);
        //Book book=new Book(null,"吉他入门经典教程",1,"详细讲述吉他入门技巧");
        //bookService.addBook(book);

        //Book book=new Book(4,"吉他入门经典教程修改",2,"详细讲述吉他入门技巧修改");
        //bookService.updateBook(book);
        //bookService.deleteByBookID(4);

        BookDao bookDao=context.getBean("bookDaoImpl",BookDaoImpl.class);
        //System.out.println(bookDao.selectBookNameByBookID(2));

        //List<Book> bookList=bookDao.selectAll();
        //System.out.println(bookList);

        /*
        List<Book> bookList=new ArrayList<>();
        Book math=new Book(null,"高等数学",3,"大学高等数学比较难");
        Book compute=new Book(null,"计算机科学技术",7,"计算机科学技术");
        Book database=new Book(null,"数据库系统概论",6,"数据库系统概论");
        bookList.add(math);
        bookList.add(compute);
        bookList.add(database);
        */
        List<Object[]> batchArgs=new ArrayList<>();
        Object[] math=new Object[]{null,"高等数学",3,"大学高等数学比较难"};
        Object[] compute=new Object[]{null,"计算机科学技术",7,"计算机科学技术"};
        Object[] database=new Object[]{null,"数据库系统概论",6,"数据库系统概论"};
        batchArgs.add(math);
        batchArgs.add(compute);
        batchArgs.add(database);
        bookDao.batchInsert(batchArgs);

    }

}
