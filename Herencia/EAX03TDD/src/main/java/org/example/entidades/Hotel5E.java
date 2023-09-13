package org.example.entidades;

public final class Hotel5E extends Hotel4E{
    private Integer salonesConferencia;
    private Integer suites;
    private Integer limosinas;

    public Hotel5E() {
        this.limosinas = 0;
    }

    public Hotel5E(String nombre, String direccion, String localidad, String gerente, Integer cantidadHabitaciones, Integer numeroCamas, Integer pisos, Character gimnasio, String nombreRestaurante, Integer capacidadRestaurante, Integer salonesConferencia, Integer suites, Integer limosinas) {
        super(nombre, direccion, localidad, gerente, cantidadHabitaciones, numeroCamas, pisos, gimnasio, nombreRestaurante, capacidadRestaurante);
        this.salonesConferencia = salonesConferencia;
        this.suites = suites;
        this.limosinas = limosinas;
    }

    public Integer getSalonesConferencia() {
        return salonesConferencia;
    }

    public void setSalonesConferencia(Integer salonesConferencia) {
        this.salonesConferencia = salonesConferencia;
    }

    public Integer getSuites() {
        return suites;
    }

    public void setSuites(Integer suites) {
        this.suites = suites;
    }

    public Integer getLimosinas() {
        return limosinas;
    }

    public void setLimosinas(Integer limosinas) {
        this.limosinas = limosinas;
        this.calcularPrecioHabitacion();
    }

    @Override
    protected void calcularPrecioHabitacion() {
        super.calcularPrecioHabitacion();
        this.precioHabitacion += this.limosinas * 15;
    }
}
