import entidades.Persona;
import servicios.PersonaServicio;

public class Main {
    public static void main(String[] args) {
        PersonaServicio personaServicio = new PersonaServicio();
        Persona persona01 = personaServicio.crearPersona();
        Persona persona02 = personaServicio.crearPersona();
    }
}