package com.pjatk.Osk.Nie.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<String> handleNullException(NullPointerException ex) {
        return new ResponseEntity<>("Null error was thrown: " + ex.getLocalizedMessage(),HttpStatus.NOT_FOUND);
    }

}
