package servicios;

import entidades.Ahorcado;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AppServicio {
    String[] menu = {
            "1. Iniciar juego",
            "2. Jugar",
            "3. Salir"
    };
    Scanner scan = new Scanner(System.in);
    AhorcadoServicio ahorcadoServicio = new AhorcadoServicio();
    Ahorcado ahorcado;
    public void iniciar() {
        int op = 0;
        do {
            op = seleccionaMenu();
            activaOpcion(op);
        } while (op != menu.length);
    }

    private void activaOpcion(int op) {
        switch (op) {
            case 1:
                ahorcado = ahorcadoServicio.crearJuego();
                break;
            case 2:
                ahorcadoServicio.juego(ahorcado);
                break;
            case 3:
                break;
        }
    }

    private int seleccionaMenu() {
        int op = 0;
        do {
            System.out.println("MENU PRINCIPAL");
            for (String elemento : menu) {
                System.out.println(elemento);
            }
            System.out.println("seleccione una opción: ");
            op = Integer.parseInt(scan.nextLine());
            if (op < 1 || op > menu.length) {
                System.out.println("seleccione una opción válida");
            }
        } while (op < 1 || op > menu.length);
        return op;
    }
}
