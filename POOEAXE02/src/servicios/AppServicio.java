package servicios;

import entidades.Punto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppServicio {
    Scanner scan = new Scanner(System.in);
    List<Punto> puntos = new ArrayList<>();
    PuntoServicio pserv = new PuntoServicio();
    String[] menu = {
            "1. Crear punto",
            "2. Mostrar puntos",
            "3. Calcular distancia",
            "4. Salir"
    };
    public void iniciar() {
        int opcion = 0;
        do {
            opcion = seleccionaMenu();
            accionaOpcion(opcion);
        } while(opcion != menu.length);
    }

    private void accionaOpcion(int opcion) {
        Punto pto1 = null, pto2 = null;
        switch (opcion) {
            case 1:
                puntos.add(pserv.crearPunto());
                break;
            case 2:
                pserv.listarPuntos(puntos);
                break;
            case 3:
                pto1 = pserv.seleccionaPunto(puntos);
                pto2 = pserv.seleccionaPunto(puntos);
                System.out.println("la distancia entre los puntos es: " + pserv.calcularDistancia(pto1, pto2));
                break;
        }
    }

    private int seleccionaMenu() {
        int opcion = 0;
        do {
            System.out.println("MENU");
            for (String elemento : menu) {
                System.out.println(elemento);
            }
            System.out.println("ingrese una opción: ");
            opcion = Integer.parseInt(scan.nextLine());
            if (opcion < 1 || opcion > menu.length) {
                System.out.println("ingrese una opción válida");
            }
        } while(opcion < 1 || opcion > menu.length);
        return opcion;
    }
}
