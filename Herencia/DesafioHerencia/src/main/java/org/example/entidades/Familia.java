package org.example.entidades;

import java.util.ArrayList;
import java.util.List;

public abstract class Familia {
    protected String direccion;
    protected String ide;
    protected String lote;
    protected String barrio;
    protected String localidad;
    protected List<Integrante> tieneIntegrantes;
    protected InformacionVivienda tieneVivienda;

    public Familia() {
        this.tieneIntegrantes = new ArrayList<>();
    }

    public Familia(String direccion, String ide, String lote, String barrio, String localidad) {
        this();
        this.direccion = direccion;
        this.ide = ide;
        this.lote = lote;
        this.barrio = barrio;
        this.localidad = localidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getIde() {
        return ide;
    }

    public void setIde(String ide) {
        this.ide = ide;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public List<Integrante> getTieneIntegrantes() {
        return tieneIntegrantes;
    }

    public void setTieneIntegrantes(List<Integrante> tieneIntegrantes) {
        this.tieneIntegrantes = tieneIntegrantes;
    }

    public InformacionVivienda getTieneVivienda() {
        return tieneVivienda;
    }

    public void setTieneVivienda(InformacionVivienda tieneVivienda) {
        this.tieneVivienda = tieneVivienda;
    }
}
