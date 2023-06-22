import entidades.Persona;
import servicios.PersonaServicio;

import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        PersonaServicio ps = new PersonaServicio();
        Persona[] personas = new Persona[4];
        for (int i = 0; i < personas.length; i++) {
            personas[i] = ps.crearPersona();
        }
        do {
            Persona perSel = seleccionaPersona(personas);
            System.out.println("persona seleccionada: " + perSel.getNombre().toUpperCase());
        } while(true);
    }

    public static Persona seleccionaPersona(Persona[] personas) {
        System.out.println("Seleccione la persona: ");
        int i = 0, op = 0;
        do {
            for (Persona per: personas) {
                System.out.println(i + ". " + per.getNombre());
                i++;
            }
            System.out.println("ingrese un valor: ");
            op = scan.nextInt();
        } while (op >= personas.length);
        return personas[op];
    }
}