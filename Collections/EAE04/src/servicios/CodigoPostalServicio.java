package servicios;

import java.util.Map;
import java.util.Scanner;

public class CodigoPostalServicio {
    Scanner scan;

    public CodigoPostalServicio() {
        this.scan = new Scanner(System.in);
    }

    public void crearCodigoPostal(Map<Integer, String> ciudades) {
        System.out.println("ingrese el nombre de la ciudad");
        String nombre = scan.nextLine();
        System.out.println("ingrese el codigo postal");
        int codigo = Integer.parseInt(scan.nextLine());
        ciudades.put(codigo, nombre);
    }

    public void fabricaCodigoPostal(Map<Integer, String> ciudades) {
        do {
            crearCodigoPostal(ciudades);
            System.out.println("desea seguir ingresando datos? (S/N)");
        } while(scan.nextLine().equalsIgnoreCase("s"));
    }

    public void listarCodigoPostal(Map<Integer, String> ciudades) {
        ciudades.forEach((integer, s) -> System.out.printf("ciudad: %s - codigo postal: %d\n", s, integer));
    }

    public void buscaCiudad(Map<Integer, String> ciudades) {
        System.out.println("ingrese el código postal a buscar");
        int codigo = Integer.parseInt(scan.nextLine());
        if (ciudades.containsKey(codigo)) {
            System.out.printf("el codigo %d corresponde a la ciudad %s\n", codigo, ciudades.get(codigo));
        } else {
            System.out.println("el codigo ingresado no esta en la lista");
        }
    }

    public void eliminaCiudad(Map<Integer, String> ciudades) {
        System.out.println("ingrese el código de la ciudad a eliminar");
        int codigo = Integer.parseInt(scan.nextLine());
        if (ciudades.containsKey(codigo)) {
            System.out.printf("esta seguro de eliminar la ciudad %s con código %d? (S/N)\n", ciudades.get(codigo), codigo);
            if (scan.nextLine().equalsIgnoreCase("s")) {
                ciudades.remove(codigo);
                System.out.println("ciudad eliminada con exito");
            }
        } else {
            System.out.println("la codigo postal no se encuentra en la lista");
        }
    }
}
