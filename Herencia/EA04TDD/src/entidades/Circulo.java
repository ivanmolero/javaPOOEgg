package entidades;

import interfaces.CalculoFormas;

public class Circulo implements CalculoFormas{
    private Double radio;

    public Circulo() {
    }

    public Circulo(Double radio) {
        this.radio = radio;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        if (radio < 0) radio = 0.0;
        this.radio = radio;
    }

    @Override
    public Double calcularArea() {
        return this.radio * this.radio * PI;
    }

    @Override
    public Double calcularPerimetro() {
        return PI * (2 * this.radio);
    }
}
