package entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baraja {
    private List<Carta> tieneCartas;
    private List<Carta> monton;
    public Baraja() {
        this.tieneCartas = new ArrayList<>();
        this.monton = new ArrayList<>();
        cargarCartasIniciales();
    }

    private void cargarCartasIniciales() {
        String[] palos = {
                "ESPADAS",
                "BASTOS",
                "OROS",
                "COPAS"
        };
        for (String palo : palos) {
            for (int i = 1; i <= 12; i++) {
                if (i != 8 && i != 9) {
                    this.tieneCartas.add(new Carta(i, palo));
                }
            }
        }
        this.monton = new ArrayList<>();
    }

    public void barajar() {
        Collections.shuffle(this.tieneCartas);
    }

    public Carta siguienteCarta() {
        Carta carta = this.tieneCartas.get(0);
        this.monton.add(carta);
        this.tieneCartas.remove(carta);
        return carta;
    }

    public Integer cartaDisponible() {
        return this.tieneCartas.size();
    }

    public List<Carta> darCartas(Integer cantidad) {
        List<Carta> entregaCartas = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            entregaCartas.add(siguienteCarta());
        }
        return entregaCartas;
    }

    public void cartasMonton() {
        this.monton.forEach(carta -> System.out.println(carta));
    }

    public void mostrarBaraja() {
        this.tieneCartas.forEach(carta -> System.out.println(carta));
    }
}
