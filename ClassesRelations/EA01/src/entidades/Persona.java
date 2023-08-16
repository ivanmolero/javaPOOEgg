package entidades;

import java.util.List;

public class Persona {
    private String nombre;
    private String apellido;
    private Integer edad;
    private String documento;
    private List<Perro> perros;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Integer edad, String documento, List<Perro> perros) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.perros = perros;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public List<Perro> getPerros() {
        return perros;
    }

    public void setPerros(List<Perro> perros) {
        this.perros = perros;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", documento='" + documento + '\'' +
                "}\n" + perros;
    }
}
