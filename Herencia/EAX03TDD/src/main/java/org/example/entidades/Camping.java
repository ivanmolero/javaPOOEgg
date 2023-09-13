package org.example.entidades;

public final class Camping extends AlojamientoExtrahotelero{
    private Integer carpas;
    private Integer banios;
    private Boolean tieneRestaurante;

    public Camping() {
    }

    public Camping(String nombre, String direccion, String localidad, String gerente, Boolean esPrivado, Integer areaAlojamiento, Integer carpas, Integer banios, Boolean tieneRestaurante) {
        super(nombre, direccion, localidad, gerente, esPrivado, areaAlojamiento);
        this.carpas = carpas;
        this.banios = banios;
        this.tieneRestaurante = tieneRestaurante;
    }

    public Integer getCarpas() {
        return carpas;
    }

    public void setCarpas(Integer carpas) {
        this.carpas = carpas;
    }

    public Integer getBanios() {
        return banios;
    }

    public void setBanios(Integer banios) {
        this.banios = banios;
    }

    public Boolean getTieneRestaurante() {
        return tieneRestaurante;
    }

    public void setTieneRestaurante(Boolean tieneRestaurante) {
        this.tieneRestaurante = tieneRestaurante;
    }

    @Override
    public String toString() {
        return "Camping{" +
                "tieneRestaurante=" + tieneRestaurante +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
