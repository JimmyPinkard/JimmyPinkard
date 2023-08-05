package com.jimmy.web.controller.error;

import com.jimmy.web.controller.response.EmailResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class EmailControllerExceptionHandler {
    @ExceptionHandler(value = SendEmailException.class)
    public ResponseEntity<EmailResponse> handleSendEmail(Exception e) {
        return ResponseEntity.badRequest().body(new EmailResponse(e.getMessage()));
    }
}
