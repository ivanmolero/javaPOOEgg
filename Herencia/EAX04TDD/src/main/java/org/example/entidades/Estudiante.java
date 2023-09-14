package org.example.entidades;

import java.util.Scanner;

public final class Estudiante extends Persona{
    private String curso;

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellidos, String identificacion, EstadoCivil estadoCivil, String curso) {
        super(nombre, apellidos, identificacion, estadoCivil);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void matricularEstudiante() {
        Scanner scan = new Scanner(System.in);
        System.out.println("el curso matriculado es: " + this.curso);
        System.out.println("ingrese el nuevo curso: ");
        this.curso = scan.nextLine();
    }
}
