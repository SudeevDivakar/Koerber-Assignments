package com.bookapp.service;

import com.bookapp.dto.BookDto;

import java.util.List;

public interface BookService {
    public List<BookDto> getAll();
    public BookDto getById(int id);
    public BookDto save(BookDto bookDto);
    public void deleteById(int id);
    public BookDto updateById(BookDto bookDto, int id);
}
