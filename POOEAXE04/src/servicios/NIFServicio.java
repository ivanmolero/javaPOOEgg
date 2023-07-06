package servicios;

import entidades.NIF;

import java.util.Scanner;

public class NIFServicio {
    Scanner scan = new Scanner(System.in);
    String[] letraSeguridad = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
    public NIF crearNIF() {
        NIF nif = new NIF();
        System.out.println("Crear un nuevo NIF");
        System.out.println("ingrese el número del dni: ");
        nif.setDni(scan.nextLine());
        nif.setLetra(letraSeguridad[(int) (Long.parseLong(nif.getDni()) % 23)]);
        return nif;
    }

    public void mostrar(NIF nif) {
        System.out.println("el dni es: " + nif.dni + "-" + nif.getLetra());
    }
}
