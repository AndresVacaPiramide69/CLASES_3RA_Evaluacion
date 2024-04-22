package com.example.Fortnite.controller;
import com.example.Fortnite.classes.*;

import com.example.Fortnite.repository.TarjetaDeCreditoRepository;
import com.example.Fortnite.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsuarioController {

    @Autowired
    TarjetaDeCreditoRepository tarjetaDeCreditoRepository;

    @Autowired
    UsuarioRepository usuarioRepository;

    @GetMapping("crear_metodo_pago_usuario")
    public String crearUsuario(Usuario usuario, TarjetaDeCredito tarjetaDeCredito, Model model){
        
        model.addAttribute("usuario", usuario);
        return "crear_metodo_pago_usuario";
    }

    @PostMapping("guardar_metodo_pago_usuario")
    public String guardarTarjetaDeCreditoUsuario(@ModelAttribute Usuario usuario, Model model){

        return "guardar_metodo_pago_usuario";
    }
}
