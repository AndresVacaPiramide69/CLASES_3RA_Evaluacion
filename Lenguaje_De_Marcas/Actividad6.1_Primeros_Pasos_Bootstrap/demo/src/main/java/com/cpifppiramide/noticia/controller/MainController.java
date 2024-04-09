package com.cpifppiramide.noticia.controller;

import com.cpifppiramide.noticia.Classes.Noticia;
import com.cpifppiramide.noticia.Classes.Persona;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/index")
    public String index(Model model){
        Persona persona = new Persona("Andres", "Vaca", 20);
        model.addAttribute("persona", persona);
        return "index";
    }

    @GetMapping("/noticia_moviles")
    public String noticia_moviles(Model model){
        String titulo = "Los 25 móviles con los diseños más locos que se han visto";
        String descripcion = "Aunque casi todos los móviles nos parezcan iguales, hay algunos que se salen de la norma...";
        String imagen = "https://i.blogs.es/3234d3/1366_2000/1200_800.webp";

        Noticia noticia = new Noticia(titulo, descripcion, imagen);

        model.addAttribute("Noticia", noticia);
        return "noticia_moviles";
    }
}
