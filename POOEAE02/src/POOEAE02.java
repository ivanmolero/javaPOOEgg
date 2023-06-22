import entidades.Circunferencia;

public class POOEAE02 {
    public static void main(String[] args) {
        Circunferencia cir = new Circunferencia();
        cir.crearCircunferencia();
        System.out.println("Area: " + cir.area());
        System.out.println("Perimetro: " + cir.perimetro());
    }
}
