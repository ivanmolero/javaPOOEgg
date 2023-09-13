package org.example.entidades;

public class AlojamientoExtrahotelero extends Alojamiento{
    protected Boolean esPrivado;
    protected Integer areaAlojamiento;

    public AlojamientoExtrahotelero() {
    }

    public AlojamientoExtrahotelero(String nombre, String direccion, String localidad, String gerente, Boolean esPrivado, Integer areaAlojamiento) {
        super(nombre, direccion, localidad, gerente);
        this.esPrivado = esPrivado;
        this.areaAlojamiento = areaAlojamiento;
    }

    public Boolean getEsPrivado() {
        return esPrivado;
    }

    public void setEsPrivado(Boolean esPrivado) {
        this.esPrivado = esPrivado;
    }

    public Integer getAreaAlojamiento() {
        return areaAlojamiento;
    }

    public void setAreaAlojamiento(Integer areaAlojamiento) {
        this.areaAlojamiento = areaAlojamiento;
    }
}
