package servicios;

import entidades.CantanteFamoso;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppServicio {
    private String[] menu = {
            "Crear cantantes",
            "Listar cantantes",
            "Eliminar cantante",
            "Salir"
    };
    private Scanner scan;
    private CantanteFamosoServicio cantanteFamosoServicio;
    private List<CantanteFamoso> cantantes;

    public AppServicio() {
        this.scan = new Scanner(System.in);
        this.cantanteFamosoServicio = new CantanteFamosoServicio();
        this.cantantes = new ArrayList<>();
    }

    public void iniciar() {
        cargarDatos();
        int op = 0;
        do {
            op = seleccionMenu(menu);
            accionaSeleccion(op);
        } while(op != menu.length);
    }

    private void accionaSeleccion(int op) {
        switch (op) {
            case 1:
                this.cantanteFamosoServicio.fabricaCantanteFamoso(this.cantantes);
                break;
            case 2, 4:
                this.cantanteFamosoServicio.listarCantanteFamoso(this.cantantes);
                break;
            case 3:
                this.cantanteFamosoServicio.eliminarCantanteFamoso(this.cantantes);
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

    private void cargarDatos() {
        this.cantantes.add(new CantanteFamoso("The Beatles", "Sgt. Pepper's Lonely Hearts Club Band"));
        this.cantantes.add(new CantanteFamoso("Michael Jackson", "Thriller"));
        this.cantantes.add(new CantanteFamoso("Elvis Presley", "Elvis Presley"));
        this.cantantes.add(new CantanteFamoso("Madonna", "Like a Virgin"));
        this.cantantes.add(new CantanteFamoso("Elton John", "Goodbye Yellow Brick Road"));
    }
}
