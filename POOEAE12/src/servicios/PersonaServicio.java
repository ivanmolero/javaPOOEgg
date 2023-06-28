package servicios;

import entidades.Persona;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class PersonaServicio {
    private Scanner scan = new Scanner(System.in);

    public Persona creaPersona() {
        Persona persona = new Persona();
        System.out.println("ingrese el nombre de la persona: ");
        persona.setNombre(scan.nextLine());
        System.out.println("ingrese la fecha de nacimiento (dd/mm/yyyy): ");
        persona.setFechaNacimiento(LocalDate.parse(scan.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        return persona;
    }

    public int calcularEdad(Persona persona) {
        LocalDate nacimiento = persona.getFechaNacimiento();
        LocalDate actual = LocalDate.now();
        return Period.between(nacimiento, actual).getYears();
    }

    public boolean menorQue(Persona persona1, Persona persona2) {
        LocalDate nacimiento1 = persona1.getFechaNacimiento();
        LocalDate nacimiento2 = persona2.getFechaNacimiento();
        return nacimiento1.isBefore(nacimiento2);
    }

    public void mostrarPersona(Persona persona) {
        System.out.println(persona);
    }
}
