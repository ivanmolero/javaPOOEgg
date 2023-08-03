package entidades;

import java.util.Objects;

public class Libro {
    private String titulo;
    private String autor;
    private Integer ejemplares;
    private Integer ejemplaresPrestados;

    public Libro() {
        this.ejemplaresPrestados = 0;
    }

    public Libro(String titulo, String autor, Integer ejemplares) {
        this();
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(Integer ejemplares) {
        this.ejemplares = ejemplares;
    }

    public Integer getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }

    public void setEjemplaresPrestados(Integer ejemplaresPrestados) {
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return Objects.equals(getTitulo(), libro.getTitulo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitulo());
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", ejemplares=" + ejemplares +
                ", ejemplaresPrestados=" + ejemplaresPrestados +
                '}';
    }
}
