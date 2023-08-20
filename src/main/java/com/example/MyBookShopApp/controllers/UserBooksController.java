package com.example.MyBookShopApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserBooksController {
    @GetMapping("/cart")
    public String cart(){
        return "/cart";
    }
    @GetMapping("/postponed")
    public String postponed(){
        return "/postponed";
    }
}
