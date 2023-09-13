package org.example.entidades;

public class Hotel extends Alojamiento{
    protected Integer cantidadHabitaciones;
    protected Integer numeroCamas;
    protected Integer pisos;
    protected Integer precioHabitacion;

    public Hotel() {
        this.cantidadHabitaciones = 0;
        this.numeroCamas = 0;
    }

    public Hotel(String nombre, String direccion, String localidad, String gerente, Integer cantidadHabitaciones, Integer numeroCamas, Integer pisos) {
        super(nombre, direccion, localidad, gerente);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.numeroCamas = numeroCamas;
        this.pisos = pisos;
    }

    public Integer getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(Integer cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.calcularPrecioHabitacion();
    }

    public Integer getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(Integer numeroCamas) {
        this.numeroCamas = numeroCamas;
        this.calcularPrecioHabitacion();
    }

    public Integer getPisos() {
        return pisos;
    }

    public void setPisos(Integer pisos) {
        this.pisos = pisos;
    }

    public Integer getPrecioHabitacion() {
        this.calcularPrecioHabitacion();
        return precioHabitacion;
    }

    public void setPrecioHabitacion(Integer precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }

    protected void calcularPrecioHabitacion() {
        this.precioHabitacion = 50 + this.cantidadHabitaciones * this.numeroCamas;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "precioHabitacion=" + precioHabitacion +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
