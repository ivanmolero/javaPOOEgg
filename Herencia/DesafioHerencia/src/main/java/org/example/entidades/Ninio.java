package org.example.entidades;

import java.time.LocalDate;

public final class Ninio extends Integrante{
    public Ninio() {
    }

    public Ninio(Integer orden, String apellido, String nombre, LocalDate nacimiento, String dni, String sexo, String vinculo, Familia perteneceFamilia) {
        super(orden, apellido, nombre, nacimiento, dni, sexo, vinculo, perteneceFamilia);
    }
}
