package com.usingannotations.controller;

import com.usingannotations.dao.Book;
import com.usingannotations.service.implementations.BookServiceImplementation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        BookServiceImplementation bookService = (BookServiceImplementation) ctx.getBean("bookService");

        System.out.println("Getting All Books:");
        bookService.getAllBooks().forEach(System.out::println);
        System.out.println("******************\n");

        System.out.println("Adding two new books:");
        bookService.addBook(new Book(1, "isbn3", "title3", "author3", 1000.0));
        bookService.addBook(new Book(1, "isbn4", "title4", "author4", 1500.0));   // id of book does not matter since it is set automatically
        bookService.getAllBooks().forEach(System.out::println);
        System.out.println("******************\n");

        System.out.println("Update Book with id = 3:");
        bookService.updateBook(3, new Book(3, "newIsbn", "newTitle", "newauthor", 2000.0));
        System.out.println("******************\n");

        System.out.println("Get Book with id = 3:");
        System.out.println(bookService.getBookById(3));
        System.out.println("******************\n");

        System.out.println("Delete Book with id = 4");
        bookService.deleteBook(4);
        System.out.println("******************\n");
    }
}
