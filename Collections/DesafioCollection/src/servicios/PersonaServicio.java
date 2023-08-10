package servicios;

import entidades.Persona;

import java.util.*;

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

    public void editarPersona() {
        Persona persona = seleccionarPersona();
        String[] seleccion = {
                "Nombre:\t" + persona.getNombre(),
                "DNI:\t" + persona.getDni(),
                "Pais:\t" + persona.getPais(),
                "Edad:\t" + persona.getEdad()
        };
        int op = 0;
        do {
            for (int i = 0; i < seleccion.length; i++) {
                System.out.println((i + 1) + " - " + seleccion[i]);
            }
            System.out.print("seleccione el elemento a editar: ");
            op = Integer.parseInt(scan.nextLine());
            switch (op) {
                case 1:
                    System.out.print("ingrese el nuevo nombre: ");
                    persona.setNombre(scan.nextLine());
                    break;
                case 2:
                    System.out.print("ingrese el nuevo dni: ");
                    persona.setDni(scan.nextLine());
                    break;
                case 3:
                    System.out.println("ingrese el nuevo pais: ");
                    persona.setPais(scan.nextLine());
                    break;
                case 4:
                    System.out.println("ingrese la nueva edad: ");
                    persona.setEdad(Integer.parseInt(scan.nextLine()));
                    break;
            }
            System.out.print("desea seguir editando el registro? (S/N): ");
        } while(scan.nextLine().equalsIgnoreCase("s"));
    }

    public void eliminarPersona() {
        Persona persona = seleccionarPersona();
        System.out.println("está seguro de eliminar a la persona " + persona.getNombre() + "? (S/N): ");
        if (scan.nextLine().equalsIgnoreCase("s")) {
            this.personas.remove(persona.getDni());
            System.out.println("registro eliminado con éxito");
        } else {
            System.out.println("no se ha elimniado ningún registro");
        }
    }

    private Persona seleccionarPersona() {
        String dni = "";
        do {
            this.listarPersonas();
            System.out.print("ingrese el dni de la persona a seleccionar: ");
            dni = scan.nextLine().trim();
            if (personas.containsKey(dni)) {
                return personas.get(dni);
            } else {
                System.out.println("el dni ingresado no esta en la lista");
            }
        } while(true);
    }
}
