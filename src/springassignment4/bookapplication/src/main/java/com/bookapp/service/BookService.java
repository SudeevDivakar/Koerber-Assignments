package com.bookapp.service;

import com.bookapp.model.Book;

import java.util.List;

public interface BookService {
    public List<Book> getAll();
    public Book getById(int id);
    public Book save(Book book);
    public void deleteById(int id);
    public Book updateById(Book book, int id);
}
