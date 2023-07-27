package servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppServicio {
    private String[] menu = {
            "Crear alumnos",
            "Listar alumnos",
            "Ver notas finales",
            "Salir"
    };
    private Scanner scan;
    private AlumnoServicio alumnoServicio;

    public AppServicio() {
        this.scan = new Scanner(System.in);
        this.alumnoServicio = new AlumnoServicio();
    }

    public void iniciar() {
        int op = 0;
        do {
            op = seleccionMenu(menu);
            accionaSeleccion(op);
        } while(op != menu.length);
    }

    private void accionaSeleccion(int op) {
        switch (op) {
            case 1:
                this.alumnoServicio.fabricaAlumnos();
                break;
            case 2:
                this.alumnoServicio.listarAlumnos();
                break;
            case 3:
                this.alumnoServicio.notaFinal();
                break;
        }
    }

    private int seleccionMenu(String[] menu) {
        int op = 0;
        int i;
        do {
            i = 1;
            for (String elemento : menu) {
                System.out.println(i + " - " + elemento);
                i++;
            }
            System.out.println("ingrese la opción: ");
            op = Integer.parseInt(scan.nextLine());
            if (op < 1 || op > menu.length) {
                System.out.println("opción ingresada fuera de rango");
            }
        } while(op < 1 || op > menu.length);
        return op;
    }
}
