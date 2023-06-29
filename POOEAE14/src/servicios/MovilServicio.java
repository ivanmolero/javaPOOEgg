package servicios;

import entidades.Movil;

import java.util.Scanner;

public class MovilServicio {
    Scanner scan = new Scanner(System.in);

    public Movil cargarCelular() {
        Movil movil = new Movil();
        System.out.println("ingrese la marca del celular: ");
        movil.setMarca(scan.nextLine());
        System.out.println("ingrese el modelo del celular: ");
        movil.setModelo(scan.nextLine());
        System.out.println("ingrese el precio del celular: ");
        movil.setPrecio(Double.parseDouble(scan.nextLine()));
        System.out.println("ingrese la cantidad de memoria RAM: ");
        movil.setMemoriaRam(Integer.parseInt(scan.nextLine()));
        System.out.println("ingrese la cantidad de almacenamiento: ");
        movil.setAlmacenamiento(Integer.parseInt(scan.nextLine()));
        ingresarCodigo(movil);
        return movil;
    }

    private void ingresarCodigo(Movil movil) {
        for (int i = 0; i < movil.getCodigo().length; i++) {
            System.out.println("ingrese el elemento " + (i + 1) + " del código: ");
            movil.getCodigo()[i] = Integer.parseInt(scan.nextLine());
        }
    }
}
