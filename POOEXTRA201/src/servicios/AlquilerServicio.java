package servicios;

import entidades.Alquiler;
import entidades.Pelicula;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class AlquilerServicio {
    Scanner scan = new Scanner(System.in);
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public Alquiler crearAlquiler(Pelicula pelicula) {
        System.out.println("CREAR ALQUILER");
        Alquiler alquiler = new Alquiler();
        alquiler.setPeliculaAlquilada(pelicula);
        pelicula.setEstaDisponible(false);
        System.out.println("ingrese la fecha de inicio (dd/mm/yyyy): ");
        alquiler.setFechaInicio(LocalDate.parse(scan.nextLine(), dtf));
        return alquiler;
    }

    public void listarAlquileres(List<Alquiler> alquileres) {
        for (Alquiler alquiler: alquileres) {
            System.out.println(alquiler.toString());
        }
    }

    public void listarAlquileresPorFecha(List<Alquiler> alquileres, String fechaAlquiler) {
        LocalDate fechaAlq = LocalDate.parse(fechaAlquiler, dtf);
        for (Alquiler alquiler: alquileres) {
            if (alquiler.getFechaInicio().equals(fechaAlq)) {
                System.out.println(alquiler.toString());
            }
        }
    }

    public double calculaTotalIngresos(List<Alquiler> alquileres) {
        double total = 0;
        for (Alquiler alquiler : alquileres) {
            total += alquiler.getPrecio();
        }
        return total;
    }

    public int seleccionaAlquilerParaDevolver(List<Alquiler> alquileres) {
        int opcion = 0;
        do {
            for (int i = 0; i < alquileres.size(); i++) {
                if (alquileres.get(i).getFechaFin() == null) {
                    System.out.println(i + " - " + alquileres.get(i));
                }
            }
            System.out.println("seleccione un alquiler: ");
            opcion = Integer.parseInt(scan.nextLine());
            if (opcion < 0 || opcion > alquileres.size()) {
                System.out.println("ingrese una opción válida");
            }
        } while (opcion < 0 || opcion > alquileres.size());
        return opcion;
    }

    public void devolverAlquiler(List<Alquiler> alquileres, int opcionAlquiler) {
        Alquiler alquiler = alquileres.get(opcionAlquiler);
        System.out.println("la fecha de alquiler es: " + alquiler.getFechaInicio());
        System.out.println("ingrese la fecha de devolución (dd/mm/yyyy): ");
        String fechaDevolucion = scan.nextLine();
        LocalDate fechaDev = LocalDate.parse(fechaDevolucion, dtf);
        alquiler.setFechaFin(fechaDev);
        alquiler.getPeliculaAlquilada().setEstaDisponible(true);
        Period periodo = Period.between(alquiler.getFechaInicio(), fechaDev );
        System.out.println("dias de alquiler: " + periodo.getDays());
        if (periodo.getDays() <= 3) {
            alquiler.setPrecio(10);
        } else {
            alquiler.setPrecio(10 + (periodo.getDays() - 3));
        }
    }
}
