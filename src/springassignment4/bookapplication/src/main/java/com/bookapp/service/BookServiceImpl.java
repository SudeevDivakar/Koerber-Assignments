package com.bookapp.service;

import com.bookapp.dto.BookDto;
import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.repo.BookRepository;
import com.bookapp.util.ConverterUtil;
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
    public List<BookDto> getAll() {
        return bookRepo.findAll()
                .stream()
                .map(ConverterUtil::convertToBookDto).toList();
    }

    @Override
    public BookDto getById(int id) {
        return bookRepo.findById(id)
                .map(ConverterUtil::convertToBookDto)
                .orElseThrow(() -> new BookNotFoundException("Book with id " + id + " not present in database"));
    }

    @Override
    public BookDto save(BookDto bookDto) {
        bookRepo.save(ConverterUtil.convertToBook(bookDto));
        return bookDto;
    }

    @Override
    public void deleteById(int id) {
        bookRepo.deleteById(id);
    }

    @Override
    public BookDto updateById(BookDto bookDto, int id) {
        Book bookToUpdate = ConverterUtil.convertToBook(getById(id));
        bookToUpdate.setId(id);
        bookRepo.save(bookToUpdate);
        return bookDto;
    }
}
