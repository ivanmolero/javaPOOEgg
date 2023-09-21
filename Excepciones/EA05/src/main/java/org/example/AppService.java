package org.example;

import java.util.Scanner;

public class AppService {
    public void iniciar() {
        Scanner scan = new Scanner(System.in);
        System.out.println("ADIVINE EL NUMERO (1-500)");
        int numero = (int)(Math.random() * 499 + 1);
        int ingreso = 0, cont = 0;
        do {
            System.out.println("adivine el numero: ");
            try {
                ingreso = Integer.parseInt(scan.nextLine());
                if (ingreso > numero) {
                    System.out.println("el valor ingresado es mayor");
                } else if (ingreso < numero) {
                    System.out.println("el valor ingresado es menor");
                }
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                throw e;
            } finally {
                System.out.println("se ejecuta al final");
            }
            System.out.println("sumando intento");
            cont++;
        } while (numero != ingreso);
        System.out.println("adivino el numero en " + cont + " intentos");
    }
}
