package entidades;

import java.time.LocalDate;

public class Reserva {
    private Integer id;
    private Integer numeroHabitacion;
    private Integer cantidadPersonas;
    private Persona responsable;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Boolean esAlojamiento;
    private static Integer generaId = 0;

    public Reserva() {
        generaId++;
        this.id = generaId;
        this.esAlojamiento = false;
    }

    public Reserva(Integer numeroHabitacion, Integer cantidadPersonas, Persona responsable, LocalDate fechaInicio, LocalDate fechaFin) {
        this();
        this.numeroHabitacion = numeroHabitacion;
        this.cantidadPersonas = cantidadPersonas;
        this.responsable = responsable;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public Integer getId() {
        return id;
    }

    public Integer getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(Integer numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public Integer getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(Integer cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public Persona getResponsable() {
        return responsable;
    }

    public void setResponsable(Persona responsable) {
        this.responsable = responsable;
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

    public Boolean getEsAlojamiento() {
        return esAlojamiento;
    }

    public void setEsAlojamiento(Boolean esAlojamiento) {
        this.esAlojamiento = esAlojamiento;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "id=" + id +
                ", numeroHabitacion=" + numeroHabitacion +
                ", cantidadPersonas=" + cantidadPersonas +
                ", responsable=" + responsable +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                ", esAlojamiento=" + esAlojamiento +
                '}';
    }
}
