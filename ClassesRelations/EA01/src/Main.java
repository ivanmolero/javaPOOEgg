import entidades.Perro;
import entidades.Persona;
import servicios.PerroServicio;
import servicios.PersonaServicio;

public class Main {
    public static void main(String[] args) {
        PersonaServicio personaServicio = new PersonaServicio();
        Persona persona01 = personaServicio.crearPersona();
        Persona persona02 = personaServicio.crearPersona();
        PerroServicio perroServicio = new PerroServicio();
        Perro perro01 = perroServicio.crearPerro();
        Perro perro02 = perroServicio.crearPerro();
        persona01.setPerro(perro02);
        persona02.setPerro(perro01);
        System.out.println(persona01);
        System.out.println(persona02);
    }
}