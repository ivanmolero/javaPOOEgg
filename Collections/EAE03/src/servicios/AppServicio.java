package servicios;

import entidades.Libro;

import java.util.*;

public class AppServicio {
    private String[] menu = {
            "Crear libros",
            "Listar libros",
            "Prestar libro",
            "Devolver libro",
            "Salir"
    };
    private Scanner scan;
    private LibroServicio libroServicio;
    private Libreria libreria;
    private Set<Libro> libros;

    public AppServicio() {
        this.scan = new Scanner(System.in);
        this.libroServicio = new LibroServicio();
        this.libreria = new Libreria();
        this.libros = new HashSet<>();
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
                this.libroServicio.fabricaLibros(this.libros);
                break;
            case 2:
                this.libroServicio.listarLibros(this.libros);
                break;
            case 3:
                if (this.libreria.prestamo(this.libros)) {
                    System.out.println("se ha realizado el prestamo con éxito");
                } else {
                    System.out.println("no ha sido posible realizar el préstamo");
                }
                break;
            case 4:
                if (this.libreria.devolucion(this.libros)) {
                    System.out.println("se ha realizado la devolución con éxito");
                } else {
                    System.out.println("no ha sido posible realizar la devolución");
                }
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
        this.libros.add(new Libro("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 5));
        this.libros.add(new Libro("The Stand", "Stephen King", 3));
        this.libros.add(new Libro("The Lord of the Rings", "J.R.R. Tolkien", 1));
        this.libros.add(new Libro("The Da Vinci Code", "Dan Brown", 2));
        this.libros.add(new Libro("Twilight", "Stephenie Meyer", 3));
        this.libros.add(new Libro("The Alchemist", "Paulo Coelho", 2));
        this.libros.add(new Libro("The Handmaid's Tale", "Margaret Atwood", 2));
    }
}
