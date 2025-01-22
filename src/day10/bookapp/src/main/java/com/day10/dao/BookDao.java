package com.day10.dao;

import com.day10.exceptions.DaoException;
import java.util.List;

public interface BookDao {
    public List<Book> getAllBooks()throws DaoException;
    public void addBook(Book book) throws DaoException;
    public void deleteBook(int id) throws DaoException;
    public void updateBook(int id, Book book) throws DaoException;
    public Book getBookById(int id) throws DaoException;
}
