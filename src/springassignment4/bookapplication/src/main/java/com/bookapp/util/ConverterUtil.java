package com.bookapp.util;

import com.bookapp.dto.BookDto;
import com.bookapp.model.Book;

public class ConverterUtil {
    public static BookDto convertToBookDto(Book book) {
        BookDto bookDto = new BookDto();
        bookDto.setId(book.getId());
        bookDto.setIsbn(book.getIsbn());
        bookDto.setAuthor(book.getAuthor());
        bookDto.setCategory(book.getCategory());
        bookDto.setTitle(book.getTitle());
        bookDto.setPrice(book.getPrice());
        return bookDto;
    }

    public static Book convertToBook(BookDto bookDto) {
        Book book = new Book();
        book.setId(bookDto.getId());
        book.setIsbn(bookDto.getIsbn());
        book.setAuthor(bookDto.getAuthor());
        book.setCategory(bookDto.getCategory());
        book.setTitle(bookDto.getTitle());
        book.setPrice(bookDto.getPrice());
        return book;
    }
}
