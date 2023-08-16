package servicios;

import entidades.Perro;

import java.util.Scanner;

public class PerroServicio {
    Scanner scan;

    public PerroServicio() {
        this.scan = new Scanner(System.in);
    }

    public Perro crearPerro() {
        Perro perro = new Perro();
        System.out.print("ingrese el nombre del perro: ");
        perro.setNombre(scan.nextLine());
        System.out.print("ingrese el tamaño del perro: ");
        perro.setTamanio(scan.nextLine());
        System.out.print("ingrese la edad del perro: ");
        perro.setEdad(Integer.parseInt(scan.nextLine()));
        System.out.print("ingrese la raza del perro: ");
        perro.setRaza(scan.nextLine());
        return perro;
    }
}
