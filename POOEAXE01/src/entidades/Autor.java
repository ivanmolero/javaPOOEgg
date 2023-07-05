package entidades;

import java.util.ArrayList;
import java.util.List;

public class Autor {
    private String nombre;
    private List<Cancion> canciones;

    public Autor() {
    }

    public Autor(String nombre, List<Cancion> canciones) {
        this.nombre = nombre;
        this.canciones = canciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Cancion> getCanciones() {
        if (canciones == null) {
            canciones = new ArrayList<>();
        }
        return canciones;
    }

    public void setCanciones(List<Cancion> canciones) {
        this.canciones = canciones;
    }

    @Override
    public String toString() {
        return "Autor {" +
                "\n\tnombre = '" + nombre + '\'' +
                "\n\tcanciones = " + getCanciones().size() +
                "\n}";
    }
}
