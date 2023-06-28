import entidades.Persona;
import servicios.PersonaServicio;

import java.time.Period;

public class Main {
    public static void main(String[] args) {
        PersonaServicio ps = new PersonaServicio();
        Persona persona1 = ps.creaPersona();
        Persona persona2 = ps.creaPersona();
        ps.mostrarPersona(persona1);
        ps.mostrarPersona(persona2);
        System.out.println("la edad de " + persona1.getNombre() + " es: " + ps.calcularEdad(persona1) + " años");
        System.out.println("la edad de " + persona2.getNombre() + " es: " + ps.calcularEdad(persona2) + " años");
        System.out.println(persona1.getNombre() + " es menor que " + persona2.getNombre() + "?: " + ps.menorQue(persona1,persona2));
        System.out.println(Period.between(persona1.getFechaNacimiento(), persona2.getFechaNacimiento()).toString());
    }
}