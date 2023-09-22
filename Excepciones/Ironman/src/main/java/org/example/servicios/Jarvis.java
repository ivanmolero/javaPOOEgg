package org.example.servicios;

import org.example.entidades.Armadura;

public class Jarvis {
    private Armadura armadura;

    public Jarvis() {

    }

    public Jarvis(Armadura armadura) {
        this.armadura = armadura;
    }

    public void estadoGeneral() {
        System.out.println(armadura.toString());
    }

    public void estadoBateria() {

    }
}
