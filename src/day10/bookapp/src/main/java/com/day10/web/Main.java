package com.day10.web;

import com.day10.dao.Book;
import com.day10.service.implementations.BookServiceImplementation;

public class Main {
    public static void main (String[] args) {
        BookServiceImplementation bookServiceImplementation = new BookServiceImplementation();

        Book book1 = new Book("isbn1", "title1", "author1", 1000.0);
        System.out.println("Adding a book");
        bookServiceImplementation.addBook(book1);
        System.out.println("************\n");

        System.out.println("Getting All Books");
        bookServiceImplementation.getAllBooks().forEach(System.out::println);
        System.out.println("************\n");

        Book newBook = new Book("isbnNew", "title1", "author1", 1001);
        System.out.println("Update Book");
        bookServiceImplementation.updateBook(2, newBook);
        System.out.println(bookServiceImplementation.getBookById(2));
        System.out.println("************\n");

        System.out.println("Getting Book by ID");
        System.out.println(bookServiceImplementation.getBookById(2));
        System.out.println("************\n");

        System.out.println("Deleting Book");
        bookServiceImplementation.deleteBook(2);
        System.out.println("************\n");
    }
}
