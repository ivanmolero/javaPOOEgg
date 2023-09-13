package org.example.entidades;

public class Hotel4E extends Hotel{
    protected Character gimnasio;
    protected String nombreRestaurante;
    protected Integer capacidadRestaurante;

    public Hotel4E() {
        super();
        this.capacidadRestaurante = 0;
        this.gimnasio = ' ';
    }

    public Hotel4E(String nombre, String direccion, String localidad, String gerente, Integer cantidadHabitaciones, Integer numeroCamas, Integer pisos, Character gimnasio, String nombreRestaurante, Integer capacidadRestaurante) {
        super(nombre, direccion, localidad, gerente, cantidadHabitaciones, numeroCamas, pisos);
        this.gimnasio = gimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public Character getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(Character gimnasio) {
        this.gimnasio = gimnasio;
        this.calcularPrecioHabitacion();
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public Integer getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public void setCapacidadRestaurante(Integer capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
        this.calcularPrecioHabitacion();
    }

    @Override
    protected void calcularPrecioHabitacion() {
        super.calcularPrecioHabitacion();
        if (this.capacidadRestaurante < 30) {
            this.precioHabitacion += 10;
        } else if (this.capacidadRestaurante <= 50) {
            this.precioHabitacion += 30;
        } else {
            this.precioHabitacion += 50;
        }
        if (this.gimnasio.equals('A')) this.precioHabitacion += 50;
        if (this.gimnasio.equals('B')) this.precioHabitacion += 30;
    }
}
