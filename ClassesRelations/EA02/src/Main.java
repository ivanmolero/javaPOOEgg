import entidades.Juego;
import entidades.Jugador;
import entidades.Revolver;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("ingrese la cantidad de jugadores: ");
        int limite = Integer.parseInt(scan.nextLine());
        List<Jugador> jugadores = new ArrayList<>();
        for (int i = 0; i < limite; i++) {
            jugadores.add(new Jugador((i + 1), "Jugador " + (i + 1)));
        }
        System.out.print("ingrese el tamaño del tambor: ");
        Revolver revolver = new Revolver(Integer.parseInt(scan.nextLine()));
        revolver.llenarRevolver();
        System.out.println(revolver);
        Juego juego = new Juego();
        juego.llenarJuego(jugadores, revolver);
        juego.ronda();

    }
}