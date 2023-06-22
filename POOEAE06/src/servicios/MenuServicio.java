package servicios;

import entidades.Cafetera;

import java.util.Scanner;

public class MenuServicio {
    Scanner scan = new Scanner(System.in);

    public Cafetera[] crearCafeteras(CafeteraServicio cs) {
        System.out.println("ingrese cuantas cafeteras desea crear: ");
        int cantidad = Integer.parseInt(scan.nextLine());
        Cafetera[] cafeteras = new Cafetera[cantidad];
        for (int i = 0; i < cantidad; i++) {
            cafeteras[i] = cs.crearCafetera();
        }
        return cafeteras;
    }

    public Cafetera seleccionaCafetera(Cafetera[] cafeteras) {
        int sel = 0;
        do {
            System.out.println("Seleccione una cafetera: ");
            for (int i = 0; i < cafeteras.length; i++) {
                System.out.println(i + ". " + cafeteras[i].getCantidadActual() + "/" + cafeteras[i].getCapacidadMaxima());
            }
            sel = Integer.parseInt(scan.nextLine());
            if (sel < 0 || sel > cafeteras.length) {
                System.out.println("seleccione una opción válida");
            }
        } while(sel < 0 || sel > cafeteras.length);
        return cafeteras[sel];
    }

    public int seleccionaOpcionMenu() {
        int sel = 0;
        do {
            System.out.println("MENU OPCIONES");
            System.out.println("1. Seleccione Cafetera");
            System.out.println("2. Ver Estado Cafetera");
            System.out.println("3. Llenar Cafetera");
            System.out.println("4. Vaciar Cafetera");
            System.out.println("5. Agregar Cafe");
            System.out.println("6. Servir Taza");
            System.out.println("7. Salir");
            System.out.println("seleccione una opción");
            sel = Integer.parseInt(scan.nextLine());
            if (sel < 0 || sel > 7) {
                System.out.println("seleccione una opción válida");
            }
        } while(sel < 0 || sel > 7);
        return sel;
    }

    public void ejecutaOpcion(CafeteraServicio cs, Cafetera cafSel, int op) {
        switch (op) {
            case 2:
                cs.estadoCafetera(cafSel);
                break;
            case 3:
                cs.llenarCafetera(cafSel);
                break;
            case 4:
                cs.vaciarCafetera(cafSel);
                break;
            case 5:
                System.out.println("ingrese la cantidad a agregar: ");
                int agregar = Integer.parseInt(scan.nextLine());
                cs.agregarCafe(cafSel, agregar);
                break;
            case 6:
                System.out.println("ingrese el tamaño de la taza: ");
                int taza = Integer.parseInt(scan.nextLine());
                cs.servirTasa(cafSel, taza);
                break;
            case 7:
                System.out.println("nos vemos");
                break;
        }
    }
}
