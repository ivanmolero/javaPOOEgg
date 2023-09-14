package org.example.entidades;

public class AbordajeNutricional {
    private Integer ordenIntegrante;
    private Integer edad;
    private Double peso;
    private Boolean eutrofico;
    private Boolean bajoPeso;
    private Boolean sobrePeso;

    public AbordajeNutricional() {
    }

    public AbordajeNutricional(Integer ordenIntegrante, Double peso, Boolean eutrofico, Boolean bajoPeso, Boolean sobrePeso) {
        this.ordenIntegrante = ordenIntegrante;
        this.peso = peso;
        this.eutrofico = eutrofico;
        this.bajoPeso = bajoPeso;
        this.sobrePeso = sobrePeso;
    }

    public Integer getOrdenIntegrante() {
        return ordenIntegrante;
    }

    public void setOrdenIntegrante(Integer ordenIntegrante) {
        this.ordenIntegrante = ordenIntegrante;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) { // recibir un localdate y hacer el calculo
        this.edad = edad;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Boolean getEutrofico() {
        return eutrofico;
    }

    public void setEutrofico(Boolean eutrofico) {
        this.eutrofico = eutrofico;
    }

    public Boolean getBajoPeso() {
        return bajoPeso;
    }

    public void setBajoPeso(Boolean bajoPeso) {
        this.bajoPeso = bajoPeso;
    }

    public Boolean getSobrePeso() {
        return sobrePeso;
    }

    public void setSobrePeso(Boolean sobrePeso) {
        this.sobrePeso = sobrePeso;
    }
}
