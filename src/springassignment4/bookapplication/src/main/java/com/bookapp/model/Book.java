package com.bookapp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "book_title")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "book_isbn", nullable = false, unique = true, length = 20)
    private String isbn;

    @Column(name = "book_title", nullable = false, length = 20)
    private String title;

    @Column(name = "book_category", nullable = false, length = 20)
    private String category;

    @Column(name = "book_author", nullable = false, length = 20)
    private String author;

    @Column(name = "book_price", nullable = false)
    private BigDecimal price;
}
