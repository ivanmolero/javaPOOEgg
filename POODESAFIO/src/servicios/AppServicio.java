package servicios;

import java.util.List;
import java.util.Scanner;

public class AppServicio {
    Scanner scan = new Scanner(System.in);
    String[] menu = {
            "Mantenimiento Cliente",
            "Mantenimiento Rutina",
            "Salir"
    };
    String[] menuCRUDCliente = {
            "Listar Clientes",
            "Crear Cliente",
            "Editar Cliente",
            "Eliminar Cliente",
            "Salir"
    };
    String[] menuCRUDRutina = {
            "Listar Rutinas",
            "Crear Rutina",
            "Editar Rutina",
            "Eliminar Rutina",
            "Salir"
    };
    public void iniciar() {
        int op = 0;
        do {
            op = seleccionaMenu(menu);
            accionaOpcionMenu(op);
        } while(op != menu.length);
    }

    private void accionaOpcionMenu(int op) {
        int opcion = 0;
        switch (op) {
            case 1:
                do {
                    opcion = seleccionaMenu(menuCRUDCliente);
                    accionaOpcionMenuCRUDCliente(opcion);
                } while(opcion != menuCRUDCliente.length);
                break;
            case 2:
                do {
                    opcion = seleccionaMenu(menuCRUDRutina);
                    accionaOpcionMenuCRUDRutina(opcion);
                } while(opcion != menuCRUDCliente.length);
                break;
        }
    }

    private void accionaOpcionMenuCRUDRutina(int op) {
        switch (op) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
    }

    private void accionaOpcionMenuCRUDCliente(int op) {
        switch (op) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
    }

    public int seleccionaMenu(String[] arregloMenu) {
        int opcion = 0;
        do {
            System.out.println("MENU");
            int i = 1;
            for (String elemento : arregloMenu) {
                System.out.println(i + ". " + elemento);
                i++;
            }
            System.out.println("ingrese una opción: ");
            opcion = Integer.parseInt(scan.nextLine());
            if (opcion < 1 || opcion > arregloMenu.length) {
                System.out.println("ingrese una opción válida");
            }
        } while(opcion < 1 || opcion > arregloMenu.length);
        return opcion;
    }
}
