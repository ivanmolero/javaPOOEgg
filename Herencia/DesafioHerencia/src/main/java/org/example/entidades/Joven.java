package org.example.entidades;

import java.time.LocalDate;

public final class Joven extends Integrante{
    private String estudia;
    private Boolean deporte;
    private Boolean trabaja;

    public Joven() {
    }

    public Joven(Integer orden, String apellido, String nombre, LocalDate nacimiento, String dni, String sexo, String vinculo, Familia perteneceFamilia, String estudia, Boolean deporte, Boolean trabaja) {
        super(orden, apellido, nombre, nacimiento, dni, sexo, vinculo, perteneceFamilia);
        this.estudia = estudia;
        this.deporte = deporte;
        this.trabaja = trabaja;
    }

    public String getEstudia() {
        return estudia;
    }

    public void setEstudia(String estudia) {
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
}
