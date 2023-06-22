package servicios;

import entidades.Cadena;

import java.util.Arrays;
import java.util.Scanner;

public class CadenaServicio {
    Scanner scan = new Scanner(System.in);

    public Cadena crearCadena(){
        Cadena cadena = new Cadena();
        System.out.println("ingrese la frase: ");
        cadena.setFrase(scan.nextLine());
        cadena.setLongitud(cadena.getFrase().length());
        return cadena;
    }

    public int mostrarVocales(Cadena cadena) {
        String frase = cadena.getFrase();
        int longitud = cadena.getLongitud();
        String vocales = "aeiou";
        int cont = 0;
        for (int i = 0; i < longitud; i++) {
            if (vocales.contains(frase.substring(i, i+1))) {
                cont++;
            }
        }
        return cont;
    }

    public String invertirFrase(Cadena cadena) {
        String frase = cadena.getFrase();
        String reverso = new StringBuilder(frase).reverse().toString();
        return reverso;
    }

    public int contabilizarCaracter(Cadena cadena) {
        String frase = cadena.getFrase();
        int longitud = cadena.getLongitud();
        String buscar = "";
        do {
            System.out.println("ingrese el caracter a buscar");
            buscar = scan.nextLine();
        } while(buscar.length() > 1);
        int contador = 0;
        for (int i = 0; i < longitud; i++) {
            if (buscar.contains(frase.substring(i, i + 1))) {
                contador++;
            }
        }
        if (contador == 0) {
            System.out.println("no se encuentra el caracter");
        }
        return contador;
    }

    public void compararLongitud(Cadena cadena) {
        int longitud = cadena.getLongitud();
        System.out.println("ingrese una nueva frase a comparar: ");
        String nuevaFrase = scan.nextLine();
        int nuevaLongitud = nuevaFrase.length();
        if (longitud > nuevaLongitud) {
            System.out.println("la nueva frase es más corta que la anterior");
        } else {
            System.out.println("la nueva frase es más larga que la anterior");
        }
    }

    public void unirFrases(Cadena cadena) {
        String frase = cadena.getFrase();
        System.out.println("ingrese una frase a unir: ");
        String nuevaFrase = scan.nextLine();
        frase = frase + nuevaFrase;
        System.out.println("la nueva frase es: \n" + frase);
    }

    public void reemplazar(Cadena cadena) {
        String frase = cadena.getFrase();
        System.out.println("ingrese el nuevo caracter: ");
        String reemplazo = scan.nextLine();
        frase = frase.replaceAll("a", reemplazo);
        System.out.println("la nueva cadena es: \n" + frase);
    }

    public boolean contiene(Cadena cadena) {
        String frase = cadena.getFrase();
        String letra = "";
        do {
            System.out.println("ingrese la letra a buscar: ");
            letra = scan.nextLine();
        } while(letra.length() > 1);
        return frase.contains(letra);
    }
}
