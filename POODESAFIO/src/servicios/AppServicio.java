package servicios;

import entidades.Cliente;
import entidades.Rutina;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppServicio {
    Scanner scan = new Scanner(System.in);
    ClienteServicio clienteServicio = new ClienteServicio();
    RutinaServicio rutinaServicio = new RutinaServicio();
    List<Cliente> clientes = new ArrayList<>();
    List<Rutina> rutinas = new ArrayList<>();
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
                rutinaServicio.listarRutinas(rutinas);
                break;
            case 2:
                rutinaServicio.crearRutina(rutinas);
                break;
            case 3:
                rutinaServicio.editarRutina(rutinas);
                break;
            case 4:
                rutinaServicio.eliminaRutina(rutinas);
                break;
        }
    }

    private void accionaOpcionMenuCRUDCliente(int op) {
        switch (op) {
            case 1:
                clienteServicio.listarClientes(clientes);
                break;
            case 2:
                clienteServicio.crearCliente(clientes);
                break;
            case 3:
                clienteServicio.editarCliente(clientes);
                break;
            case 4:
                clienteServicio.eliminaCliente(clientes);
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
