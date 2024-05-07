package com.restaurante.ingredientes.service;

import com.restaurante.ingredientes.model.Ingrediente;

import java.util.List;

public interface IIngredienteService {
    void saveIngrediente(Ingrediente i);
    List<Ingrediente> getIngredienteByPlato(String p);

}
