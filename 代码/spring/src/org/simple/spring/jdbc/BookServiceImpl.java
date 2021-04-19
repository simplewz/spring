package org.simple.spring.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    BookDao bookDao;

    @Override
    public int addBook(Book book) {
        return bookDao.addBook(book);
    }

    @Override
    public int updateBook(Book book) {
        return bookDao.updateByBookID(book);
    }

    @Override
    public int deleteByBookID(Integer bookID) {
        return bookDao.deleteByBookID(bookID);
    }
}
