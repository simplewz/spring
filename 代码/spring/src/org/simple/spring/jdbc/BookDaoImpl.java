package org.simple.spring.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDaoImpl implements BookDao{

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public int addBook(Book book) {
        String sql="insert into book values(?,?,?,?)";
        Object[] args=new Object[]{book.getBookID(),book.getBookName(),book.getBookCounts(),book.getDetail()};
        return jdbcTemplate.update(sql,args);
    }

    @Override
    public int updateByBookID(Book book) {
        String sql="update book set bookName=?,bookCounts=?,detail=? where bookID=?";
        Object[] args=new Object[]{book.getBookName(),book.getBookCounts(),book.getDetail(),book.getBookID()};
        return jdbcTemplate.update(sql,args);
    }

    @Override
    public int deleteByBookID(Integer bookID) {
        String sql="delete from book where bookID = ?";
        Object[] args=new Object[]{bookID};
        return jdbcTemplate.update(sql,args);
    }

    @Override
    public String selectBookNameByBookID(Integer bookID) {
        String sql="select bookName from book where bookID =?";
        Object[] args=new Object[]{bookID};
        return jdbcTemplate.queryForObject(sql,args,String.class);
    }

    @Override
    public Book selectByBookID(Integer bookID) {
        String sql = "select bookID,bookName,bookCounts,detail from book where bookID = ?";
        Object[] args=new Object[]{bookID};
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class),args);
    }

    @Override
    public List<Book> selectAll() {
        String sql ="select * from book where 1=1";
        List<Book> bookList=jdbcTemplate.query(sql,new BeanPropertyRowMapper<Book>(Book.class),null);
        return bookList;
    }

    @Override
    public int[] batchInsert(List<Object[]> batchArgs) {
        String sql="insert into book values(?,?,?,?)";
        return jdbcTemplate.batchUpdate(sql,batchArgs);
    }

    @Override
    public int[] batchUpdate(List<Object[]> batchArgs) {
        String sql="update book set bookName = ?,bookCounts = ?,detail = ? where bookID =?";
        return jdbcTemplate.batchUpdate(sql,batchArgs);
    }

    @Override
    public int[] batchDelete(List<Object[]> batchArgs) {
        String sql="delete from book where bookID = ?";
        return jdbcTemplate.batchUpdate(sql,batchArgs);
    }
}
