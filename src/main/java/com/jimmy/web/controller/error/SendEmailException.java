package com.jimmy.web.controller.error;

public class SendEmailException extends RuntimeException {


    public SendEmailException(String message) {
        super(message);
    }

    public SendEmailException(String message, Throwable cause) {
        super(message, cause);
    }
}
