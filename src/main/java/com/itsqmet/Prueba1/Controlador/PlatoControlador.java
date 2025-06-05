package com.itsqmet.Prueba1.Controlador;

import com.itsqmet.Prueba1.Entidad.Plato;
import com.itsqmet.Prueba1.Servicio.PlatoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/platos")
public class PlatoControlador {

    @Autowired
    private PlatoServicio platoServicio;

    // Listar platos
    @GetMapping
    public String listarPlatos(@RequestParam(name = "buscarPlato", required = false, defaultValue = "")
                               String buscarPlato, Model model){

        List<Plato> platos = platoServicio.buscarPlatoPorCategoria(buscarPlato);
        model.addAttribute("buscarPlato", buscarPlato);
        model.addAttribute("platos", platos);
        return "pages/listaMenu";
    }

    //nuevo
    @GetMapping("/formularioPlato")
    public String formularioPlato(Model model){
        model.addAttribute("plato", new Plato());
        return "pages/formularioPlato";
    }

    //guardar
    @PostMapping("/guardarPlato")
    public String crearPlato(@ModelAttribute Plato plato){
        platoServicio.guardarPlato(plato);
        return "redirect:/platos";
    }

    //editar
    @GetMapping("/editarPlato/{id}")
    public String actualizarPlato(@PathVariable Long id, Model model){
        Optional<Plato> plato = platoServicio.buscarPlatoPorId(id);
        model.addAttribute("plato", plato.orElse(null));
        return "pages/formularioPlato";
    }

    //eliminar
    @GetMapping("/eliminarPlato/{id}")
    public String eliminarPlato(@PathVariable Long id){
        platoServicio.eliminarPlato(id);
        return "redirect:/platos";
    }

}
