package com.example.MyBookShopApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InfoController {
    @GetMapping("/faq")
    public String faq(){
        return "/faq";
    }

    @GetMapping("/about")
    public String about(){
        return "/about";
    }

    @GetMapping("/contacts")
    public String contacts(){
        return "/contacts";
    }

    @GetMapping("/documents/index")
    public String documents(){
        return "/documents/index";
    }

}
