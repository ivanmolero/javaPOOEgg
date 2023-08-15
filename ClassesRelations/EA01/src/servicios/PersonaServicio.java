package servicios;

import entidades.Persona;

import java.util.Scanner;

public class PersonaServicio {
    private Scanner scan;

    public PersonaServicio() {
        this.scan = new Scanner(System.in);
    }

    public Persona crearPersona() {
        Persona persona = new Persona();
        System.out.print("ingrese el nombre: ");
        persona.setNombre(scan.nextLine());
        System.out.print("ingrese el apellido: ");
        persona.setApellido(scan.nextLine());
        System.out.print("ingrese la edad: ");
        persona.setEdad(Integer.parseInt(scan.nextLine()));
        System.out.print("ingrese el número de documento: ");
        persona.setDocumento(scan.nextLine());
        return persona;
    }
}
