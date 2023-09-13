package org.example.entidades;

public class Polideportivo extends Edificio {

    private String nombre;

    private TipoInstalacion tipoInstalacion;

    public Polideportivo() {
    }

    public Polideportivo(Integer ancho, Integer alto, Integer largo, String nombre, TipoInstalacion tipoInstalacion) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipoInstalacion = tipoInstalacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoInstalacion getTipoInstalacion() {
        return tipoInstalacion;
    }

    public void setTipoInstalacion(TipoInstalacion tipoInstalacion) {
        this.tipoInstalacion = tipoInstalacion;
    }

    @Override
    public Integer calcularSuperficie() {
        Integer superficie = this.alto * this.ancho * 2 + this.alto * this.largo * 2;
        if (this.tipoInstalacion.equals(TipoInstalacion.TECHADO)) superficie += this.ancho * this.largo;
        return superficie;
    }

    @Override
    public Integer calcularVolumen() {
        return this.alto * this.largo * this.ancho;
    }
}
