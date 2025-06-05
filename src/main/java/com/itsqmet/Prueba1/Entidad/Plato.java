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


    @NotBlank(message = "El nombre no puede estar vacío")
    @Size(max = 100)
    private String nombre;

    @Size(max = 500, message = "La descripción debe tener máximo 500 caracteres")
    private String descripcion;

    @NotNull(message = "El precio es obligatorio")
    private int precio;

    @NotBlank(message = "La categoría no puede estar vacía")
    @Size(max = 50, message = "La categoría debe tener máximo 50 caracteres")
    private String categoria;

    @NotNull(message = "Debe indicar si el plato está disponible")
    private Boolean disponible;


}
