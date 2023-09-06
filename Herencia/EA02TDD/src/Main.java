import entidades.Lavadora;
import entidades.Televisor;

public class Main {
    public static void main(String[] args) {
        Televisor televisor = new Televisor();
        televisor.crearTelevisor();
        System.out.println(televisor);
        System.out.println(televisor.precioFinal());
        Lavadora lavadora = new Lavadora();
        lavadora.crearLavadora();
        System.out.println(lavadora);
        System.out.println(lavadora.precioFinal());
        
    }
}