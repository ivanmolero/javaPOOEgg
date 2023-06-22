import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona(15, "Juan"));
        personas.add(new Persona(10, "Ana"));
        personas.add(new Persona(18, "Alberto"));
        personas.add(new Persona(18, "Sofia"));
        personas.add(new Persona(18, "Pedro"));
        personas.add(new Persona(28, "Luana"));

        for (Persona persona: personas) {
            System.out.println(persona);
        }
        System.out.println();

        Collections.sort(personas, Comparator.comparingInt(Persona::getEdad).thenComparing(Comparator.comparing(Persona::getNombre)));

        for (Persona persona: personas) {
            System.out.println(persona);
        }
        System.out.println();
    }
}