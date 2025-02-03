package com.bookapp.controller;

import com.bookapp.dto.BookDto;
import com.bookapp.service.BookService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api")
public class BookServiceController {

    private BookService bookService;

    @Autowired
    public BookServiceController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping(path = "books")
    public ResponseEntity<List<BookDto>> getBooks() {
        return ResponseEntity.status(HttpStatus.OK).body(bookService.getAll());
    }

    @GetMapping(path = "books/{id}")
    public ResponseEntity<BookDto> getBook(@PathVariable int id) {
        return ResponseEntity.status(HttpStatus.OK).body(bookService.getById(id));
    }

    @PostMapping(path = "books")
    public ResponseEntity<BookDto> addBook(@RequestBody @Valid BookDto bookDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(bookService.save(bookDto));
    }

    @PutMapping(path = "books/{id}")
    public ResponseEntity<BookDto> updateBook(@PathVariable int id, @Valid @RequestBody BookDto bookDto) {
        bookDto.setId(id);
        return ResponseEntity.status(HttpStatus.OK).body(bookService.updateById(bookDto, id));
    }

    @DeleteMapping(path = "books/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable int id) {
        bookService.deleteById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
