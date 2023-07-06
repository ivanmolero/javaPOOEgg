package servicios;

import entidades.Ecuacion2do;

import java.util.Scanner;

public class AppService {
    Scanner scan = new Scanner(System.in);
    Ecuacion2doServicio eserv = new Ecuacion2doServicio();
    String[] menu = {
            "1. Ingresar ecuación",
            "2. Mostrar ecuación",
            "3. Calcula raices",
            "4. Salir"
    };
    Ecuacion2do ecuacion = null;
    public void iniciar() {
        int opcion = 0;
        do {
            opcion = seleccionaMenu();
            accionaOpcion(opcion);
        } while(opcion != menu.length);
    }

    private void accionaOpcion(int opcion) {
        switch (opcion) {
            case 1:
                ecuacion = eserv.crearEcuacion();
                break;
            case 2:
                System.out.println("la ecuación es: ");
                System.out.println(ecuacion.toString());
                System.out.println("y el discriminante es: " + eserv.getDiscriminante(ecuacion));
                break;
            case 3:
                if (ecuacion == null) {
                    System.out.println("primero ingrese los valores de la ecuación");
                } else {
                    eserv.calcular(ecuacion);
                }
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
        return opcion;    }
}
