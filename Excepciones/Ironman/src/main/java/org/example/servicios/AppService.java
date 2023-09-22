package org.example.servicios;

import org.example.entidades.Armadura;

public class AppService {
    public void iniciar() {
        Jarvis jarvis = new Jarvis(new Armadura("ROJO", "DORADO", "60HR"));
        jarvis.estadoGeneral();
    }
}
