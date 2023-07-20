package entidades;

public class DiscountCalculator {
    public double descuento(double tasa, double precio) {
        return precio * (1 - tasa / 100);
    }

    public double descuento10(double precio) {
        return precio * 0.9;
    }

    public double descuentoMaximo(double precio) {
        return precio * 0.75;
    }

    public double sinDescuento(double precio) {
        return precio;
    }
}
