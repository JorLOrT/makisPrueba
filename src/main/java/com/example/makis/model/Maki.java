package com.example.makis.model;

import java.util.UUID;

public class Maki {

    private UUID id;
    private String nombre;
    private String sabor;
    private Integer piezas;
    private Double precio;

    // Constructor vacío: lo usa Jackson para convertir el JSON en un Maki
    public Maki() {
    }

    public Maki(UUID id, String nombre, String sabor, Integer piezas, Double precio) {
        this.id = id;
        this.nombre = nombre;
        this.sabor = sabor;
        this.piezas = piezas;
        this.precio = precio;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public Integer getPiezas() {
        return piezas;
    }

    public void setPiezas(Integer piezas) {
        this.piezas = piezas;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
