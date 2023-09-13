package org.example.entidades;

public abstract class Edificio {
    protected Integer ancho;
    protected Integer alto;
    protected Integer largo;

    public Edificio() {
    }

    public Edificio(Integer ancho, Integer alto, Integer largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }

    public Integer getAncho() {
        return ancho;
    }

    public void setAncho(Integer ancho) {
        this.ancho = ancho;
    }

    public Integer getAlto() {
        return alto;
    }

    public void setAlto(Integer alto) {
        this.alto = alto;
    }

    public Integer getLargo() {
        return largo;
    }

    public void setLargo(Integer largo) {
        this.largo = largo;
    }

    public abstract Integer calcularSuperficie();

    public abstract Integer calcularVolumen();


}
