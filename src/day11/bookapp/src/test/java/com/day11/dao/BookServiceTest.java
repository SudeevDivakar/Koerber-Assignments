package com.day11.dao;

import com.day11.exceptions.DaoException;
import com.day11.service.implementations.BookServiceImplementation;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class BookServiceTest {

    @Mock
    private BookDao bookDao;

    @InjectMocks
    private BookServiceImplementation bookServiceImplementation;

    private Book book;

    @BeforeEach
    void before() {
        book = new Book(1, "ISBN", "Title1", "Author1", 1000.0);
    }

    @AfterEach
    void after() {
        book = null;
    }

    @Tag("dev")
    @Test
    void getAllBooksSuccess() {
        List<Book> books = Collections.singletonList(book);
        Mockito.when(bookDao.getAllBooks()).thenReturn(books);
        List<Book> res = bookServiceImplementation.getAllBooks();
        assertEquals(1, res.size());
    }

    @Tag("dev")
    @Test
    void getAllBooksFailure() {
        Mockito.when(bookDao.getAllBooks()).thenThrow(new DaoException("No Books in Database"));
        assertThrows(DaoException.class, () -> bookServiceImplementation.getAllBooks());
    }

    @Tag("dev")
    @Test
    void addBook() {
        Mockito.when(bookDao.addBook(book)).thenReturn(book);
        Book res = bookServiceImplementation.addBook(book);
        assertNotNull(res);
        assertEquals(book, res);
    }


    @Tag("dev")
    @Test
    void getBookByIdSuccess() {
        int id = 1;
        Mockito.when(bookDao.getBookById(id)).thenReturn(book);
        Book res = bookServiceImplementation.getBookById(id);
        assertNotNull(res);
        assertEquals(book, res);
    }

    @Tag("dev")
    @Test
    void getBookByIdFailure() {
        int id = 1;
        Mockito.when(bookDao.getBookById(id)).thenThrow(new DaoException("Book not Found in Database"));
        assertThrows(DaoException.class, () -> bookServiceImplementation.getBookById(id));
    }

}
