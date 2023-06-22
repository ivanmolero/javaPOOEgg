import entidades.Rectangulo;
import servicios.RectanguloServicio;

public class POOEAE04 {
    public static void main(String[] args) {
        RectanguloServicio rs = new RectanguloServicio();
        Rectangulo r01 = rs.crearRectangulo();
        rs.area(r01);
        rs.perimetro(r01);
        rs.dibujar(r01);
    }
}
