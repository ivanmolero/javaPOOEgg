package entidades;

public class Rutina {
    private int id;
    private String nombre;
    private int duracion;
    private int nivelDificultad;
    private String descripcion;
    private static int generador = 0;
    public Rutina() {
        generador++;
        id = generador;
    }

    public Rutina(String nombre, int duracion, int nivelDificultad, String descripcion) {
        this();
        this.nombre = nombre;
        this.duracion = duracion;
        this.nivelDificultad = nivelDificultad;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getNivelDificultad() {
        return nivelDificultad;
    }

    public void setNivelDificultad(int nivelDificultad) {
        this.nivelDificultad = nivelDificultad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Rutina {" +
                "\n\tid = " + id +
                "\n\tnombre = '" + nombre + '\'' +
                "\n\tduracion = " + duracion +
                "\n\tnivelDificultad = " + nivelDificultad +
                "\n\tdescripcion = '" + descripcion + '\'' +
                '}';
    }
}
