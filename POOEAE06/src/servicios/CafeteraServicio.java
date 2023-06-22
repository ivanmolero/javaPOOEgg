package servicios;

import entidades.Cafetera;

import java.util.Scanner;

public class CafeteraServicio {
    Scanner scan = new Scanner(System.in);

    public Cafetera crearCafetera(){
        Cafetera cafetera = new Cafetera();
        System.out.println("ingrese la capacidad máxima en mililitros: ");
        cafetera.setCapacidadMaxima(Integer.parseInt(scan.nextLine()));
        System.out.println("ingrese la cantidad actual en mililitros: ");
        cafetera.setCantidadActual(Integer.parseInt(scan.nextLine()));
        return cafetera;
    }

    public void llenarCafetera(Cafetera cafetera) {
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
    }

    public void servirTasa(Cafetera cafetera, int taza) {
        if (taza <= cafetera.getCantidadActual()) {
            cafetera.setCantidadActual(cafetera.getCantidadActual() - taza);
            System.out.println("la taza se ha llenado");
        } else {
            System.out.println("la taza no se ha llenado, quedó en " + cafetera.getCantidadActual());
            cafetera.setCantidadActual(0);
        }
    }

    public void vaciarCafetera(Cafetera cafetera) {
        cafetera.setCantidadActual(0);
    }

    public void agregarCafe(Cafetera cafetera, int cantidad) {
        cafetera.setCantidadActual(cafetera.getCantidadActual() + cantidad);
    }

    public void estadoCafetera(Cafetera cafetera) {
        System.out.println("Cafetera: \n\tContenido actual: " + cafetera.getCantidadActual() + " ml\n\tCapacidad máxima: " + cafetera.getCapacidadMaxima() + " ml\n");
    }
}
