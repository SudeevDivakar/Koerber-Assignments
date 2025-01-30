package com.bookapp.controller;

import com.bookapp.model.Book;
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
    public ResponseEntity<List<Book>> getBooks() {
        return ResponseEntity.status(HttpStatus.OK).body(bookService.getAll());
    }

    @GetMapping(path = "books/{id}")
    public ResponseEntity<Book> getBook(@PathVariable int id) {
        return ResponseEntity.status(HttpStatus.OK).body(bookService.getById(id));
    }

    @PostMapping(path = "books")
    public ResponseEntity<Book> addBook(@RequestBody @Valid Book book) {
        return ResponseEntity.status(HttpStatus.CREATED).body(bookService.save(book));
    }

    @PutMapping(path = "books/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable int id, @RequestBody @Valid Book book) {
        book.setId(id);
        return ResponseEntity.status(HttpStatus.OK).body(bookService.save(book));
    }

    @DeleteMapping(path = "books/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable int id) {
        bookService.deleteById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
