package org.example.servicios;

import java.util.Scanner;

public class AppServicio {
    Scanner scan;
    String[] menu = {
            "Familia",
            "Reportes",
            "Salir"
    };
    String[] menuFamilia = {
            "Crear Familia",
            "Editar Familia",
            "Eliminar Familia",
            "Listar Familias",
            "Salir"
    };

    public AppServicio() {
        scan = new Scanner(System.in);
    }

    public void iniciar() {
        int op = 0;
        do {
            op = seleccionarMenu(menu);
            if (op != menu.length) operarSeleccion(op);
        } while (op != menu.length);
    }

    private void operarSeleccion(int opcion) {
        int op = 0;
        switch (opcion) {
            case 1:
                do {
                    op = seleccionarMenu(menuFamilia);
                    if (op != menuFamilia.length) operarSeleccionMenuFamilia(op);
                } while (op != menuFamilia.length);
                break;
            case 2:
                break;
            case 3:
                System.out.println("finalizando aplicacion");
                break;
        }
    }

    private void operarSeleccionMenuFamilia(int op) {
        
    }

    private int seleccionarMenu(String[] menu) {
        int op = 0;
        do {
            for (int i = 1; i <= menu.length; i++) {
                System.out.printf("%d - %s\n", i, menu[i - 1]);
            }
            System.out.println("ingrese una opcion: ");
            op = Integer.parseInt(scan.nextLine());
            if (op <= 0 || op > menu.length) System.out.println("ingrese un valor valido");
        } while (op <= 0 || op > menu.length);
        return op;
    }
}
