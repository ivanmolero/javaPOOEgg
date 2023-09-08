package org.example.entidades;

public class Barco {
    protected String matricula;
    protected Integer eslora;
    protected Integer fabricacion;

    public Barco() {
    }

    public Barco(String matricula, Integer eslora, Integer fabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.fabricacion = fabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getEslora() {
        return eslora;
    }

    public void setEslora(Integer eslora) {
        this.eslora = eslora;
    }

    public Integer getFabricacion() {
        return fabricacion;
    }

    public void setFabricacion(Integer fabricacion) {
        this.fabricacion = fabricacion;
    }

    public Integer calculoModulo() {
        return this.eslora * 10;
    }

}
