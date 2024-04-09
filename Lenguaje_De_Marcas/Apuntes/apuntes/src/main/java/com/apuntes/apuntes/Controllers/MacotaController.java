package com.apuntes.apuntes.Controllers;

import com.apuntes.apuntes.Classes.Mascota;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MacotaController {
    @GetMapping("/create_pet")
    public String greetingForm(Model model){
        Mascota mascota = new Mascota();
        model.addAttribute("mascota", mascota);
        return "form_create_pet";
    }

    @PostMapping("/save_pet")
    public String savePet(@ModelAttribute Mascota mascota, Model model){

        String mensaje = "";
        boolean mascotaCreadaCorrectamente = true;
        try {
            mensaje = "La mascota " + mascota.getNombre() + " ha sido creada correctamente";

        }catch (Exception exception){
            mensaje = "La mascota " + mascota.getNombre() + " no ha sido creada";
            mascotaCreadaCorrectamente = false;
        }

        model.addAttribute("mensaje", mensaje);
        return "show_form_pet_status";
    }
}
