package servicios;

import entidades.Libro;

import java.util.Scanner;
import java.util.Set;

public class Libreria {

    private Scanner scan;

    public Libreria() {
        this.scan = new Scanner(System.in);
    }

    public boolean prestamo(Set<Libro> libros) {
        System.out.println("ingrese el titulo del libro a prestar");
        Libro libroBuscar = buscarLibro(libros, scan.nextLine());
        if (libroBuscar != null) {
            if (libroBuscar.getEjemplares() > libroBuscar.getEjemplaresPrestados()) {
                libroBuscar.setEjemplaresPrestados(libroBuscar.getEjemplaresPrestados() + 1);
                return true;
            } else {
                System.out.println("no hay la suficiente cantidad de ejemplares para el prestamo");
                return false;
            }
        }
        return false;
    }

    public boolean devolucion(Set<Libro> libros) {
        System.out.println("ingrese el titulo del libro a prestar");
        Libro libroBuscar = buscarLibro(libros, scan.nextLine());
        if (libroBuscar != null) {
            if (libroBuscar.getEjemplaresPrestados() > 0) {
                libroBuscar.setEjemplaresPrestados(libroBuscar.getEjemplaresPrestados() - 1);
                return true;
            } else {
                System.out.println("no hay ningun ejemplar pendiente de devolución");
                return false;
            }
        }
        return false;
    }

    private Libro buscarLibro(Set<Libro> libros, String titulo) {
        if (libros.contains(new Libro(titulo, "", 0))) {
            for (Libro libro : libros) {
                if (libro.getTitulo().equals(titulo)) return libro;
            }
        }
        return null;
    }
}
