package com.example.devz_resale.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    
    @GetMapping("/")
    public String index() {
        return "forward:/index.html";
    }

    @GetMapping("/home")
    public String home() {
        return "forward:/home.html";
    }

    @GetMapping("/show")
    public String show(){
        return "forward:/vechileshowcase.html";
    }

    @GetMapping("/about")
    public String about(){
        return "forward:/about.html";
    }

}