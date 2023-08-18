package servicios;

import entidades.Perro;
import entidades.Persona;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RefugioPerros {
    private Scanner scan;
    private List<Persona> personas;
    private List<Perro> perros;

    public RefugioPerros() {
        this.perros = new ArrayList<>();
        this.personas = new ArrayList<>();
        scan = new Scanner(System.in);
        cargarDatos();
    }

    public void listarPersonas() {
        this.personas.forEach(persona -> System.out.println(persona));
    }

    public void listarPerros() {
        this.perros.forEach(perro -> System.out.println(perro));
    }

    public void adoptar() {
        listarPerros();
        for (int i = 0; i < this.personas.size(); i++) {
            System.out.println("hola " + this.personas.get(i).getNombre());
            System.out.println("ingrese el nombre del perro a adoptar");
            if (!buscaAdopcion(scan.nextLine(), this.personas.get(i))) i--;
        }
    }

    private boolean buscaAdopcion(String nombre, Persona persona) {
        for (Perro perro : this.perros ) {
            if (perro.getNombre().equals(nombre)) {
                if (perro.getAdoptado()) {
                    System.out.println("lo sentimos " + perro.getNombre() + " ya está adoptado");
                    return false;
                } else {
                    persona.setPerros(perro);
                    perro.setAdoptado(true);
                    System.out.println("felicitaciones, tiene un nuevo integrante del hogar!!!");
                    return true;
                }
            }
        }
        System.out.println("el perro de nombre " + nombre + " no se encuentra registrado en el sistema\nvuelva a intentarlo");
        return false;
    }

    public void cargarDatos() {
        this.perros.add(new Perro("Firulais", "cocker", 3, "mediano"));
        this.perros.add(new Perro("Chiquito", "mastin", 2, "grande"));
        this.perros.add(new Perro("Brutus", "chihuahua", 4, "pequeño"));
        this.perros.add(new Perro("Kimba", "dalmata", 3, "grande"));

        this.personas.add(new Persona("Pablo", "Vargas", 35, "12345678"));
        this.personas.add(new Persona("Paola", "Garcia", 25, "23456781"));
        this.personas.add(new Persona("Pedro", "Quispe", 15, "34567812"));
        this.personas.add(new Persona("Penelope", "Huaman", 20, "45678123"));
    }
}
