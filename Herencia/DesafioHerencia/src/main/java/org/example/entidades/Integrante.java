package org.example.entidades;

import java.time.LocalDate;

public abstract class Integrante {
    protected Integer orden;
    protected String apellido;
    protected String nombre;
    protected LocalDate nacimiento;
    protected String dni;
    protected String sexo;
    protected String vinculo;
    protected Familia perteneceFamilia;
    protected ProblemaSalud tieneProblemaSalud;
    protected AbordajeNutricional tieneAbordajeNutricional;

    public Integrante() {
    }

    public Integrante(Integer orden, String apellido, String nombre, LocalDate nacimiento, String dni, String sexo, String vinculo, Familia perteneceFamilia) {
        this.orden = orden;
        this.apellido = apellido;
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        this.dni = dni;
        this.sexo = sexo;
        this.vinculo = vinculo;
        this.perteneceFamilia = perteneceFamilia;
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getVinculo() {
        return vinculo;
    }

    public void setVinculo(String vinculo) {
        this.vinculo = vinculo;
    }

    public Familia getPerteneceFamilia() {
        return perteneceFamilia;
    }

    public void setPerteneceFamilia(Familia perteneceFamilia) {
        this.perteneceFamilia = perteneceFamilia;
    }

    public ProblemaSalud getTieneProblemaSalud() {
        return tieneProblemaSalud;
    }

    public void setTieneProblemaSalud(ProblemaSalud tieneProblemaSalud) {
        this.tieneProblemaSalud = tieneProblemaSalud;
    }

    public AbordajeNutricional getTieneAbordajeNutricional() {
        return tieneAbordajeNutricional;
    }

    public void setTieneAbordajeNutricional(AbordajeNutricional tieneAbordajeNutricional) {
        this.tieneAbordajeNutricional = tieneAbordajeNutricional;
    }
}
