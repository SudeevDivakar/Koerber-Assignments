package com.day11.service.implementations;

import com.day11.dao.Book;
import com.day11.dao.BookDao;
import com.day11.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class BookServiceImplementation implements BookService {

    private static Logger logger = LoggerFactory.getLogger(BookServiceImplementation.class);

    private BookDao bookDao;

    public BookServiceImplementation(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public List<Book> getAllBooks() {
        logger.info("Method getAllBooks() executed");
        return bookDao.getAllBooks();
    }

    @Override
    public Book addBook(Book book) {
        logger.info("Method addBook() executed");
        return bookDao.addBook(book);
    }

    @Override
    public void deleteBook(int id) {
        logger.info("Method deleteBook() executed");
        bookDao.deleteBook(id);
    }

    @Override
    public void updateBook(int id, Book book) {
        logger.info("Method updateBook() executed");
        bookDao.updateBook(id, book);
    }

    @Override
    public Book getBookById(int id) {
        logger.info("Method getBookById() executed");
        return bookDao.getBookById(id);
    }
}
