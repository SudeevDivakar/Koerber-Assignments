package com.aop.service.implementations;

import com.aop.dao.Book;
import com.aop.dao.BookDao;
import com.aop.service.BookService;
import com.aop.service.aspect.Loggable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "bookService")
public class BookServiceImplementation implements BookService {
    private BookDao dao;

    @Autowired
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

    @Loggable
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


