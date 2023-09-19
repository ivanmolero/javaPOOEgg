package org.example.servicios;

import java.util.Scanner;

public class AppServicio {
    Scanner scan;
    FamiliaServicio familiaServicio;
    ReporteServicio reporteServicio;
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
        this.scan = new Scanner(System.in);
        this.familiaServicio = new FamiliaServicio();
        this.reporteServicio = new ReporteServicio();
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

    private void operarSeleccionMenuFamilia(int opcion) {
        switch (opcion) {
            case 1:
                this.familiaServicio.agregarFamilia(this.familiaServicio.crearFamilia(), this.reporteServicio.getFamilias());
                break;
            case 2:
                this.familiaServicio.editarFamilia(this.reporteServicio.getFamilias());
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;

        }
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
