package servicios;

import entidades.*;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CineServicio {
    private Cine cine;
    private List<AgendaPelicula> registroPeliculas;
    private List<Espectador> espectadores;
    private DecimalFormat df;

    public CineServicio() {
        this.registroPeliculas = new ArrayList<>();
        this.espectadores = new ArrayList<>();
        this.df = new DecimalFormat("#.00");
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

    public void crearEspectadores(int cantidadEspectadores) {
        for (int i = 0; i < cantidadEspectadores; i++) {
            this.espectadores.add(new Espectador("espectador " + (i + 1), ((int)(Math.random() * 20) + 2), Math.random() * 500 + 200));
        }
    }

    public void mostrarEspectadores() {
        this.espectadores.forEach(espectador -> System.out.println(espectador));
    }

    public void venderEntradas() {
        for (Espectador espectador : this.espectadores) {
            AgendaPelicula agendaPelicula = this.registroPeliculas.get((int)(Math.random() * this.registroPeliculas.size()));
            if (agendaPelicula.getPrecioAsiento() < espectador.getDineroDisponible()) {
                if (agendaPelicula.getExhibePelicula().getEdadMinima() <= espectador.getEdad()) {
                    List<Asiento> disponibles = asientosDisponibles(agendaPelicula.getTieneBoletos(), agendaPelicula.getOcupaSala().getTieneAsientos());
                    if (!disponibles.isEmpty()) {
                        Boleto boleto = new Boleto(agendaPelicula, espectador, disponibles.get((int)(Math.random() * disponibles.size())));
                        agendaPelicula.getTieneBoletos().add(boleto);
                        System.out.println(boleto);
                    } else {
                        System.out.printf("el %s no puede comprar un boleto porque la %s no tiene asientos disponibles\n",
                                espectador.getNombre(),
                                agendaPelicula.getOcupaSala().getNombreSala());
                    }
                } else {
                    System.out.printf("el %s de %s años, no puede ver la pelicula %s por edad minima: %s\n",
                            espectador.getNombre(),
                            espectador.getEdad().toString(),
                            agendaPelicula.getExhibePelicula().getTitulo(),
                            agendaPelicula.getExhibePelicula().getEdadMinima().toString());
                }
            } else {
                System.out.printf("el %s solo tiene %s y la entrada cuesta %s\n",
                        espectador.getNombre(),
                        df.format(espectador.getDineroDisponible()),
                        df.format(agendaPelicula.getPrecioAsiento()));
            }
        }
    }

    private List<Asiento> asientosDisponibles(List<Boleto> tieneBoletos, List<Asiento> tieneAsientos) {
        List<Asiento> ocupados = new ArrayList<>();
        for (Boleto boleto : tieneBoletos) {
            ocupados.add(boleto.getOcupaAsiento());
        }
        List<Asiento> disponibles = new ArrayList<>();
        for (Asiento asiento : tieneAsientos) {
            if (!ocupados.contains(asiento)) {
                disponibles.add(asiento);
            }
        }
        return disponibles;
    }

    public void mostrarSalas() {
        for (AgendaPelicula agendaPelicula : this.registroPeliculas) {
            Sala sala = agendaPelicula.getOcupaSala();
            List<Asiento> disponibles = asientosDisponibles(agendaPelicula.getTieneBoletos(), agendaPelicula.getOcupaSala().getTieneAsientos());
            int filas = 0;
            for (int i = 0; i < sala.getTieneAsientos().size(); i++) {
                if (i % 6 == 0) System.out.println();
                Asiento asiento = sala.getTieneAsientos().get(i);
                String ocupado = disponibles.contains(asiento) ? " " : "X";
                String separador = " | ";
                System.out.print(asiento + ocupado);
                if (i % 6 != 5) System.out.print(separador);
            }
            System.out.println();
        }
    }
}
