package servicios;

import entidades.Ahorcado;

import java.util.Scanner;

public class AhorcadoServicio {
    Scanner scan = new Scanner(System.in);
    public Ahorcado crearAhorcado() {
        Ahorcado ahorcado = new Ahorcado();
        System.out.println("CONFIGURACIÓN INICIAL");
        System.out.println("ingrese la palabra: ");
        ahorcado.setPalabraBuscar(scan.nextLine().trim().toLowerCase());
        System.out.println("ingrese la cantidad máxima de intentos: ");
        ahorcado.setCantidadJugadasMax(Integer.parseInt(scan.nextLine()));
        return ahorcado;
    }

    public int longitud(Ahorcado ahorcado) {
        return ahorcado.getArregloPalabra().length;
    }

    public boolean encontradas(Ahorcado ahorcado, String letra) {
        if (ahorcado.getPalabraBuscar().contains(letra)) {
            for (int i = 0; i < longitud(ahorcado); i++) {
                if (letra.equals(ahorcado.getArregloPalabra()[i])) {
                    ahorcado.getAvancePalabra()[i] = letra;
                    ahorcado.setLetrasEncontradas(ahorcado.getLetrasEncontradas() + 1);
                }
            }
            System.out.println("la letra " + letra + " si se encuentra en la palabra");
        } else {
            System.out.println("la letra " + letra + " no se encuentra en la palabra");
        }
        System.out.println("avance de " + ahorcado.getLetrasEncontradas() + "/" + longitud(ahorcado));
        ahorcado.setCantidadJugadasActual(ahorcado.getCantidadJugadasActual() + 1);
        return ahorcado.getPalabraBuscar().contains(letra);
    }

    public void juego(Ahorcado ahorcado) {
        do {
            System.out.println("palabra a buscar: ");
            mostrarArreglo(ahorcado.getAvancePalabra());
            System.out.println("longitud de la palabra: " + longitud(ahorcado));
            System.out.println("jugadas pendientes: " + (ahorcado.getCantidadJugadasMax() - ahorcado.getCantidadJugadasActual()));
            System.out.println("ingrese una letra a buscar: ");
            encontradas(ahorcado, scan.nextLine());
        } while(continuaJugando(ahorcado));

        if (comparaPalabra(ahorcado)) {
            System.out.println("Correcto!!!, adivinó la palabra");
        } else {
            System.out.println("adivine la palabra: ");
            String palabra = scan.nextLine();
            if (palabra.equals(ahorcado.getPalabraBuscar())) {
                System.out.println("Correcto!!!, adivinó la palabra");
            } else {
                System.out.println("Lo sentimos, no adivinó la palabra");
            }
        }
    }

    private boolean continuaJugando(Ahorcado ahorcado) {
        if (!comparaPalabra(ahorcado)) {
            return ahorcado.getCantidadJugadasActual() < ahorcado.getCantidadJugadasMax();
        }
        return false;
    }

    private boolean comparaPalabra(Ahorcado ahorcado) {
        boolean compara = true;
        for (int i = 0; i < ahorcado.getArregloPalabra().length; i++) {
            compara = compara && ahorcado.getArregloPalabra()[i].equals(ahorcado.getAvancePalabra()[i]);
        }
        return compara;
    }

    private void mostrarArreglo(String[] avancePalabra) {
        for (int i = 0; i < avancePalabra.length; i++) {
            System.out.print(avancePalabra[i]);
        }
        System.out.println();
    }
}
