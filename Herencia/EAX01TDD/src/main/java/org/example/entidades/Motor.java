package org.example.entidades;

public class Motor extends Barco {
    protected Integer potenciaCV;

    public Motor() {
    }

    public Motor(String matricula, Integer eslora, Integer fabricacion, Integer potenciaCV) {
        super(matricula, eslora, fabricacion);
        this.potenciaCV = potenciaCV;
    }

    public Integer getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(Integer potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    @Override
    public Integer calculoModulo() {
        return super.calculoModulo() + this.potenciaCV;
    }
}
