package com.day10.service.implementations;

import com.day10.dao.Book;
import com.day10.dao.implementations.BookDaoImplementation;
import com.day10.service.BookService;

import java.util.List;

public class BookServiceImplementation implements BookService {

    BookDaoImplementation bookDaoImplementation = new BookDaoImplementation();

    @Override
    public List<Book> getAllBooks() {
        return bookDaoImplementation.getAllBooks();
    }

    @Override
    public void addBook(Book book) {
        bookDaoImplementation.addBook(book);
    }

    @Override
    public void deleteBook(int id) {
        bookDaoImplementation.deleteBook(id);
    }

    @Override
    public void updateBook(int id, Book book) {
        bookDaoImplementation.updateBook(id, book);
    }

    @Override
    public Book getBookById(int id) {
        return bookDaoImplementation.getBookById(id);
    }
}
