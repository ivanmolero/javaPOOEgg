package org.example.entidades;

public final class Yate extends Motor {
    private Integer camarotes;

    public Yate() {
    }

    public Yate(String matricula, Integer eslora, Integer fabricacion, Integer potenciaCV, Integer camarotes) {
        super(matricula, eslora, fabricacion, potenciaCV);
        this.camarotes = camarotes;
    }

    public Integer getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(Integer camarotes) {
        this.camarotes = camarotes;
    }

    @Override
    public Integer calculoModulo() {
        return super.calculoModulo() + this.camarotes;
    }
}
