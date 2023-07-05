package servicios;

import entidades.Autor;
import entidades.Cancion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppServicio {
    private Scanner scan = new Scanner(System.in);
    private String[] menu = {
            "1. Crear autor",
            "2. Crear canción",
            "3. Listar autores",
            "4. Listar canciones",
            "5. Salir"
    };
    private List<Cancion> canciones = new ArrayList<>();
    private List<Autor> autores = new ArrayList<>();
    private AutorServicio aser = new AutorServicio();
    private CancionServicio cser = new CancionServicio();
    public void iniciar() {
        int opcion = 0;
        do {
            opcion = seleccionaMenu();
            activaOpcion(opcion);
        } while(opcion != menu.length);
    }

    private void activaOpcion(int opcion) {
        int posicion = -1;
        switch (opcion) {
            case 1:
                autores.add(aser.crearAutor());
                break;
            case 2:
                posicion = aser.seleccionaAutor(autores);
                canciones.add(cser.crearCancion(autores.get(posicion)));
                break;
            case 3:
                aser.listarAutores(autores);
                break;
            case 4:
                cser.listarCanciones(canciones);
                break;

        }
    }

    private int seleccionaMenu() {
        int opcion = 0;
        do {
            System.out.println("----------------------------------");
            System.out.println("               MENU               ");
            System.out.println("----------------------------------");
            for (String elemento : menu) {
                System.out.println(elemento);
            }
            System.out.println("seleccione una opción: ");
            opcion = Integer.parseInt(scan.nextLine());
            if (opcion < 1 || opcion > menu.length) {
                System.out.println("seleccione una opción válida");
            }
        } while (opcion < 1 || opcion > menu.length);
        return opcion;
    }
}
