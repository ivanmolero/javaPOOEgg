package servicios;

import entidades.Ecuacion2do;

import java.util.Scanner;

public class Ecuacion2doServicio {
    Scanner scan = new Scanner(System.in);
    public Ecuacion2do crearEcuacion() {
        Ecuacion2do ecuacion = new Ecuacion2do();
        System.out.println("Crear ecuación: ");
        System.out.println("ingrese el primer coeficiente (a): ");
        ecuacion.setA(Double.parseDouble(scan.nextLine()));
        System.out.println("ingrese el segundo coeficiente (b): ");
        ecuacion.setB(Double.parseDouble(scan.nextLine()));
        System.out.println("ingrese el tercer coeficiente (c): ");
        ecuacion.setC(Double.parseDouble(scan.nextLine()));
        return ecuacion;
    }

    public double getDiscriminante(Ecuacion2do ecuacion) {
        return Math.pow(ecuacion.getB(), 2) - 4 * ecuacion.getA() * ecuacion.getC();
    }

    public boolean tieneRaices(Ecuacion2do ecuacion) {
        return getDiscriminante(ecuacion) > 0;
    }

    public boolean tieneRaiz(Ecuacion2do ecuacion) {
        return getDiscriminante(ecuacion) == 0;
    }

    public void obtenerRaices(Ecuacion2do ecuacion) {
        if (tieneRaices(ecuacion)) {
            System.out.println("las dos soluciones son: ");
            double s1 = (-ecuacion.getB() + Math.sqrt(getDiscriminante(ecuacion))) / (2 * ecuacion.getA());
            double s2 = (-ecuacion.getB() - Math.sqrt(getDiscriminante(ecuacion))) / (2 * ecuacion.getA());
            System.out.println("solucion 1: " + s1);
            System.out.println("solucion 2: " + s2);
        }
    }

    public void obtenerRaiz(Ecuacion2do ecuacion) {
        if (tieneRaiz(ecuacion)) {
            double s = -ecuacion.getB() / (2 * ecuacion.getA());
            System.out.println("la solucion de la ecuación es: " + s);
        }
    }

    public void calcular(Ecuacion2do ecuacion) {
        if (tieneRaiz(ecuacion)) {
            obtenerRaiz(ecuacion);
        } else if (tieneRaices(ecuacion)) {
            obtenerRaices(ecuacion);
        } else {
            System.out.println("la ecuación no tiene solucion real");
        }
    }
}
