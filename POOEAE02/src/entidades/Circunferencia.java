package entidades;

import java.util.Scanner;

public class Circunferencia {
    private double radio;

    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void crearCircunferencia() {
        Scanner scan = new Scanner(System.in);
        System.out.println("CREAR CIRCUNFERENCIA");
        System.out.println("ingrese el radio");
        setRadio(scan.nextDouble());
    }

    public double area() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double perimetro() {
        return Math.PI * radio * 2;
    }
}
