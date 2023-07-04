package servicios;

import entidades.Pelicula;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PeliculaServicio {
    Scanner scan = new Scanner(System.in);
    public Pelicula crearPelicula() {
        System.out.println("CREAR PELICULA");
        Pelicula pelicula = new Pelicula();
        System.out.println("ingrese el titulo de la pelicula: ");
        pelicula.setTitulo(scan.nextLine());
        System.out.println("ingrese el genero de la pelicula: ");
        pelicula.setGenero(scan.nextLine());
        System.out.println("ingrese el año de la pelicula: ");
        pelicula.setAnio(Integer.parseInt(scan.nextLine()));
        System.out.println("ingrese la duración de la pelicula (minutos): ");
        pelicula.setDuracion(Integer.parseInt(scan.nextLine()));
        return pelicula;
    }


    public void listarPeliculasDisponibles(Map<String, Pelicula> peliculas) {
        System.out.println("PELICULAS DISPONIBLES");
        for (Map.Entry<String, Pelicula> pelicula : peliculas.entrySet()) {
            if (pelicula.getValue().isEstaDisponible()) {
                System.out.println(pelicula.getKey());
            }
        }
    }

    public void listarPeliculasPorGenero(Map<String, Pelicula> peliculas, String generoPelicula) {
        System.out.println("PELICULAS POR GENERO: " + generoPelicula.toUpperCase());
        for (Map.Entry<String, Pelicula> pelicula : peliculas.entrySet()) {
            if (pelicula.getValue().getGenero().equals(generoPelicula)) {
                System.out.println(pelicula.getKey());
            }
        }
    }
}
