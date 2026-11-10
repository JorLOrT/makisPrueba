package com.example.makis.controller;

import com.example.makis.model.Maki;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/makis")
public class MakiController {

    private final List<Maki> makis = new ArrayList<>();

    // GET /api/makis -> lista todos
    @GetMapping
    public List<Maki> listar() {
        return makis;
    }

    // POST /api/makis -> crea uno nuevo (el id lo genera el servidor)
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Maki crear(@RequestBody Maki datos) {
        Maki nuevo = new Maki(UUID.randomUUID(), datos.nombre(), datos.sabor(), datos.piezas(), datos.precio());
        makis.add(nuevo);
        return nuevo;
    }
}
