package com.restaurante.platos.service;

import com.restaurante.platos.dto.PlatoDTO;
import com.restaurante.platos.model.Plato;

import java.util.List;

public interface IPlatoService {
    void savePlato(PlatoDTO p);
    List<Plato> getPlatos();
}
