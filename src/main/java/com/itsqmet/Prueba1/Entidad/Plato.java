package com.itsqmet.Prueba1.Entidad;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name = "platos")

public class Plato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max = 100)
    private String nombre;


    @Size(max = 500)
    private String descripcion;

    @NotNull

    private int precio;

    @NotBlank
    @Size(max = 50)
    private String categoria;


    private String disponible;
}
