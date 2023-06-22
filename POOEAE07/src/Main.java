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
        boolean salir = false;
        do {
            Persona perSel = seleccionaPersona(personas);
            System.out.println("persona seleccionada: " + perSel.getNombre().toUpperCase());
            if (ps.esMayorDeEdad(perSel)) {
                System.out.println("es mayor de edad");
            } else {
                System.out.println("es menor de edad");
            }
            if (ps.calcularIMC(perSel) == -1) {
                System.out.println("esta por debajo de su peso");
            } else if (ps.calcularIMC(perSel) == 0) {
                System.out.println("esta en su peso");
            } else {
                System.out.println("esta por encima de su peso");
            }
            System.out.println("desea salir (s/n):");
            salir = scan.nextLine().equals("s");
        } while(!salir);
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
            op = Integer.parseInt(scan.nextLine());
        } while (op >= personas.length);
        return personas[op];
    }
}