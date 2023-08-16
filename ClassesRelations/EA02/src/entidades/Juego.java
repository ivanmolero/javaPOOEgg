package entidades;

import java.util.Collections;
import java.util.List;

public class Juego {
    private List<Jugador> tieneJugadores;
    private Revolver tieneRevolver;

    public Juego() {
    }

    public Juego(List<Jugador> tieneJugadores, Revolver tieneRevolver) {
        this.tieneJugadores = tieneJugadores;
        this.tieneRevolver = tieneRevolver;
    }

    public List<Jugador> getTieneJugadores() {
        return tieneJugadores;
    }

    public void setTieneJugadores(List<Jugador> tieneJugadores) {
        this.tieneJugadores = tieneJugadores;
    }

    public Revolver getTieneRevolver() {
        return tieneRevolver;
    }

    public void setTieneRevolver(Revolver tieneRevolver) {
        this.tieneRevolver = tieneRevolver;
    }

    public void llenarJuego(List<Jugador> jugadores, Revolver revolver) {
        Collections.shuffle(jugadores);
        this.tieneJugadores = jugadores;
        this.tieneRevolver = revolver;
    }

    public void ronda() {
        int posicion = 0;
        do {
            Jugador jugador = this.tieneJugadores.get(posicion);
            if (jugador.disparo(this.tieneRevolver)) {
                System.out.println("juego finalizado");
                System.out.println(jugador);
                return;
            }
            System.out.println(jugador);
            System.out.println(this.tieneRevolver);
            posicion++;
            if (posicion == this.tieneJugadores.size()) posicion = 0;
        } while(true);
    }
}
