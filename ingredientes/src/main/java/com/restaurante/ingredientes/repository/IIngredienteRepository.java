package com.restaurante.ingredientes.repository;

import com.restaurante.ingredientes.model.Ingrediente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Repository
public interface IIngredienteRepository extends JpaRepository<Ingrediente,Long> {
    @Query("SELECT i FROM Ingrediente i WHERE :plato MEMBER OF i.platos")
    List<Ingrediente> findByNombre(String plato);
}
