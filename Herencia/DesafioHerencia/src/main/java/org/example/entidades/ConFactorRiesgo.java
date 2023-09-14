package org.example.entidades;

import java.util.ArrayList;
import java.util.List;

public final class ConFactorRiesgo extends Familia{
    private List<Integer> factores;

    public ConFactorRiesgo() {
        super();
        this.factores = new ArrayList<>();
    }

    public List<Integer> getFactores() {
        return factores;
    }

    public void setFactores(List<Integer> factores) {
        this.factores = factores;
    }

    public void mostrarFactores() {

    }
}
