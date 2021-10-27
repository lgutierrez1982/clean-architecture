package com.example.cleanarchitecture.application.presentation.handler;

import com.example.cleanarchitecture.common.MyError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpClientErrorException;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestControllerAdvice
public class CharacterErrorHandler {

    @ExceptionHandler(value = { MethodArgumentNotValidException.class })
    public ResponseEntity<MyError> handleException(MethodArgumentNotValidException ex) {
        List<String> errors = new ArrayList<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            errors.add(error.getDefaultMessage());
        });

        MyError error = new MyError(
                HttpStatus.I_AM_A_TEAPOT.value(),
                new Date(),
                errors,
                ex.getNestedPath()
        );
        return new ResponseEntity<>(error, HttpStatus.I_AM_A_TEAPOT);
    }

    //not Found
    @ExceptionHandler(value = { HttpClientErrorException.class })
    public ResponseEntity<MyError> handleException(HttpClientErrorException ex) {

        List<String> errors = new ArrayList<>();

        errors.add(ex.getResponseBodyAsString());

        MyError error = new MyError(
                HttpStatus.I_AM_A_TEAPOT.value(),
                new Date(),
                errors,
                ex.getMessage()
        );
        return new ResponseEntity<>(error, HttpStatus.I_AM_A_TEAPOT);
    }
}
