package com.jimmy.web.service;

import org.springframework.stereotype.Service;

@Service
public interface EmailService {
    void sendSimpleMessage(String from, String subject, String text);
}
