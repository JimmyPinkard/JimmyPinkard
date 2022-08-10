package com.jimmy.web;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/email")
public class EmailController
{
    private final EmailService emailService;

    public EmailController(EmailService emailService)
    {
        this.emailService = emailService;
    }

    @PostMapping("/send")
    public void sendEmail(final Map<String, Object> body)
    {
        System.out.println("HI!");
        emailService.sendSimpleMessage((String) body.get("from"),
                (String) body.get("subject"), (String) body.get("message"));
    }
}
