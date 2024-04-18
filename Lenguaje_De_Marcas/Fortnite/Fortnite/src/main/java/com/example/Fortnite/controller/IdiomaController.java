package com.example.Fortnite.controller;


import com.example.Fortnite.classes.*;
import com.example.Fortnite.repository.IdiomaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class IdiomaController{

    @Autowired
    private IdiomaRepository idiomaRepository;


    @GetMapping("/crear_idioma")
    public String crearIdioma(Model model){

        Idioma idioma = new Idioma();
        model.addAttribute("Idioma", idioma);

        return "crear_idioma";
    }

    @PostMapping("/guardar_idioma")
    public String guardarIdioma(@ModelAttribute Idioma idioma, Model model){

        String mensaje;

        boolean creadoCorrectamente;
        boolean existeCodigo = idiomaRepository.existsByCodigo(idioma.getCodigo());
        boolean existeNombre = idiomaRepository.existsByNombre(idioma.getNombre());

        if (existeCodigo || existeNombre){
            creadoCorrectamente = false;
            mensaje = "No se ha creado correctamente";
        }else {
            creadoCorrectamente = true;
            idiomaRepository.save(idioma);
            mensaje = "Se ha creado correctamente";
        }
        model.addAttribute("mensaje" ,mensaje);
        model.addAttribute("creado", creadoCorrectamente);
        return "guardar_idioma";
    }

}
