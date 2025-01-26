package com.usingconfigurations.config;

import com.usingconfigurations.dao.Book;
import com.usingconfigurations.dao.BookDao;
import com.usingconfigurations.dao.implementations.BookDaoImplementation;
import com.usingconfigurations.service.BookService;
import com.usingconfigurations.service.implementations.BookServiceImplementation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;


@Configuration
@ComponentScan(basePackages = {"com.usingconfigurations"})
public class AppConfig {
    @Bean
    public Map<Integer, Book> getBooksMap() {
        Map<Integer, Book> booksMap = new HashMap<Integer, Book>();
        booksMap.put(1, new Book(1, "ABC123", "Head first Java" , "Katthy", 600));
        booksMap.put(2,  new Book(2, "ABC723", "Servlet jsp Java" , "Katthy", 700));
        return booksMap;
    }

    @Bean
    public BookDao bookDao(Map<Integer, Book> books) {
        return new BookDaoImplementation(books, 2);
    }

    @Bean(value = "bookService")
    public BookService getBookService(BookDao bookDao) {
        return new BookServiceImplementation(bookDao);
    }

}
