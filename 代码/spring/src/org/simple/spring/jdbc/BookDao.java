package org.simple.spring.jdbc;

import java.util.List;

public interface BookDao {

    public int addBook(Book book);

    public int updateByBookID(Book book);

    public int deleteByBookID(Integer bookID);

    public String selectBookNameByBookID(Integer bookID);

    public Book selectByBookID(Integer bookID);

    public List<Book> selectAll();

    public int[] batchInsert(List<Object[]> batchArgs);

    public int[] batchUpdate(List<Object[]> batchArgs);

    public int[] batchDelete(List<Object[]> batchArgs);

}
