package com.jimmy.web;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Router {

    @GetMapping("/")
    public String index()
    {
        return "index";
    }

    @GetMapping("/projects")
    public String projects()
    {
        return "projects";
    }

    @GetMapping("/work")
    public String myWork()
    {
        return "work";
    }

    @GetMapping("/about")
    public String about()
    {
        return "about";
    }

    @GetMapping(value = "/robots.txt", produces = MediaType.TEXT_PLAIN_VALUE)
    public String robots()
    {
        return "robots.txt";
    }
}
