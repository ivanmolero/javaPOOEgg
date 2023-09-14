package org.example.entidades;

import java.util.Scanner;

public final class Servicio extends Empleado{
    private String seccion;

    public Servicio() {
    }

    public Servicio(String nombre, String apellidos, String identificacion, EstadoCivil estadoCivil, Integer incorporacion, Integer despacho, String seccion) {
        super(nombre, apellidos, identificacion, estadoCivil, incorporacion, despacho);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public void trasladoSeccion() {
        Scanner scan = new Scanner(System.in);
        System.out.println("la seccion actual es: " + this.seccion);
        System.out.println("ingrese la nueva sección: ");
        this.seccion = scan.nextLine();
    }
}
