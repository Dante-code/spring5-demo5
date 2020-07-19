package com.yx.dao;

import com.yx.entiy.Book;

import java.util.List;

public interface BookDao {
    void add(Book book);
    void delete(String id);
    void updateBook(Book book);
    int selectCount();
    Book findBookInfo(String id);
    List<Book> findAllBookInfo();
    void batchAddBook(List<Object[]> batchArgs);

    void batchUpdateBook(List<Object[]> batchArgs);

    void batchDeleteBook(List<Object[]> batchArgs);
}
