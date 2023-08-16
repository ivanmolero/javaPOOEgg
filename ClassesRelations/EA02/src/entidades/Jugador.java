package entidades;

public class Jugador {
    private Integer numero;
    private String nombre;
    private Boolean mojado;

    public Jugador() {
        this.mojado = false;
    }

    public Jugador(Integer numero, String nombre) {
        this();
        this.numero = numero;
        this.nombre = nombre;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getMojado() {
        return mojado;
    }

    public void setMojado(Boolean mojado) {
        this.mojado = mojado;
    }

    public Boolean disparo(Revolver revolver) {
        this.setMojado(revolver.mojar());
        revolver.siguienteChorro();
        return this.mojado;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "numero=" + numero +
                ", nombre='" + nombre + '\'' +
                ", mojado=" + mojado +
                '}';
    }
}
