package org.example.entidades;

public class InformacionVivienda {
    private Integer dormitorios;
    private String tipoPared;
    private String tipoPiso;
    private Boolean iluminacion;

    public InformacionVivienda() {
    }

    public InformacionVivienda(Integer dormitorios, String tipoPared, String tipoPiso, Boolean iluminacion) {
        this.dormitorios = dormitorios;
        this.tipoPared = tipoPared;
        this.tipoPiso = tipoPiso;
        this.iluminacion = iluminacion;
    }

    public Integer getDormitorios() {
        return dormitorios;
    }

    public void setDormitorios(Integer dormitorios) {
        this.dormitorios = dormitorios;
    }

    public String getTipoPared() {
        return tipoPared;
    }

    public void setTipoPared(String tipoPared) {
        this.tipoPared = tipoPared;
    }

    public String getTipoPiso() {
        return tipoPiso;
    }

    public void setTipoPiso(String tipoPiso) {
        this.tipoPiso = tipoPiso;
    }

    public Boolean getIluminacion() {
        return iluminacion;
    }

    public void setIluminacion(Boolean iluminacion) {
        this.iluminacion = iluminacion;
    }
}
