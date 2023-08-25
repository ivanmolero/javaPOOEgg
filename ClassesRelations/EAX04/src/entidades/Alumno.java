package entidades;

import java.util.Objects;

public class Alumno {
    private String nombreCompleto;
    private String dni;
    private Integer cantidadVotos;

    public Alumno() {
        this.cantidadVotos = 0;
    }

    public Alumno(String nombreCompleto, String dni) {
        this();
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Integer getCantidadVotos() {
//        return this.dni.length();
        return cantidadVotos;
    }

    public void setCantidadVotos(Integer cantidadVotos) {
        this.cantidadVotos = cantidadVotos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return Objects.equals(getDni(), alumno.getDni());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDni());
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombreCompleto='" + getNombreCompleto() + '\'' +
                ", dni='" + getDni() + '\'' +
                ", cantidadVotos=" + getCantidadVotos() +
                '}';
    }
}
