package com.bookapp.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
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

    @NotBlank(message = "ISBN cannot be blank")
    @Size(max = 20, message = "ISBN cannot exceed 20 characters")
    @Column(name = "book_isbn", nullable = false, unique = true, length = 20)
    private String isbn;

    @Size(max = 20, message = "Book Title cannot exceed 20 characters")
    @NotBlank(message = "Title cannot be blank")
    @Column(name = "book_title", nullable = false, length = 20)
    private String title;

    @Size(max = 20, message = "Book Category cannot exceed 20 characters")
    @NotBlank(message = "Category cannot be blank")
    @Column(name = "book_category", nullable = false, length = 20)
    private String category;

    @Size(max = 20, message = "Author cannot exceed 20 characters")
    @NotBlank(message = "Author cannot be blank")
    @Column(name = "book_author", nullable = false, length = 20)
    private String author;

    @NotNull(message = "Price must be present")
    @Column(name = "book_price", nullable = false)
    @DecimalMin(value = "0.0", inclusive = false, message = "Price must be above 0")
    private BigDecimal price;
}
