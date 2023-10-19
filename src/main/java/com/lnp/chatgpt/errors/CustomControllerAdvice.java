package com.lnp.chatgpt.errors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomControllerAdvice {
        @ExceptionHandler(RuntimeException.class) // exception handled
        public ResponseEntity<ErrorResponse> handleOrderExceptions(
                        CharacterNotFoundException e) {

                HttpStatus status = e.getStatus();

                return new ResponseEntity<>(
                                new ErrorResponse(
                                                e.getError()),
                                status);
        }

        @ExceptionHandler(Exception.class) // exception handled
        public ResponseEntity<ErrorResponse> handleExceptions(
                        CharacterNotFoundException e) {
                return new ResponseEntity<>(
                                new ErrorResponse(
                                                e.getError()),
                                e.getStatus());
        }
}
