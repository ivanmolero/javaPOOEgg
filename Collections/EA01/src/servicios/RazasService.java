package servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RazasService {
    Scanner scan;
    List<String> razas;

    public RazasService() {
        this.razas = new ArrayList<>();
        scan = new Scanner(System.in);
    }

    public void guardarRazas() {
        do {
            System.out.println("ingrese la raza de perro: ");
            this.razas.add(scan.nextLine());
            System.out.println("desea seguir ingresando razas? (s/n): ");
        } while(scan.nextLine().equalsIgnoreCase("s"));
        listarRazas();
    }

    private void listarRazas() {
        for (String raza : this.razas) {
            System.out.println(raza);
        }
    }
}
