package servicios;

import entidades.RazaPerro;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class RazasService {
    Scanner scan;
    List<RazaPerro> razas;

    public RazasService() {
        this.razas = new ArrayList<>();
        scan = new Scanner(System.in);
    }

    public void fabricaRazas() {
        RazaPerro razaPerro;
        do {
            razaPerro = crearRaza();
            agregarRaza(razaPerro);
            System.out.println(razaPerro.toString());
            System.out.println("desea seguir ingresando razas? (s/n): ");
        } while(scan.nextLine().equalsIgnoreCase("s"));
        listarRazas();
    }

    public void fabricaRazas(int cantidad, String nombre) {
        RazaPerro razaPerro;
        for (int i = 0; i < cantidad; i++) {
            razaPerro = new RazaPerro(nombre + " " + i);
            agregarRaza(razaPerro);
        }
    }

    public RazaPerro crearRaza() {
        RazaPerro razaPerro = new RazaPerro();
        System.out.println("ingrese la raza de perro: ");
        razaPerro.setNombreRaza(scan.nextLine());
        return razaPerro;
    }

    public void agregarRaza(RazaPerro razaPerro) {
        this.razas.add(razaPerro);
    }

    public void listarRazas() {
        for (RazaPerro raza : this.razas) {
            System.out.println(raza);
        }
        System.out.println("la cantidad de razas registradas es: " + razas.size());
    }

    public void eliminarRaza() {
        System.out.println("ingrese el nombre de la raza a eliminar de la lista");
        String razaEliminar = scan.nextLine();
        if (existeRazaNombre(razaEliminar)) {
            Iterator<RazaPerro> it = razas.iterator();
            while (it.hasNext()) {
                if (it.next().getNombreRaza().equalsIgnoreCase(razaEliminar)) {
                    it.remove();
                    System.out.println("eliminado el registro");
                }
            }
        } else {
            System.out.println("la raza " + razaEliminar + " no se encunetra en la lista");
        }
        listarRazas();
    }

    private boolean existeRazaNombre(String razaEliminar) {
        for (RazaPerro razaPerro : this.razas) {
            if (razaPerro.getNombreRaza().equalsIgnoreCase(razaEliminar)) {
                return true;
            }
        }
        return false;
    }
}
