package com.usingconfigurations.dao.implementations;

import com.usingconfigurations.dao.Book;
import com.usingconfigurations.dao.BookDao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BookDaoImplementation implements BookDao {
    private Map<Integer, Book> booksMap;
    private int counter;

    public BookDaoImplementation(Map<Integer, Book> booksMap, int counter) {
        this.booksMap = booksMap;
        this.counter = counter;
    }

    @Override
    public List<Book> getAllBooks() {
        return new ArrayList<Book>(booksMap.values());
    }

    @Override
    public Book addBook(Book book) {
        book.setId(++counter);
        booksMap.put(counter, book);
        return booksMap.get(counter);
    }

    @Override
    public void deleteBook(int id) {
        booksMap.remove(id);
    }

    @Override
    public void updateBook(int id, Book book) {
        booksMap.put(id, book);
    }

    @Override
    public Book getBookById(int id) {
        return booksMap.get(id);
    }

}

