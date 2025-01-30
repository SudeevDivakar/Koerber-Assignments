package com.bookapp.service;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.repo.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    private BookRepository bookRepo;

    @Autowired
    public BookServiceImpl(BookRepository bookRepo) {
        this.bookRepo = bookRepo;
    }

    @Override
    public List<Book> getAll() {
        return bookRepo.findAll();
    }

    @Override
    public Book getById(int id) {
        return bookRepo.findById(id)
                .orElseThrow(() -> new BookNotFoundException("Book with id " + id + " not present in database"));
    }

    @Override
    public Book save(Book book) {
        bookRepo.save(book);
        return book;
    }

    @Override
    public void deleteById(int id) {
        bookRepo.deleteById(id);
    }

    @Override
    public Book updateById(Book book, int id) {
        Book bookToUpdate = getById(id);
        bookToUpdate.setId(id);
        bookRepo.save(bookToUpdate);
        return book;
    }
}
