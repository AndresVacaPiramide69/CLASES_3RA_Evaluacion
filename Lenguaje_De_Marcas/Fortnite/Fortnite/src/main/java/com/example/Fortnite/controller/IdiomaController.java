package com.example.Fortnite.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IdiomaController {

    @GetMapping("/crear_idioma.html")
        public String crear_idioma(Model model){
            return "crear_idioma";

    }
}
