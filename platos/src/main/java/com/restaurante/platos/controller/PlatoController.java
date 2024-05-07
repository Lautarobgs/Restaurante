package com.restaurante.platos.controller;

import com.restaurante.platos.dto.PlatoDTO;
import com.restaurante.platos.model.Plato;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/platos")
public class PlatoController {
    ///post y get post debe buscar ocurrencias en ingredientes
    @PostMapping("/crear")
    public String crearPlato(@RequestBody PlatoDTO p){

        return "ok";
    }
    @GetMapping("/traer")
    public List<Plato> traerPlato(){
        return null;
    }
}
