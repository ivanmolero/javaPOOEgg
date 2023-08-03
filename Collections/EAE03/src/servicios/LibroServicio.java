package servicios;

import entidades.Libro;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class LibroServicio {

    Scanner scan;

    public LibroServicio() {
        this.scan = new Scanner(System.in);
    }

    public Libro crearLibro() {
        Libro libro = new Libro();
        System.out.println("ingrese el titulo del libro");
        libro.setTitulo(scan.nextLine());
        System.out.println("ingrese el autor del libro");
        libro.setAutor(scan.nextLine());
        System.out.println("ingrese la cantidad de ejemplares");
        libro.setEjemplares(Integer.parseInt(scan.nextLine()));
        return libro;
    }

    public void agregarLibro(Libro libro, Set<Libro> libros) {
        libros.add(libro);
    }

    public void fabricaLibros(Set<Libro> libros) {
        do {
            agregarLibro(crearLibro(), libros);
            System.out.println("desea seguir ingresando libros? (S/N)");
        } while(scan.nextLine().equals("s"));
    }

    public void listarLibros(Set<Libro> libros) {
        libros.forEach(libro -> System.out.println(libro));
    }


}
