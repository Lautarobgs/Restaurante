package com.restaurante.ingredientes.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class PlatosDTO {
    private String nombre;
    private Double precio;
    private String descripcion;
}
