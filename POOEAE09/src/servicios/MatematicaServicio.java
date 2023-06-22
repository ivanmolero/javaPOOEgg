package servicios;

import entidades.Matematica;

public class MatematicaServicio {
    public double devolverMayor(Matematica matematica) {
        return Math.max(matematica.getNum1(), matematica.getNum2());
    }

    public double devolverMenor(Matematica matematica) {
        return Math.min(matematica.getNum1(), matematica.getNum2());
    }

    public int calcularPotencia(Matematica matematica) {
        int num1 = (int)Math.round(devolverMayor(matematica));
        int num2 = (int)Math.round(devolverMenor(matematica));
        return (int)Math.pow(num1, num2);
    }

    public double calculaRaiz(Matematica matematica) {
        return Math.sqrt(Math.abs(devolverMenor(matematica)));
    }
}
