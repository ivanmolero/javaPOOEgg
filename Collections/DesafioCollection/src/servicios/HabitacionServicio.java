package servicios;

import entidades.Habitacion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HabitacionServicio {
    private Map<Integer, Habitacion> habitaciones;

    public HabitacionServicio() {
        this.habitaciones = new HashMap<>();
        generaHabitaciones();
    }

    public Map<Integer, Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void generaHabitaciones() {
        for (int i = 0; i < 10; i++) {
            if (i < 5) {
                this.habitaciones.put(i, new Habitacion(i + 1, 2));
            } else if (i < 8) {
                this.habitaciones.put(i, new Habitacion(i, 3));
            } else {
                this.habitaciones.put(i, new Habitacion(i, 1));
            }
        }
    }
}
