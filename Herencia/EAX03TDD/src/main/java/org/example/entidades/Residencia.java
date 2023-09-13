package org.example.entidades;

public final class Residencia extends AlojamientoExtrahotelero{
    private Integer habitaciones;
    private Boolean descuentoGremio;
    private Boolean tieneCampoDeportivo;

    public Residencia() {
    }

    public Residencia(String nombre, String direccion, String localidad, String gerente, Boolean esPrivado, Integer areaAlojamiento, Integer habitaciones, Boolean descuentoGremio, Boolean tieneCampoDeportivo) {
        super(nombre, direccion, localidad, gerente, esPrivado, areaAlojamiento);
        this.habitaciones = habitaciones;
        this.descuentoGremio = descuentoGremio;
        this.tieneCampoDeportivo = tieneCampoDeportivo;
    }

    public Integer getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(Integer habitaciones) {
        this.habitaciones = habitaciones;
    }

    public Boolean getDescuentoGremio() {
        return descuentoGremio;
    }

    public void setDescuentoGremio(Boolean descuentoGremio) {
        this.descuentoGremio = descuentoGremio;
    }

    public Boolean getTieneCampoDeportivo() {
        return tieneCampoDeportivo;
    }

    public void setTieneCampoDeportivo(Boolean tieneCampoDeportivo) {
        this.tieneCampoDeportivo = tieneCampoDeportivo;
    }

    @Override
    public String toString() {
        return "Residencia{" +
                "descuentoGremio=" + descuentoGremio +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
