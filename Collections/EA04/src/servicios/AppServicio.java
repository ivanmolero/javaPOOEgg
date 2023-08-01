package servicios;

import entidades.Pelicula;
import utilidades.Comparadores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppServicio {
    private String[] menu = {
            "Crear peliculas",
            "Listar peliculas",
            "Orden y filtro",
            "Salir"
    };
    private String[] menuOrdenFiltro = {
            "Filtro > 1 hora",
            "Orden duracion descendente",
            "Orden duracion ascencente",
            "Orden titulo ascendente",
            "Orden director ascendente",
            "Salir"
    };
    private Scanner scan;
    private PeliculaServicio peliculaServicio;
    private List<Pelicula> peliculas;

    public AppServicio() {
        this.scan = new Scanner(System.in);
        this.peliculaServicio = new PeliculaServicio();
        this.peliculas = new ArrayList<>();
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
                this.peliculaServicio.fabricaPeliculas(this.peliculas);
                break;
            case 2:
                this.peliculaServicio.listarPeliculas(this.peliculas);
                break;
            case 3:
                int opcion = 0;
                do {
                    opcion = seleccionMenu(menuOrdenFiltro);
                    accionaFiltroOrdenSeleccion(opcion);
                } while(opcion != menuOrdenFiltro.length);
                break;
        }
    }

    private void accionaFiltroOrdenSeleccion(int op) {
        switch (op) {
            case 1:
                this.peliculaServicio.listarMayorUnaHora(this.peliculas);
                break;
            case 2:
                this.peliculaServicio.listarOrder(this.peliculas, Comparadores.orderByDuracionDesc);
                break;
            case 3:
                this.peliculaServicio.listarOrder(this.peliculas, Comparadores.orderByDuracionAsc);
                break;
            case 4:
                this.peliculaServicio.listarOrder(this.peliculas, Comparadores.orderByTituloAsc);
                break;
            case 5:
                this.peliculaServicio.listarOrder(this.peliculas, Comparadores.orderByDirectorAsc);
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
        this.peliculas.add(new Pelicula("Simon del desierto", "Luis Buñuel.", 0.7));
        this.peliculas.add(new Pelicula("Alien la resurreccion", "Jean-Pierre Jeunet", 2.3));
        this.peliculas.add(new Pelicula("Alien 3", "David Fincher", 1.5));
        this.peliculas.add(new Pelicula("Alien", "Ridley Scott", 2.5));
        this.peliculas.add(new Pelicula("Alien 2", "James Cameron", 2.0));
    }

}
