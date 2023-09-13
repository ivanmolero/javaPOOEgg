package org.example.servicios;

import org.example.entidades.Alojamiento;
import org.example.entidades.Camping;
import org.example.entidades.Hotel;
import org.example.entidades.Residencia;

import java.util.ArrayList;
import java.util.List;

public class AlojamientoServicio {
    public List<Alojamiento> listaHotelesOrdenada(List<Alojamiento> alojamientos) {
        List<Alojamiento> salida = new ArrayList<>();
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Hotel) salida.add(alojamiento);
        }
        salida.sort(
                (o1, o2) -> ((Hotel)o2).getPrecioHabitacion().compareTo(((Hotel)o1).getPrecioHabitacion())
        );
        return salida;
    }

    public List<Alojamiento> listaCampingRestaurante(List<Alojamiento> alojamientos) {
        List<Alojamiento> salida = new ArrayList<>();
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Camping && ((Camping) alojamiento).getTieneRestaurante()) salida.add(alojamiento);
        }
        return salida;
    }

    public List<Alojamiento> listaResidenciaDescuento(List<Alojamiento> alojamientos) {
        List<Alojamiento> salida = new ArrayList<>();
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Residencia && ((Residencia)alojamiento).getDescuentoGremio()) salida.add(alojamiento);
        }
        return salida;
    }
}
