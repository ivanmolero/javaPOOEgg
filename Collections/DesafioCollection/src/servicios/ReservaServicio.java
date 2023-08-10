package servicios;

import entidades.Habitacion;
import entidades.Persona;
import entidades.Reserva;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class ReservaServicio {
    private Scanner scan;
    private List<Reserva> reservas;
    private DateTimeFormatter formatoFecha;

    public ReservaServicio() {
        this.scan = new Scanner(System.in);
        this.reservas = new ArrayList<>();
        this.formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    }

    public Reserva crearReserva(Map<String, Persona> personas, Map<Integer, Habitacion> habitaciones) {
        Reserva reserva = new Reserva();
        System.out.print("ingrese el dni del responsable: ");
        reserva.setResponsable(personas.get(scan.nextLine()));
        System.out.print("ingrese la fecha de inicio de reserva (dd/mm/aaaa): ");
        reserva.setFechaInicio(LocalDate.parse(scan.nextLine(), formatoFecha));
        System.out.print("ingrese la fecha final de reserva (dd/mm/aaaa): ");
        reserva.setFechaFin(LocalDate.parse(scan.nextLine(), formatoFecha));
        System.out.print("ingrese la cantidad de personas: ");
        reserva.setCantidadPersonas(Integer.parseInt(scan.nextLine()));
        System.out.println("seleccione la habitación a reservar");
        reserva.setNumeroHabitacion(seleccionaHabitacion(reserva.getFechaInicio(), reserva.getFechaFin(), reserva.getCantidadPersonas(), habitaciones));
        return reserva;
    }

    private Integer seleccionaHabitacion(LocalDate fechaInicio, LocalDate fechaFin, Integer cantidadPersonas, Map<Integer, Habitacion> habitaciones) {
        final Set<Habitacion> disponibles = new HashSet<>();
        habitaciones.forEach((integer, habitacion) -> {
            if (habitacion.getCapacidad() >= cantidadPersonas) disponibles.add(habitacion);
        });
        for (Reserva reserva : this.reservas) {
            if (habitaciones.get(reserva.getNumeroHabitacion()).getCapacidad() >= cantidadPersonas) {
                if (!(reserva.getFechaInicio().isAfter(fechaFin) || reserva.getFechaFin().isBefore(fechaInicio))) {
                    disponibles.remove(habitaciones.get(reserva.getNumeroHabitacion()));
                }
            }
        }
        // seleccionar de las habitaciones disponibles
        Integer numHabitacion = 0;
        do {
            disponibles.forEach(habitacion -> System.out.println(habitacion));
            System.out.print("ingrese la habitacion disponible: ");
            numHabitacion = Integer.parseInt(scan.nextLine());
            for (Habitacion habitacion : disponibles) {
                if (habitacion.getNumero() == numHabitacion) {
                    return numHabitacion;
                }
            }
            System.out.println("ingrese una habitacion valida");
        } while(true);
    }

    public void listarReservas() {
        this.reservas.forEach(reserva -> System.out.println(reserva));
    }
}
