package com.bookapp.controller;

import com.bookapp.exceptions.BookNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.stream.Collectors;

@RestControllerAdvice
public class AppExHandler {
    @ExceptionHandler
    public ResponseEntity<ErrorDetails> handle404(BookNotFoundException ex){
        ErrorDetails errorDetails=
                ErrorDetails.builder().errorCode(404)
                        .timestamp(java.time.LocalDateTime.now())
                        .errorMessage(ex.getMessage()).build();
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorDetails);
    }

    @ExceptionHandler
    public ResponseEntity<ErrorDetails> handle500(Exception ex){
        ErrorDetails errorDetails=
                ErrorDetails.builder().errorCode(500)
                        .timestamp(java.time.LocalDateTime.now())
                        .errorMessage(ex.getMessage()).build();
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorDetails);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorDetails> handle400(MethodArgumentNotValidException ex){

        String errorMessage= ex.getBindingResult()
                .getAllErrors()
                .stream()
                .map(e->e.getDefaultMessage())
                .collect(Collectors.joining(", "));


        ErrorDetails errorDetails=
                ErrorDetails.builder().errorCode(400)
                        .timestamp(java.time.LocalDateTime.now())
                        .errorMessage(errorMessage).build();

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorDetails);
    }
}
