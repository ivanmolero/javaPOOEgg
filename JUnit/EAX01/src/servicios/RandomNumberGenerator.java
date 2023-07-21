package servicios;

public class RandomNumberGenerator {
    public int generar(int inferior, int superior) {
        return (int)(Math.random() * (superior - inferior)) + inferior;
    }
}
