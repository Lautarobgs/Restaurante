package com.restaurante.ingredientes.service;

import com.restaurante.ingredientes.model.Ingrediente;
import com.restaurante.ingredientes.repository.IIngredienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredienteService implements IIngredienteService{
    @Autowired
    private IIngredienteRepository ingRepo;
    @Override
    public void saveIngrediente(Ingrediente i) {
        this.ingRepo.save(i);
    }

    @Override
    public List<Ingrediente> getIngredienteByPlato(String p) {
        return this.ingRepo.findByNombre(p);
    }


}
