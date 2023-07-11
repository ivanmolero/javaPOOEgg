package servicios;

import entidades.Ahorcado;

import java.util.Scanner;

public class AhorcadoServicio {
    Scanner scan = new Scanner(System.in);
    public Ahorcado crearJuego() {
        Ahorcado ahorcado = new Ahorcado();
        System.out.println("ingrese la palabra a buscar: ");
        ahorcado.setPalabra(scan.nextLine().toLowerCase().trim());
        System.out.println("ingrese la cantidad de jugadas máxima: ");
        ahorcado.setJugadasMaximas(Integer.parseInt(scan.nextLine()));
        System.out.print("\033[H\033[2J");
        System.out.flush();
        return ahorcado;
    }

    public void longitud(Ahorcado ahorcado) {
        System.out.println("la longitud de la palabra es: " + ahorcado.getVectorPalabra().length);
    }

    public void buscar(Ahorcado ahorcado, String letra) {
        if (ahorcado.getPalabra().contains(letra)) {
            System.out.println("la letra " + letra + " si se encuentra en la palabra");
        } else {
            System.out.println("la letra " + letra + " no se encuentra en la palabra");
        }
    }

    public boolean encontradas(Ahorcado ahorcado, String letra) {
        // cuidar que no ingrese nuevamente la misma letra
        String[] vectorPalabra = ahorcado.getVectorPalabra();
        String[] vectorAvance = ahorcado.getVectorAvance();
        if (ahorcado.getPalabra().contains(letra)) {
            for (int i = 0; i < vectorPalabra.length; i++) {
                if (vectorPalabra[i].equals(letra) && !vectorPalabra[i].equals(vectorAvance[i])) {
                    ahorcado.setLetrasEncontradas(ahorcado.getLetrasEncontradas() + 1);
                    vectorAvance[i] = letra;
                }
            }
        }
        return ahorcado.getPalabra().contains(letra);
    }

    public void intentos(Ahorcado ahorcado) {
        System.out.println("le quedan " + (ahorcado.getJugadasMaximas() - ahorcado.getJugadasRealizadas()) + " oportunidades");
    }

    public void juego(Ahorcado ahorcado) {
        String[] vectorAvance = ahorcado.getVectorAvance();
        do {
            longitud(ahorcado);
            mostrarVector(vectorAvance);
            System.out.println("tiene " + ahorcado.getLetrasEncontradas() + "/" + ahorcado.getVectorAvance().length + " letras encontradas");
            intentos(ahorcado);
            System.out.println("ingrese la letra a buscar: ");
            String letra = scan.nextLine().toLowerCase().trim();
            buscar(ahorcado, letra);
            encontradas(ahorcado, letra);// valor booleano
            ahorcado.setJugadasRealizadas(ahorcado.getJugadasRealizadas() + 1);
        } while(ahorcado.getJugadasMaximas() > ahorcado.getJugadasRealizadas() && ahorcado.getVectorPalabra().length > ahorcado.getLetrasEncontradas());
        if (ahorcado.getVectorPalabra().length == ahorcado.getLetrasEncontradas()) {
            System.out.println("gano!!!");
        } else {
            mostrarVector(vectorAvance);
            System.out.println("ingrese la palabra buscada: ");
            String palabra = scan.nextLine().toLowerCase().trim();
            if (palabra.equals(ahorcado.getPalabra())) {
                System.out.println("gano!!!");
            } else {
                System.out.println("lo sentimos, no hay más oportunidades");
            }
        }
        reiniciar(ahorcado);
    }

    private void reiniciar(Ahorcado ahorcado) {
        ahorcado.setPalabra(ahorcado.getPalabra());
        ahorcado.setJugadasMaximas(ahorcado.getJugadasMaximas());
    }

    private void mostrarVector(String[] vectorAvance) {
        for (String elemento : vectorAvance) {
            System.out.print(elemento);
        }
        System.out.println();
    }
}
