package com.jimmy.web.controller;

import com.jimmy.web.controller.error.SendEmailException;
import com.jimmy.web.controller.request.EmailRequest;
import com.jimmy.web.controller.response.EmailResponse;
import com.jimmy.web.service.EmailService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/email")
@AllArgsConstructor
public class EmailController
{
    private final EmailService emailService;

    @PostMapping("/send")
    public ResponseEntity<EmailResponse> sendEmail(final EmailRequest emailRequest) {
        try {
            emailService.sendSimpleMessage(emailRequest.getFrom(), emailRequest.getTo(), emailRequest.getMessage());
        } catch (Exception e) {
            throw new SendEmailException(e.getMessage(), e.getCause());
        }
        return ResponseEntity.ok(new EmailResponse("Email Sent Successfully"));
    }
}
