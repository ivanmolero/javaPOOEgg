package org.example;

import org.example.entidades.*;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        Rectangulo rectangulo = new Rectangulo();
        Pared pared = new Pared();
        mostrarArea(circulo);
        mostrarArea(rectangulo);
        mostrarArea(pared);
    }

    public static void mostrarArea(CalculoGeometrico cg){
        System.out.println("area es: " + cg.area());
    }
}