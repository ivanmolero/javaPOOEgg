package org.example;

import org.example.entidades.Edificio;
import org.example.entidades.EdificioDeOficinas;
import org.example.entidades.Polideportivo;
import org.example.entidades.TipoInstalacion;
import org.example.servicios.EdificioServicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Edificio> edificios = new ArrayList<>();
        edificios.add(new Polideportivo(50, 30, 100, "polideportivo 01", TipoInstalacion.ABIERTO));
        edificios.add(new Polideportivo(50, 30, 80, "polideportivo 02", TipoInstalacion.ABIERTO));
        edificios.add(new Polideportivo(60, 30, 70, "polideportivo 03", TipoInstalacion.TECHADO));
        edificios.add(new Polideportivo(50, 45, 100, "polideportivo 04", TipoInstalacion.ABIERTO));
        edificios.add(new Polideportivo(70, 30, 100, "polideportivo 05", TipoInstalacion.TECHADO));
        edificios.add(new EdificioDeOficinas(25, 45, 10, 15, 65, 15));
        edificios.add(new EdificioDeOficinas(30, 55, 15, 20, 70, 20));
        edificios.add(new EdificioDeOficinas(35, 65, 20, 25, 75, 25));
        edificios.add(new EdificioDeOficinas(45, 75, 25, 30, 80, 30));

        Collections.shuffle(edificios);

        EdificioServicio edificioServicio = new EdificioServicio();
        edificioServicio.contarPolideportivos(edificios);
        edificioServicio.mostrarEdificioOficinas(edificios);
        edificioServicio.mostrarSuperficieVolumen(edificios);
    }
}