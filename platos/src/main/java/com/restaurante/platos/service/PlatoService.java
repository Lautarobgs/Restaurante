package com.restaurante.platos.service;

import com.restaurante.platos.dto.IngredienteDTO;
import com.restaurante.platos.dto.PlatoDTO;
import com.restaurante.platos.model.Plato;
import com.restaurante.platos.repository.IPlatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlatoService implements IPlatoService {
    @Autowired
    private RestTemplate apiIngredientes;
    @Autowired
    private IPlatoRepository plaRepo;
    @Override
    public void savePlato(PlatoDTO p) {
        //Agarrar datos de platodto, buscar ocurrencias con el resttemplatem, guardar
        // en una clase Plato, y persistir en la DB
        Plato aIngresar = new Plato();
        aIngresar.setNombre(p.getNombre());
        aIngresar.setPrecio(p.getPrecio());
        aIngresar.setDescripcion(p.getDescripcion());
        List<String> listaNewPlato = new ArrayList<String>();

        List<IngredienteDTO> listaI = Arrays.asList(apiIngredientes.getForObject("http://localhost:9003/ingredientes/traer/" + p.getNombre(), IngredienteDTO[].class));
        for (IngredienteDTO i : listaI) {
            listaNewPlato.add(i.getNombre_ingrediente());
        }
        aIngresar.setListaIngredientes(listaNewPlato);

        plaRepo.save(aIngresar);
    }

    @Override
    public List<Plato> getPlatos() {
        return this.plaRepo.findAll();
    }
}
