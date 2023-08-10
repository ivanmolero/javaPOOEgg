package servicios;

import entidades.Persona;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PersonaServicio {
    private Scanner scan;
    private Map<String, Persona> personas;

    public PersonaServicio() {
        this.scan = new Scanner(System.in);
        this.personas = new HashMap<>();
    }

    public Persona crearPersona() {
        Persona persona = new Persona();
        System.out.print("ingrese el nombre: ");
        persona.setNombre(scan.nextLine());
        System.out.print("ingrese el DNI: ");
        persona.setDni(scan.nextLine());
        System.out.print("ingrese la edad: ");
        persona.setEdad(Integer.parseInt(scan.nextLine()));
        System.out.print("ingrese el pais: ");
        persona.setPais(scan.nextLine());
        return persona;
    }

    public void agregaPersona(Persona persona) {
        personas.put(persona.getDni(), persona);
    }

    public void fabricaPersonas() {
        do {
            agregaPersona(crearPersona());
            System.out.println("desea seguir ingresando personas? (S/N)");
        } while (scan.nextLine().equalsIgnoreCase("s"));
    }

    public void listarPersonas() {
        personas.forEach((s, persona) -> System.out.println(persona));
    }

    public Map<String, Persona> getPersonas() {
        return personas;
    }
}
