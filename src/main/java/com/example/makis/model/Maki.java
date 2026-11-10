package com.example.makis.model;

import java.util.UUID;

public record Maki(UUID id, String nombre, String sabor, int piezas, double precio) {
}
