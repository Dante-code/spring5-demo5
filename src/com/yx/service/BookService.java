package com.yx.service;

import com.yx.dao.BookDao;
import com.yx.entiy.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    //注入dao
    @Autowired
    private BookDao bookDao;

//    添加的方法
    public void addBook(Book book){
        bookDao.add(book);
    }

    public void updateBook(Book book){
        bookDao.updateBook(book);
    }

    public void deleteBook(String id){
        bookDao.delete(id);
    }

    public int findCount(){
        return bookDao.selectCount();
    }

    public Book findOne(String id){
        return bookDao.findBookInfo(id);
    }
//    查询返回集合
    public List<Book> findAll(){
        return bookDao.findAllBookInfo();
    }

//    批量添加
    public void batchAdd(List<Object[]> batchArgs){
        bookDao.batchAddBook(batchArgs);
    }

//    批量修改
    public void batchUpdate(List<Object[]> batchArgs){
        bookDao.batchUpdateBook(batchArgs);
    }

//    批量删除
    public void batchDelete(List<Object[]> batchArgs){
        bookDao.batchDeleteBook(batchArgs);
    }
}
