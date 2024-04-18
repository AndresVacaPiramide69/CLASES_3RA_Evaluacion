package com.example.Fortnite.controller;


import com.example.Fortnite.classes.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class NoticiaController {

    @GetMapping("/index")
    public String mostrar_noticias(Model model){

        ArrayList<Noticia> carruselArrayList = new ArrayList<>();

        Noticia legoFortnite = new Noticia(
                "LEGO Fortnite",
                "87,7 mil",
                "images/lego.jpg"
        );

        Noticia rocketRacing = new Noticia(
                "Rocket Racing",
                "10,7 mil",
                "images/rocket.jpg"
        );

        Noticia fortniteFestival = new Noticia(
                "Escenario Principal de Festival",
                "18,5 mil",
                "images/festival.jpg"
        );

        Noticia fortniteFestivalImprove = new Noticia(
                "Escenario de Imporvisación",
                "1,6 mil",
                "images/impro.jpg"
        );

        carruselArrayList.add(legoFortnite);
        carruselArrayList.add(rocketRacing);
        carruselArrayList.add(fortniteFestival);
        carruselArrayList.add(fortniteFestivalImprove);

        model.addAttribute("noticia", carruselArrayList);
        return "index";
    }
}
