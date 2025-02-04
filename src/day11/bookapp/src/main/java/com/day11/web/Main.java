package com.day11.web;

import com.day11.dao.Book;
import com.day11.dao.BookDao;
import com.day11.dao.implementations.BookDaoImplementation;
import com.day11.service.BookService;
import com.day11.service.implementations.BookServiceImplementation;

public class Main {
    public static void main (String[] args) {
        BookDao bookDao = new BookDaoImplementation();
        BookService bookService = new BookServiceImplementation(bookDao);

        Book book1 = new Book("isbn1", "title1", "author1", 1000.0);
        System.out.println("Adding a book");
        System.out.println(bookService.addBook(book1));
        System.out.println("************\n");

        System.out.println("Getting All Books");
        bookService.getAllBooks().forEach(System.out::println);
        System.out.println("************\n");

        Book newBook = new Book("isbnNew", "title1", "author1", 1001);
        System.out.println("Update Book");
        bookService.updateBook(2, newBook);
        System.out.println(bookService.getBookById(2));
        System.out.println("************\n");

        System.out.println("Getting Book by ID");
        System.out.println(bookService.getBookById(2));
        System.out.println("************\n");

        System.out.println("Deleting Book");
        bookService.deleteBook(2);
        System.out.println("************\n");
    }
}
