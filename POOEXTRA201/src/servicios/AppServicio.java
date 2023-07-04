package servicios;

import entidades.Alquiler;
import entidades.Pelicula;

import java.util.*;

public class AppServicio {
    private String[] listaMenu = {
            "1. Crear Pelicula",
            "2. Crear Alquiler",
            "3. Listar películas disponibles",
            "4. Listar alquileres",
            "5. Buscar película por título",
            "6. Buscar película por genero",
            "7. Buscar alquiler por fecha",
            "8. Calcular ingreso total del servicio",
            "9. Devolver pelicula",
            "10. Salir"
    };
    private Scanner scan = new Scanner(System.in);
    private AlquilerServicio as = new AlquilerServicio();
    private PeliculaServicio ps = new PeliculaServicio();
    private Map<String, Pelicula> peliculas = new HashMap<String, Pelicula>();
    private List<Alquiler> alquileres = new ArrayList<>();
    public void inicio() {
        int opcion = 0;
        do {
            opcion = seleccionaMenu();
            activarOpcion(opcion);
        } while(opcion != listaMenu.length);
    }

    private void activarOpcion(int opcion) {
        Pelicula pelicula = null;
        Alquiler alquiler = null;
        String nombrePelicula = "";
        String generoPelicula = "";
        String fechaAlquiler = "";
        int opcionAlquiler = 0;
        switch (opcion) {
            case 1:
                pelicula = ps.crearPelicula();
                peliculas.put(pelicula.getTitulo(), pelicula);
                break;
            case 2:
                ps.listarPeliculasDisponibles(peliculas);
                System.out.println("ingrese el nombre de la pelicula a alquilar: ");
                nombrePelicula = scan.nextLine();
                alquiler = as.crearAlquiler(peliculas.get(nombrePelicula));
                alquileres.add(alquiler);
                break;
            case 3:
                ps.listarPeliculasDisponibles(peliculas);
                break;
            case 4:
                as.listarAlquileres(alquileres);
                break;
            case 5:
                System.out.println("ingrese el nombre de la pelicula a buscar: ");
                nombrePelicula = scan.nextLine();
                System.out.println("la pelicula: " + nombrePelicula + " existe?: " + peliculas.containsKey(nombrePelicula));
                break;
            case 6:
                System.out.println("ingrese el genero de las peliculas a buscar: ");
                generoPelicula = scan.nextLine();
                ps.listarPeliculasPorGenero(peliculas, generoPelicula);
                break;
            case 7:
                System.out.println("ingrese la fecha de alquiler de las peliculas a buscar: ");
                fechaAlquiler = scan.nextLine();
                as.listarAlquileresPorFecha(alquileres, fechaAlquiler);
                break;
            case 8:
                System.out.println("el ingreso total del servicio es: " + as.calculaTotalIngresos(alquileres));
                break;
            case 9:
                opcionAlquiler = as.seleccionaAlquilerParaDevolver(alquileres);
                as.devolverAlquiler(alquileres, opcionAlquiler);
                break;
        }
    }

    private int seleccionaMenu() {
        int opcion = 0;
        do {
            for (int i = 0; i < listaMenu.length; i++) {
                System.out.println(listaMenu[i]);
            }
            System.out.println("seleccione una opción: ");
            opcion = Integer.parseInt(scan.nextLine());
            if(opcion < 1 || opcion > listaMenu.length) {
                System.out.println("ingrese un valor válido");
            }
        } while (opcion < 1 || opcion > listaMenu.length);
        return opcion;
    }
}
