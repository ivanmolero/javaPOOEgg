package org.example.entidades;

public class EdificioDeOficinas extends Edificio{

    private Integer numeroOficinas;
    private Integer personasOficina;
    private Integer pisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(Integer ancho, Integer alto, Integer largo, Integer numeroOficinas, Integer personasOficina, Integer pisos) {
        super(ancho, alto, largo);
        this.numeroOficinas = numeroOficinas;
        this.personasOficina = personasOficina;
        this.pisos = pisos;
    }

    public Integer getNumeroOficinas() {
        return numeroOficinas;
    }

    public void setNumeroOficinas(Integer numeroOficinas) {
        this.numeroOficinas = numeroOficinas;
    }

    public Integer getPersonasOficina() {
        return personasOficina;
    }

    public void setPersonasOficina(Integer personasOficina) {
        this.personasOficina = personasOficina;
    }

    public Integer getPisos() {
        return pisos;
    }

    public void setPisos(Integer pisos) {
        this.pisos = pisos;
    }

    public void cantPersonas() {
        System.out.println("la cantidad de personas por piso es de " + this.personasOficina + " personas.");
        System.out.println("la cantidad de personas en el edificio es de " + (this.personasOficina * this.numeroOficinas) + " personas.");
    }

    @Override
    public Integer calcularSuperficie() {
        return this.alto * this.ancho * 2 + this.alto * this.largo * 2 + this.ancho * this.largo;
    }

    @Override
    public Integer calcularVolumen() {
        return this.alto * this.largo * this.ancho;
    }
}
