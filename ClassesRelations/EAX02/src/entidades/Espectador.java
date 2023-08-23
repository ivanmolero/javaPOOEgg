package entidades;

import java.text.DecimalFormat;

public class Espectador {
    private String nombre;
    private Integer edad;
    private Double dineroDisponible;
    private DecimalFormat df;

    public Espectador() {
        this.df = new DecimalFormat("#.00");
    }

    public Espectador(String nombre, Integer edad, Double dineroDisponible) {
        this();
        this.nombre = nombre;
        this.edad = edad;
        this.dineroDisponible = dineroDisponible;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Double getDineroDisponible() {
        return dineroDisponible;
    }

    public void setDineroDisponible(Double dineroDisponible) {
        this.dineroDisponible = dineroDisponible;
    }

    @Override
    public String toString() {
        return "Espectador{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dineroDisponible=" + df.format(dineroDisponible) +
                '}';
    }
}
