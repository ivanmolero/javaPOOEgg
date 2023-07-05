package servicios;

import entidades.Autor;

import java.util.List;
import java.util.Scanner;

public class AutorServicio {
    private Scanner scan = new Scanner(System.in);
    public Autor crearAutor() {
        System.out.println("CREAR AUTOR");
        Autor autor = new Autor();
        System.out.println("ingrese el nombre del autor: ");
        autor.setNombre(scan.nextLine());
        return autor;
    }

    public void listarAutores(List<Autor> autores) {
        System.out.println("AUTORES");
        for (Autor autor : autores) {
            System.out.println(autor);
        }
    }

    public int seleccionaAutor(List<Autor> autores) {
        int opcion = 0;
        do {
            System.out.println("AUTORES");
            for (int i = 0; i < autores.size(); i++) {
                System.out.println(i + " - " + autores.get(i).getNombre());
            }
            System.out.println("seleccione un autor: ");
            opcion = Integer.parseInt(scan.nextLine());
            if (opcion < 0 || opcion > autores.size()) {
                System.out.println("seleccione una opción válida");
            }
        } while (opcion < 0 || opcion >= autores.size());
        return opcion;

    }
}
