package com.restaurante.ingredientes.controller;

import com.restaurante.ingredientes.model.Ingrediente;
import com.restaurante.ingredientes.service.IIngredienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ing")
public class IngredienteController {
    @Autowired
    private IIngredienteService ingService;

    @PostMapping("/crear")
    public String postIngrediente(@RequestBody Ingrediente aPostear){
        this.ingService.saveIngrediente(aPostear);
        return "ok";
    }
    @GetMapping ("/traer/{nombrePlato}")
    public List<Ingrediente> traerIngredientesByPlato (@PathVariable String nombrePlato) {
        return ingService.getIngredienteByPlato(nombrePlato);
    }
}
