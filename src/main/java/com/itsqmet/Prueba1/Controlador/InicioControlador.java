package com.itsqmet.Prueba1.Controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InicioControlador {

    @GetMapping("/index")
    public String mostrarInicio(){
        return "index";
    }
}