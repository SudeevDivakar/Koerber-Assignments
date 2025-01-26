package com.usingconfigurations.service.implementations;

import com.usingconfigurations.dao.Book;
import com.usingconfigurations.dao.BookDao;
import com.usingconfigurations.service.BookService;

import java.util.List;

public class BookServiceImplementation implements BookService {
    private BookDao dao;

    public BookServiceImplementation(BookDao dao) {
        this.dao = dao;
    }

    @Override
    public List<Book> getAllBooks() {
        return dao.getAllBooks();
    }

    @Override
    public Book addBook(Book book) {
        return dao.addBook(book);
    }

    @Override
    public void deleteBook(int id) {
        dao.deleteBook(id);
    }

    @Override
    public void updateBook(int id, Book book) {
        dao.updateBook(id, book);
    }

    @Override
    public Book getBookById(int id) {
        return dao.getBookById(id);
    }

}


