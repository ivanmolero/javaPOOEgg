package org.example;

import org.example.entidades.Persona;

public class Main {
    public static void main(String[] args) {
        Persona persona = null;
        try {
            System.out.println(persona.esMayorDeEdad());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}