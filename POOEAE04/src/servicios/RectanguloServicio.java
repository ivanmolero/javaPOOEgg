package servicios;

import entidades.Rectangulo;

import java.util.Scanner;

public class RectanguloServicio {
    Scanner scan = new Scanner(System.in);

    public Rectangulo crearRectangulo() {
        Rectangulo rectangulo = new Rectangulo();
        System.out.println("ingrese la base del rectángulo: ");
        rectangulo.setBase(scan.nextDouble());
        System.out.println("ingrese la altura del rectángulo: ");
        rectangulo.setAltura(scan.nextDouble());
        return rectangulo;
    }

    public void perimetro(Rectangulo rectangulo) {
        System.out.print("el perímetro del rectángulo es: ");
        System.out.println((rectangulo.getBase() + rectangulo.getAltura()) * 2);
    }

    public void area(Rectangulo rectangulo) {
        System.out.print("el área del rectángulo es: ");
        System.out.println(rectangulo.getBase() * rectangulo.getAltura());
    }

    public void dibujar(Rectangulo rectangulo) {
        for (int i = 0; i < rectangulo.getAltura(); i++) {
            for (int j = 0; j < rectangulo.getBase(); j++) {
                if (i == 0 || i == rectangulo.getAltura() - 1 || j == 0 || j == rectangulo.getBase() - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
