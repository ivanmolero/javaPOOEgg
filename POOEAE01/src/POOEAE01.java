import entidades.Libro;
import servicios.LibroServicio;

public class POOEAE01 {
    public static void main(String[] args) {
        LibroServicio libroServicio = new LibroServicio();
        Libro lb = libroServicio.crearLibro();
        libroServicio.mostrarLibro(lb);
    }
}
