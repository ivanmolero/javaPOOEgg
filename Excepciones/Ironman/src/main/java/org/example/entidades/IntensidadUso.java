package org.example.entidades;

public enum IntensidadUso {
    BASICO(1), NORMAL(2), INTENSIVO(3);

    private Integer multiplicador;

    IntensidadUso(Integer multiplicador) {
        this.multiplicador = multiplicador;
    }

    public Integer getMultiplicador() {
        return multiplicador;
    }
}
