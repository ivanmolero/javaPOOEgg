package entidades;

import interfaces.CalculoFormas;

public class Rectangulo implements CalculoFormas {
    private Double base;
    private Double altura;

    public Rectangulo() {
    }

    public Rectangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public Double calcularArea() {
        return this.altura * this.base;
    }

    @Override
    public Double calcularPerimetro() {
        return 2 * (this.altura + this.base);
    }
}
