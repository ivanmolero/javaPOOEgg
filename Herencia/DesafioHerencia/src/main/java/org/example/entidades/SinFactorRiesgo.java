package org.example.entidades;

public final class SinFactorRiesgo extends Familia{
    private Boolean mejora;

    public SinFactorRiesgo() {
        super();
    }

    public SinFactorRiesgo(String direccion, String ide, String lote, String barrio, String localidad, Boolean mejora) {
        super(direccion, ide, lote, barrio, localidad);
        this.mejora = mejora;
    }

    public Boolean getMejora() {
        return mejora;
    }

    public void setMejora(Boolean mejora) {
        this.mejora = mejora;
    }
}
