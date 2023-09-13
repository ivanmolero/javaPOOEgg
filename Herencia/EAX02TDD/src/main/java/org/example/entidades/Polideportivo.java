package org.example.entidades;

public class Polideportivo extends Edificio{

    private Boolean esTechado;

    public Polideportivo() {
    }

    public Polideportivo(Double ancho, Double alto, Double largo, Boolean esTechado) {
        super(ancho, alto, largo);
        this.esTechado = esTechado;
    }

    public Boolean getEsTechado() {
        return esTechado;
    }

    public void setEsTechado(Boolean esTechado) {
        this.esTechado = esTechado;
    }

    @Override
    public Double calcularSuperficie() {
        return null;
    }

    @Override
    public Double calcularVolumen() {
        return null;
    }
}
