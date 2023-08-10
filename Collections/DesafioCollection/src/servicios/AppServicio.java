package servicios;

import entidades.Persona;

import java.util.Scanner;

public class AppServicio {
    private String[] menu = {
            "PERSONAS",
            "Crear Reservas",
            "Listar Reservas",
            "Ver Alojamientos",
            "Salir"
    };
    private String[] menuPersona = {
            "Crear Personas",
            "Listar Personas",
            "Salir"
    };
    private Scanner scan;
    private PersonaServicio personaServicio;
    private ReservaServicio reservaServicio;
    private HabitacionServicio habitacionServicio;
//    private CodigoPostalServicio codigoPostalServicio;
//    private Map<Integer, String > ciudades;

    public AppServicio() {
        this.scan = new Scanner(System.in);
        this.personaServicio = new PersonaServicio();
        this.reservaServicio = new ReservaServicio();
        this.habitacionServicio = new HabitacionServicio();
//        this.codigoPostalServicio = new CodigoPostalServicio();
//        this.ciudades = new HashMap<>();
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
        int opcion = 0;
        switch (op) {
            case 1:
                do {
                    opcion = seleccionMenu(menuPersona);
                    accionaSeleccionPersona(opcion);
                } while(opcion != menuPersona.length);
                break;
            case 2:
                this.reservaServicio.crearReserva(this.personaServicio.getPersonas(), this.habitacionServicio.getHabitaciones());
                break;
            case 3:
                this.reservaServicio.listarReservas();
                break;
            case 4:
                break;
        }
    }

    private void accionaSeleccionPersona(int op) {
        switch (op) {
            case 1:
                this.personaServicio.fabricaPersonas();
                break;
            case 2:
                this.personaServicio.listarPersonas();
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
    }
}
