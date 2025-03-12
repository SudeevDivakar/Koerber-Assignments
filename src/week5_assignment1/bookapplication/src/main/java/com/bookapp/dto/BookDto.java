package com.bookapp.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookDto {
    private int id;

    @NotBlank(message = "ISBN cannot be blank")
    @Size(max = 20, message = "ISBN cannot exceed 20 characters")
    private String isbn;

    @Size(max = 20, message = "Book Title cannot exceed 20 characters")
    @NotBlank(message = "Title cannot be blank")
    private String title;

    @Size(max = 20, message = "Book Category cannot exceed 20 characters")
    @NotBlank(message = "Category cannot be blank")
    private String category;

    @Size(max = 20, message = "Author cannot exceed 20 characters")
    @NotBlank(message = "Author cannot be blank")
    private String author;

    @NotNull(message = "Price must be present")
    @DecimalMin(value = "0.0", inclusive = false, message = "Price must be above 0")
    private BigDecimal price;
}
