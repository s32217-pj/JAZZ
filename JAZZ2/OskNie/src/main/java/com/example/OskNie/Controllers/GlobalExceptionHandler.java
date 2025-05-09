package com.example.OskNie.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<String> handleNullException(NullPointerException ex) {
        return ResponseEntity.badRequest().body("Null error was thrown: " + ex.getLocalizedMessage());
    }
    
}
