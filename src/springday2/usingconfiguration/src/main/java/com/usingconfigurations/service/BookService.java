package com.usingconfigurations.service;

import com.usingconfigurations.dao.Book;

import java.util.List;

public interface BookService {
    public List<Book> getAllBooks();
    public Book addBook(Book book);
    public void deleteBook(int id);
    public void updateBook(int id, Book book);
    public Book getBookById(int id);
}