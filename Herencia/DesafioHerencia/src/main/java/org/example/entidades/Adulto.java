package org.example.entidades;

import java.time.LocalDate;

public final class Adulto extends Integrante{
    private Boolean estudia;
    private Boolean deporte;
    private Boolean trabaja;
    private Boolean obraSocial;

    public Adulto() {
    }

    public Adulto(Integer orden, String apellido, String nombre, LocalDate nacimiento, String dni, String sexo, String vinculo, Familia perteneceFamilia, Boolean estudia, Boolean deporte, Boolean trabaja, Boolean obraSocial) {
        super(orden, apellido, nombre, nacimiento, dni, sexo, vinculo, perteneceFamilia);
        this.estudia = estudia;
        this.deporte = deporte;
        this.trabaja = trabaja;
        this.obraSocial = obraSocial;
    }

    public Boolean getEstudia() {
        return estudia;
    }

    public void setEstudia(Boolean estudia) {
        this.estudia = estudia;
    }

    public Boolean getDeporte() {
        return deporte;
    }

    public void setDeporte(Boolean deporte) {
        this.deporte = deporte;
    }

    public Boolean getTrabaja() {
        return trabaja;
    }

    public void setTrabaja(Boolean trabaja) {
        this.trabaja = trabaja;
    }

    public Boolean getObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(Boolean obraSocial) {
        this.obraSocial = obraSocial;
    }
}
