package com.yx.test;

import com.yx.entiy.Book;
        import com.yx.service.BookService;
        import org.junit.Test;
        import org.springframework.context.ApplicationContext;
        import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class testBook {
    @Test
    public void testJdbcTemplate(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

//        插入
//        Book book = new Book();
//        book.setUserId("1");
//        book.setUsername("java");
//        book.setUstatus("a");
//        bookService.addBook(book);

//        修改
//        Book book = new Book();
//        book.setUserId("1");
//        book.setUsername("JavaScript");
//        book.setUstatus("");
//        bookService.addBook(book);

//        删除
//        bookService.deleteBook("1");

//        查询返回某个值
//        int count = bookService.findCount();
//        System.out.println(count);

//        查询返回对象
//        Book book = bookService.findOne("1");
//        System.out.println(book);

//        查询返回集合
//        List<Book> all = bookService.findAll();
//        System.out.println(all);

//        批量添加
//        List<Object[]> batchArgs = new ArrayList<>();
//        Object[] o1 = {"3","python","p"};
//        Object[] o2 = {"4","c++","c"};
//        Object[] o3 = {"5","MySQL","m"};
//        batchArgs.add(o1);
//        batchArgs.add(o2);
//        batchArgs.add(o3);
//        调用方法批量添加
//        bookService.batchAdd(batchArgs);


//        批量修改
//        List<Object[]> batchArgs = new ArrayList<>();
//        Object[] o1 = {"Vue","v","3"};
//        Object[] o2 = {"C#","#","4"};
//        Object[] o3 = {"Nuxt","n","5"};
//        batchArgs.add(o1);
//        batchArgs.add(o2);
//        batchArgs.add(o3);
//        调用方法批量修改
//        bookService.batchUpdate(batchArgs);

//        批量删除
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"3"};
        Object[] o2 = {"4"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        bookService.batchDelete(batchArgs);
    }
}