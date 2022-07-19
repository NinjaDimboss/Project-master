package com.example.project.controllers.handler;

import com.example.project.core.exception.MahmudException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class UserControllerAdvice {

    @ExceptionHandler(MahmudException.class)
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public ResponseEntity<?> handlerException(MahmudException exception, WebRequest request){
        return new ResponseEntity<>(exception.getMessage(),HttpStatus.FORBIDDEN);
    }
}
