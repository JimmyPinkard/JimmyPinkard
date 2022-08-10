package com.jimmy.web;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

/**
 * Service for sending emails
 */
@Service
public class EmailService
{
    /**
     * Used to send emails
     */
    private final JavaMailSender emailSender;

    /**
     * Constructs email service
     * @param emailSender JavaMailSender instance
     */
    public EmailService(JavaMailSender emailSender)
    {
        this.emailSender = emailSender;
    }

    /**
     * Sends a simple email
     * @param from recipient
     * @param subject subject line
     * @param text message
     */
    public void sendSimpleMessage(String from, String subject, String text) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(from);
        message.setTo("jimmypinkard7@gmail.com");
        message.setSubject(subject);
        message.setText(text);
        emailSender.send(message);
    }
}
