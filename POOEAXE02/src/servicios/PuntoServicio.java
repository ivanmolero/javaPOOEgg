package servicios;

import entidades.Punto;

import java.util.List;
import java.util.Scanner;

public class PuntoServicio {
    Scanner scan = new Scanner(System.in);
    public Punto crearPunto() {
        Punto punto = new Punto();
        System.out.println("Crear punto");
        System.out.println("ingrese el valor de x: ");
        punto.setX(Double.parseDouble(scan.nextLine()));
        System.out.println("ingrese el valor de y: ");
        punto.setY(Double.parseDouble(scan.nextLine()));
        return punto;
    }

    public double calcularDistancia(Punto pto1, Punto pto2) {
        return Math.sqrt(Math.pow(pto2.getX() - pto1.getX(), 2) + Math.pow(pto2.getY() - pto1.getY(), 2));
    }

    public void listarPuntos(List<Punto> puntos) {
        System.out.println("puntos registrados: ");
        for (Punto punto : puntos) {
            System.out.println(punto.toString());
        }
    }

    public Punto seleccionaPunto(List<Punto> puntos) {
        int posicion = -1;
        do {
            for (int i = 0; i < puntos.size(); i++) {
                System.out.println(i + " - " + puntos.get(i).toString());
            }
            System.out.println("seleccione un punto: ");
            posicion = Integer.parseInt(scan.nextLine());
            if (posicion < 0 || posicion > puntos.size()) {
                System.out.println("ingrese un valor válido");
            }
        } while(posicion < 0 || posicion > puntos.size());
        return puntos.get(posicion);
    }
}
