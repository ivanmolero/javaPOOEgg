package servicios;

import entidades.Movil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InterfazServicio {
    Scanner scan = new Scanner(System.in);
    Movil movil;
    List<Movil> moviles = new ArrayList<>();
    MovilServicio ms = new MovilServicio();
    public void mostrarMenu() {
        String[] elementos = {
                "1. Listar Celulares",
                "2. Agregar Celular",
                "3. Mostrar Celular",
                "4. Salir"
        };
        for (int i = 0; i < elementos.length; i++) {
            System.out.println(elementos[i]);
        }
    }

    public int seleccionaOpcion(int salida) {
        int op = 0;
        do {
            mostrarMenu();
            System.out.println("seleccione la opción: ");
            op = Integer.parseInt(scan.nextLine());
            if (op > salida || op < 0) {
                System.out.println("ingrese una opción válida");
            }
        } while(op > salida || op < 0);
        return op;
    }

    public void activaOpcion(int opcion) {
        switch (opcion) {
            case 1:
                for (int i = 0; i < moviles.size(); i++) {
                    System.out.println(i + ". " + moviles.get(i).getMarca() + " - " + moviles.get(i).getModelo());
                }
                System.out.println();
                break;
            case 2:
                movil = ms.cargarCelular();
                moviles.add(movil);
                break;
            case 3:
                int pos = seleccionaElemento();
                System.out.println(moviles.get(pos).toString());
                System.out.println();
                break;

        }
    }

    private int seleccionaElemento() {
        int op = -1;
        do {
            for (int i = 0; i < moviles.size(); i++) {
                System.out.println(i + ". " + moviles.get(i).getMarca() + " - " + moviles.get(i).getModelo());
            }
            System.out.println("seleccione una opción: ");
            op = Integer.parseInt(scan.nextLine());
            if (op < 0 || op > moviles.size()) {
                System.out.println("ingrese una opción válida");
            }
        } while(op < 0 || op > moviles.size());
        return op;
    }
}
