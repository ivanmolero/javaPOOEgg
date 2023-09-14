package org.example.entidades;

import java.util.Scanner;

public final class Profesor extends Empleado{
    private String departamento;

    public Profesor() {
    }

    public Profesor(String nombre, String apellidos, String identificacion, EstadoCivil estadoCivil, Integer incorporacion, Integer despacho, String departamento) {
        super(nombre, apellidos, identificacion, estadoCivil, incorporacion, despacho);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void cambioDepartamento(){
        Scanner scan = new Scanner(System.in);
        System.out.println("el departamento actual es: " + this.departamento);
        System.out.println("ingrese el nuevo departamento: ");
        this.departamento = scan.nextLine();
    }
}
