package entidades;

public class Cancion {
    private String titulo;
    private Autor autor;

    public Cancion() {
        titulo = "";
    }

    public Cancion(String titulo, Autor autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Cancion {" +
                "\n\ttitulo = '" + titulo + '\'' +
                "\n\tautor = " + autor.getNombre() +
                "\n}";
    }
}
