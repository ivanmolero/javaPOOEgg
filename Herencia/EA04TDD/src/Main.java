import entidades.Circulo;
import entidades.Rectangulo;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5.0);
        Rectangulo rectangulo = new Rectangulo(5.0, 10.0);

        System.out.println("areas:");
        System.out.println("circulo: " + circulo.calcularArea());
        System.out.println("rectangulo: " + rectangulo.calcularArea());
        System.out.println("perimetros:");
        System.out.println("circulo: " + circulo.calcularPerimetro());
        System.out.println("rectangulo: " + rectangulo.calcularPerimetro());
    }
}