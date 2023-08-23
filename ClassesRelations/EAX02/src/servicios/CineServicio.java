package servicios;

import entidades.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CineServicio {
    private Cine cine;
    private List<AgendaPelicula> registroPeliculas;

    public CineServicio() {
        this.registroPeliculas = new ArrayList<>();
    }

    public CineServicio(Cine cine) {
        this();
        this.cine = cine;
    }

    public void crearSalas(int numeroSalas) {
        for (int i = 0; i < numeroSalas; i++) {
            Sala sala = new Sala("Sala-" + (i + 1));
            Character[] columnas = {'A', 'B', 'C', 'D', 'E', 'F'};
            crearAsientos(sala, 8, columnas);
            this.cine.getTieneSalas().add(sala);
        }
    }

    private void crearAsientos(Sala sala, int filas, Character[] columnas) {
        for (int i = 1; i <= filas; i++) {
            for (Character columna : columnas) {
                sala.getTieneAsientos().add(new Asiento(i, columna));
            }
        }
    }

    public Cine getCine() {
        return cine;
    }

    public void crearAgendaPeliculas() {
        AgendaPelicula agendaPelicula = new AgendaPelicula(
                LocalDateTime.of(2023, 8, 22, 16, 0),
                LocalDateTime.of(2023, 8, 22, 18, 0),
                500.0,
                this.cine.getTieneSalas().get(0),
                new Pelicula("El Gato con Botas", 90, 7, "Chris Miller"));
        this.registroPeliculas.add(agendaPelicula);
        agendaPelicula = new AgendaPelicula(
                LocalDateTime.of(2023, 8, 22, 16, 0),
                LocalDateTime.of(2023, 8, 22, 18, 0),
                550.0,
                this.cine.getTieneSalas().get(1),
                new Pelicula("Misión Imposible: Sentencia Mortal P1", 163, 12, "Chris Miller"));
        this.registroPeliculas.add(agendaPelicula);
    }

    public void mostrarRegistroPeliculas() {
        this.registroPeliculas.forEach(agendaPelicula -> System.out.println(agendaPelicula));
    }
}
