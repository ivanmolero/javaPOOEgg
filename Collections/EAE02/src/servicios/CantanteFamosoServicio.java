package servicios;

import entidades.CantanteFamoso;

import java.util.List;
import java.util.Scanner;

public class CantanteFamosoServicio {
    Scanner scan;

    public CantanteFamosoServicio() {
        scan = new Scanner(System.in);
    }

    public CantanteFamoso crearCantanteFamoso() {
        CantanteFamoso cantanteFamoso = new CantanteFamoso();
        System.out.println("ingrese el nombre del cantante");
        cantanteFamoso.setNombre(scan.nextLine());
        System.out.println("ingrese el disco más vendido");
        cantanteFamoso.setDiscoConMasVentas(scan.nextLine());
        return cantanteFamoso;
    }

    public void agregarCantanteFamoso(CantanteFamoso cantanteFamoso, List<CantanteFamoso> cantantes) {
        cantantes.add(cantanteFamoso);
    }

    public void fabricaCantanteFamoso(List<CantanteFamoso> cantantes) {
        do {
            agregarCantanteFamoso(crearCantanteFamoso(), cantantes);
            System.out.println("desea seguir ingresando cantantes? (S/N)");
        } while(scan.nextLine().equalsIgnoreCase("s"));
    }

    public void listarCantanteFamoso(List<CantanteFamoso> cantantes) {
        cantantes.forEach((cantante) -> System.out.println(cantante));
        System.out.println();
    }

    public void eliminarCantanteFamoso(List<CantanteFamoso> cantantes) {
        System.out.println("ingrese el nombre del cantante que desea eliminar");
        String nombreCantante = scan.nextLine();
        CantanteFamoso cantanteEliminar = new CantanteFamoso(nombreCantante, "");
        if (cantantes.contains(cantanteEliminar)) {
            System.out.printf("esta seguro de eliminar al cantante %s? (S/N)\n", nombreCantante);
            if (scan.nextLine().equalsIgnoreCase("s")) {
                cantantes.remove(cantanteEliminar);
                System.out.printf("cantante %s eliminado con exito\n", nombreCantante);
            }
        } else {
            System.out.printf("el cantante %s no se encuentra en la lista\n", cantanteEliminar);
        }
    }
}
