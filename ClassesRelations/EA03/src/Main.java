import entidades.Baraja;

public class Main {
    public static void main(String[] args) {
        Baraja baraja = new Baraja();
//        baraja.mostrarBaraja();
        baraja.barajar();
        baraja.mostrarBaraja();
        System.out.println("cantidad cartas: " + baraja.cartaDisponible());
        System.out.println(baraja.siguienteCarta());
        System.out.println("cantidad cartas: " + baraja.cartaDisponible());
        System.out.println(baraja.darCartas(10));
        System.out.println("cantidad cartas: " + baraja.cartaDisponible());
        System.out.println("CARTAS MONTON\n");
        baraja.cartasMonton();
        System.out.println("CARTAS BARAJA\n");
        baraja.mostrarBaraja();

    }
}