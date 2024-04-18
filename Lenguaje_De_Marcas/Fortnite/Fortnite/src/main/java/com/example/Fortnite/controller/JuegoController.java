package com.example.Fortnite.controller;

import com.example.Fortnite.classes.Juego;
import com.example.Fortnite.repository.JuegoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class JuegoController {

    @Autowired
    private JuegoRepository juegoRepository;

    @GetMapping("/crear_juego")
    public String crearJuego(Model model){
        Juego juego = new Juego();
        model.addAttribute("Juego", juego);
        return "crear_juego";
    }

    @PostMapping("guardar_juego")
    public String guardarJuego(@ModelAttribute Juego juego, Model model){
        String mensaje;

        boolean creadoCorrectamente;
        boolean existeNombre = juegoRepository.existsByNombreJuego(juego.getNombreJuego());

        if (existeNombre){
            mensaje = "El juego no se ha creado correctamente";
            creadoCorrectamente = false;
        }else {
            mensaje = "El juego se ha podido crear";
            creadoCorrectamente = true;
            juegoRepository.save(juego);
        }

        model.addAttribute("mensaje", mensaje);
        model.addAttribute("creado", creadoCorrectamente);
        return "guardar_juego";
    }

    @GetMapping("mostrar_juego")
    public String mostrarJuego(Juego juego, Model model){
        List<Juego> juegoList = (List<Juego>) juegoRepository.findAll();

        model.addAttribute("listaJuegos", juegoList);
        return "mostrar_juego";
    }
}
