package com.usingxml.service.implementations;

import com.usingxml.dao.Book;
import com.usingxml.dao.BookDao;
import com.usingxml.service.BookService;
import lombok.Setter;

import java.util.List;

@Setter
public  class BookServiceImplementation implements BookService {
    private BookDao dao;

    public void setDao (BookDao dao) {
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


