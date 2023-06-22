package servicios;

import entidades.Libro;

import java.util.Scanner;

public class LibroServicio {
    public Libro crearLibro() {
        Libro libro = new Libro();
        Scanner scan = new Scanner(System.in);
        System.out.println("CREAR LIBRO");
        System.out.println("ingrese el ISBN del libro");
        libro.setISBN(scan.nextLine());
        System.out.println("ingrese el título del libro");
        libro.setTitulo(scan.nextLine());
        System.out.println("ingrese el autor del libro");
        libro.setAutor(scan.nextLine());
        System.out.println("ingrese el número de páginas");
        libro.setNumeroPaginas(scan.nextInt());
        return libro;
    }

    public void mostrarLibro(Libro libro) {
        System.out.println("LIBRO");
        System.out.println("ISBN: " + libro.getISBN());
        System.out.println("Título: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("Páginas: " + libro.getNumeroPaginas());
    }
}
