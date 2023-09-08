package org.example.entidades;

public final class Velero extends Barco {
    private Integer mastiles;

    public Velero() {
    }

    public Velero(String matricula, Integer eslora, Integer fabricacion, Integer mastiles) {
        super(matricula, eslora, fabricacion);
        this.mastiles = mastiles;
    }

    public Integer getMastiles() {
        return mastiles;
    }

    public void setMastiles(Integer mastiles) {
        this.mastiles = mastiles;
    }

    @Override
    public Integer calculoModulo() {
        return super.calculoModulo() + this.mastiles;
    }
}
