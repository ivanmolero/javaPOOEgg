package servicios;

import entidades.NIF;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppServicio {
    Scanner scan = new Scanner(System.in);
    String[] menu = {
            "1. Crear DNI",
            "2. Mostrar NIFs",
            "3. Salir"
    };
    List<NIF> nifs = new ArrayList<>();
    NIFServicio nserv = new NIFServicio();
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
                nifs.add(nserv.crearNIF());
                break;
            case 2:
                nifs.forEach(nif -> {
                    nserv.mostrar(nif);
                });
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
