package com.jimmy.web.controller;

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

    @GetMapping("/contact")
    public String contact()
    {
        return "contact";
    }
}
