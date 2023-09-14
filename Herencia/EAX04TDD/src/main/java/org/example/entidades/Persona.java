package org.example.entidades;

import java.util.Scanner;

public abstract class Persona {
    protected String nombre;
    protected String apellidos;
    protected String identificacion;
    protected EstadoCivil estadoCivil;

    public Persona() {
    }

    public Persona(String nombre, String apellidos, String identificacion, EstadoCivil estadoCivil) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.identificacion = identificacion;
        this.estadoCivil = estadoCivil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public void cambioEstadoCivil() {
        Scanner scan = new Scanner(System.in);
        System.out.println("estado civil actual: " + this.estadoCivil);
        System.out.println("seleccione el nuevo estado civil:");
        int i = 1;
        for (EstadoCivil estadoCivil : EstadoCivil.values()) {
            System.out.println("" + i + " - " + estadoCivil);
            i++;
        }
        System.out.println("ingrese la opción a cambiar:");
        int opcion = Integer.parseInt(scan.nextLine());
        this.estadoCivil = EstadoCivil.values()[opcion - 1];
    }
}
