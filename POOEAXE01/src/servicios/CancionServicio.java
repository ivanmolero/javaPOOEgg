package servicios;

import entidades.Autor;
import entidades.Cancion;

import java.util.List;
import java.util.Scanner;

public class CancionServicio {
    private Scanner scan = new Scanner(System.in);
    public Cancion crearCancion(Autor autor) {
        System.out.println("CREAR CANCION");
        Cancion cancion = new Cancion();
        System.out.println("ingrese el titulo de la canción: ");
        cancion.setTitulo(scan.nextLine());
        cancion.setAutor(autor);
        autor.getCanciones().add(cancion);
        return cancion;
    }

    public void listarCanciones(List<Cancion> canciones) {
        System.out.println("CANCIONES");
        for (Cancion cancion : canciones) {
            System.out.println(cancion);
        }
    }
}
