package entidades;

import java.time.LocalDate;

public class Alquiler {
    private Pelicula peliculaAlquilada;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private double precio;

    public Alquiler() {
    }

    public Alquiler(Pelicula peliculaAlquilada, LocalDate fechaInicio, LocalDate fechaFin, double precio) {
        this.peliculaAlquilada = peliculaAlquilada;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.precio = precio;
    }

    public Pelicula getPeliculaAlquilada() {
        return peliculaAlquilada;
    }

    public void setPeliculaAlquilada(Pelicula peliculaAlquilada) {
        this.peliculaAlquilada = peliculaAlquilada;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Alquiler{" +
                "\n\tpeliculaAlquilada=" + peliculaAlquilada.getTitulo() +
                "\n\tfechaInicio=" + fechaInicio +
                "\n\tfechaFin=" + fechaFin +
                "\n\tprecio=" + precio +
                '}';
    }
}
