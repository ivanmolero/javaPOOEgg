package org.example.entidades;

import java.util.Scanner;

public abstract class Empleado extends Persona{
    protected Integer incorporacion;
    protected Integer despacho;

    public Empleado() {
    }

    public Empleado(String nombre, String apellidos, String identificacion, EstadoCivil estadoCivil, Integer incorporacion, Integer despacho) {
        super(nombre, apellidos, identificacion, estadoCivil);
        this.incorporacion = incorporacion;
        this.despacho = despacho;
    }

    public Integer getIncorporacion() {
        return incorporacion;
    }

    public void setIncorporacion(Integer incorporacion) {
        this.incorporacion = incorporacion;
    }

    public Integer getDespacho() {
        return despacho;
    }

    public void setDespacho(Integer despacho) {
        this.despacho = despacho;
    }

    public void reasignaDespacho() {
        Scanner scan = new Scanner(System.in);
        System.out.println("despacho actual: " + this.despacho);
        System.out.println("ingrese el nuevo despacho: ");
        this.despacho = Integer.parseInt(scan.nextLine());
    }
}
