package org.example.entidades;

public class Generador {
    private final Float cargaMaxima = Float.MAX_VALUE;
    private Float cargaActual;

    public Generador() {
        this.cargaActual = this.cargaMaxima;
    }

    public Float getCargaMaxima() {
        return cargaMaxima;
    }

    public Float getCargaActual() {
        return cargaActual;
    }

    public void setCargaActual(Float cargaActual) {
        this.cargaActual = cargaActual;
    }

    public void disminuirCarga(Float consumo) {
        this.cargaActual -= consumo;
    }
}
