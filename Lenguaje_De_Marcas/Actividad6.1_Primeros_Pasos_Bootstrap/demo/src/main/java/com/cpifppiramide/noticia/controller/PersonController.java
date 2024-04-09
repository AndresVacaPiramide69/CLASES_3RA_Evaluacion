package com.cpifppiramide.noticia.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class PersonController {
    @GetMapping("/login")
    public String loginUser(){
        return "loginUser";
    }

    @GetMapping("/create_acount")
    public String createAcount(){
        return "createAcount";
    }
}
