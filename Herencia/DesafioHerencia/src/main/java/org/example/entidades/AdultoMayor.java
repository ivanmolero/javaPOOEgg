package org.example.entidades;

import java.time.LocalDate;

public final class AdultoMayor extends Integrante{
    private Boolean jubilacion;

    public AdultoMayor() {
    }

    public AdultoMayor(Integer orden, String apellido, String nombre, LocalDate nacimiento, String dni, String sexo, String vinculo, Familia perteneceFamilia, Boolean jubilacion) {
        super(orden, apellido, nombre, nacimiento, dni, sexo, vinculo, perteneceFamilia);
        this.jubilacion = jubilacion;
    }

    public Boolean getJubilacion() {
        return jubilacion;
    }

    public void setJubilacion(Boolean jubilacion) {
        this.jubilacion = jubilacion;
    }
}
