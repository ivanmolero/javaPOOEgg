package servicios;

import entidades.Persona;

import java.util.Scanner;

public class PersonaServicio {
    Scanner scan = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona(){
        Persona persona = new Persona();
        System.out.println("NUEVA PERSONA");
        System.out.print("ingrese el nombre: ");
        persona.setNombre(scan.nextLine());
        System.out.print("ingrese la edad: ");
        persona.setEdad(Integer.parseInt(scan.nextLine()));
        System.out.print("ingrese el peso en kg: ");
        persona.setPeso(Integer.parseInt(scan.nextLine()));
        System.out.print("ingrese la altura en metros: ");
        persona.setAltura(Double.parseDouble(scan.nextLine()));
        boolean validaSexo = false;
        do {
            System.out.println("ingrese el sexo (H/M/O):");
            String sexo = scan.nextLine().toUpperCase();
            validaSexo = !sexo.equals("H") && !sexo.equals("M") && !sexo.equals("O");
            if (validaSexo) {
                System.out.println("vuelva a ingresar el sexo, los valores son H (hombre) o M (mujer) o O (otro)");
            } else {
                persona.setSexo(sexo);
            }
        } while(validaSexo);
        return persona;
    }

    public boolean esMayorDeEdad(Persona persona) {
        return persona.getEdad() >= 18;
    }

    public int calcularIMC(Persona persona) {
        double imc = persona.getPeso() / Math.pow(persona.getAltura(), 2);
        if (imc < 20) {
            return -1;
        } else if (imc <= 25) {
            return 0;
        } else {
            return 1;
        }
    }
}
