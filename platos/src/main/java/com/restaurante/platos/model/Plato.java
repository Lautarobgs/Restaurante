package com.restaurante.platos.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class Plato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numeroPlato;
    private String nombre;
    private Double precio;
    private String descripcion;
    @ElementCollection(fetch = FetchType.LAZY)
    private List<String> listaIngredientes;
}
