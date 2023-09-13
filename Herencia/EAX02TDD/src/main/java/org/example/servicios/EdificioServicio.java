package org.example.servicios;

import org.example.entidades.Edificio;
import org.example.entidades.EdificioDeOficinas;
import org.example.entidades.Polideportivo;
import org.example.entidades.TipoInstalacion;

import java.util.List;

public class EdificioServicio {
    public void mostrarSuperficieVolumen(List<Edificio> edificios) {
        edificios.forEach(
                edificio -> {
                    System.out.println("la superficie del edificio es: " + edificio.calcularSuperficie());
                    System.out.println("el volumen del edificio es: " + edificio.calcularVolumen());
                }
        );
    }

    public void contarPolideportivos(List<Edificio> edificios) {
        int techado = 0, abierto = 0;
        for (Edificio edificio : edificios) {
            if (edificio instanceof Polideportivo) {
                if (((Polideportivo) edificio).getTipoInstalacion().equals(TipoInstalacion.ABIERTO)) {
                    abierto++;
                } else {
                    techado++;
                }
            }
        }
        System.out.println("los polideportivos son: " + (techado + abierto));
        System.out.println("los polideportivos techados son: " + techado);
        System.out.println("los polideportivos abiertos son: " + abierto);
    }

    public void mostrarEdificioOficinas(List<Edificio> edificios) {
        for (Edificio edificio : edificios) {
            if (edificio instanceof EdificioDeOficinas) ((EdificioDeOficinas) edificio).cantPersonas();
        }
    }
}
