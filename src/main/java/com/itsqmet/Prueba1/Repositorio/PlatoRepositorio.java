package com.itsqmet.Prueba1.Repositorio;

import com.itsqmet.Prueba1.Entidad.Plato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlatoRepositorio extends JpaRepository <Plato, Long> {

    List<Plato> findByCategoria(String categoria);
}