package entidades;

import java.util.ArrayList;
import java.util.List;

public class Sala {
    private String nombreSala;
    private List<Asiento> tieneAsientos;

    public Sala() {
    }

    public Sala(String nombreSala) {
        this.nombreSala = nombreSala;
    }

    public String getNombreSala() {
        return nombreSala;
    }

    public void setNombreSala(String nombreSala) {
        this.nombreSala = nombreSala;
    }

    public List<Asiento> getTieneAsientos() {
        if (this.tieneAsientos == null) this.tieneAsientos = new ArrayList<>();
        return tieneAsientos;
    }

    public void setTieneAsientos(List<Asiento> tieneAsientos) {
        this.tieneAsientos = tieneAsientos;
    }

    @Override
    public String toString() {
        return "Sala{" +
                "nombreSala='" + nombreSala + '\'' +
                ", tieneAsientos=" + tieneAsientos.size() +
                '}';
    }
}
