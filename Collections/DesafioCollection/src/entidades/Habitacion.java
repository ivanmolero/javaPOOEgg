package entidades;

public class Habitacion {
    private final Integer numero;
    private final Integer capacidad;

    public Habitacion(Integer numero, Integer capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
    }

    public Integer getNumero() {
        return numero;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    @Override
    public String toString() {
        return "Habitacion{" +
                "numero=" + numero +
                ", capacidad=" + capacidad +
                '}';
    }
}
