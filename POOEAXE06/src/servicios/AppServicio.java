package servicios;

import entidades.Ahorcado;

import java.util.Scanner;

public class AppServicio {
    Scanner scan = new Scanner(System.in);
    String[] menu = {
            "1. Ingresar valores iniciales",
            "2. Jugar",
            "3. Salir"
    };
    Ahorcado ahorcado;
    AhorcadoServicio aserv = new AhorcadoServicio();
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
                ahorcado = aserv.crearAhorcado();
                break;
            case 2:
                aserv.juego(ahorcado);
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
