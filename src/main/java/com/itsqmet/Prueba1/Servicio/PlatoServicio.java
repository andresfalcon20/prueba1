package com.itsqmet.Prueba1.Servicio;

import com.itsqmet.Prueba1.Entidad.Plato;
import com.itsqmet.Prueba1.Repositorio.PlatoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlatoServicio {
    @Autowired
    private PlatoRepositorio platoRepositorio;

    //Mostrar
    public List<Plato> mostrarPlatos() {
        return platoRepositorio.findAll();
    }

    //buscar por id
    public Optional<Plato> buscarPlatoPorId(Long id) {
        return platoRepositorio.findById(id);
    }

    //buscar por categoria
    public List<Plato> buscarPlatoPorCategoria(String categoria) {
        return platoRepositorio.findByCategoria(categoria);
    }

    //guardar
    public Plato guardarPlato (Plato plato) {
        return platoRepositorio.save(plato);
    }

    //eliminar
    public void eliminarPlato(Long id) {
        platoRepositorio.deleteById(id);
    }



}
