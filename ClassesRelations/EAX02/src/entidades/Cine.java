package entidades;

import java.util.ArrayList;
import java.util.List;

public class Cine {
    private String nombreCine;
    private List<Sala> tieneSalas;

    public Cine() {
    }

    public Cine(String nombreCine) {
        this.nombreCine = nombreCine;
    }

    public String getNombreCine() {
        return nombreCine;
    }

    public void setNombreCine(String nombreCine) {
        this.nombreCine = nombreCine;
    }

    public List<Sala> getTieneSalas() {
        if (this.tieneSalas == null) this.tieneSalas = new ArrayList<>();
        return tieneSalas;
    }

    public void setTieneSalas(List<Sala> tieneSalas) {
        this.tieneSalas = tieneSalas;
    }

    @Override
    public String toString() {
        return "Cine{" +
                "nombreCine='" + nombreCine + '\'' +
                ", tieneSalas=" + tieneSalas.size() +
                '}';
    }
}
