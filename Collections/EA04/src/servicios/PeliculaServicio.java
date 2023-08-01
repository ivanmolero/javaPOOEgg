package servicios;

import entidades.Pelicula;
import utilidades.Comparadores;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class PeliculaServicio {
    Scanner scan;

    public PeliculaServicio() {
        scan = new Scanner(System.in);
    }

    public Pelicula crearPelicula() {
        Pelicula pelicula = new Pelicula();
        System.out.println("ingrese el título de la pelicula: ");
        pelicula.setTitulo(scan.nextLine());
        System.out.println("ingrese el director de la pelicula: ");
        pelicula.setDirector(scan.nextLine());
        System.out.println("ingrese la duración de la pelicula (horas): ");
        pelicula.setDuracion(Double.parseDouble(scan.nextLine()));
        return pelicula;
    }

    public void agregarPelicula(Pelicula pelicula, List<Pelicula> peliculas) {
        peliculas.add(pelicula);
    }

    public void fabricaPeliculas(List<Pelicula> peliculas) {
        do {
            agregarPelicula(crearPelicula(), peliculas);
            System.out.println("desea seguir ingresando peliculas? (S/N)");
        } while(scan.nextLine().equalsIgnoreCase("s"));
    }

    public void listarPeliculas(List<Pelicula> peliculas) {
        peliculas.forEach((pelicula) -> System.out.println(pelicula));
    }

    public void listarOrder(List<Pelicula> peliculas, Comparator<Pelicula> comparator) {
        Collections.sort(peliculas, comparator);
        listarPeliculas(peliculas);
    }

    public void listarMayorUnaHora(List<Pelicula> peliculas) {
        peliculas
                .stream()
                .filter((pelicula) -> pelicula.getDuracion() > 1.0)
                .forEach((pelicula) -> System.out.println(pelicula));
    }
}
