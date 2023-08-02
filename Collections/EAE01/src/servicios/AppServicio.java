package servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppServicio {
    private List<Integer> listaNumeros;
    private Scanner scan;

    public AppServicio() {
        this.listaNumeros = new ArrayList<>();
        this.scan = new Scanner(System.in);
    }

    public void iniciar() {
        this.cargarNumeros();
        System.out.printf("la cantidad de valores ingresados es: %d\n", this.listaNumeros.size());
        System.out.printf("la suma de los valores es: %d\n", this.suma());
        System.out.printf("el promedio de los valores es: %.2f\n", this.promedio());
    }

    private Double promedio() {
        return (1.0 * suma()) / this.listaNumeros.size();
    }

    private Integer suma() {
        int suma = 0;
        for (Integer numero : this.listaNumeros) {
            suma += numero;
        }
        return suma;
    }

    private void cargarNumeros() {
        Integer numero = 0;
        do {
            System.out.println("ingrese el numero a agregar: ");
            numero = Integer.parseInt(scan.nextLine());
            if (numero != -99) {
                this.listaNumeros.add(numero);
            } else {
                break;
            }
        } while(true);
    }
}
