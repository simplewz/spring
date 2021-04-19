package org.simple.spring.jdbc;

public interface BookService {

    public int addBook(Book book);

    public int updateBook(Book book);

    public int deleteByBookID(Integer bookID);

}
