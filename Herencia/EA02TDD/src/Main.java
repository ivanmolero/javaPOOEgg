import entidades.Electrodomestico;
import entidades.Lavadora;
import entidades.Televisor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Televisor televisor = new Televisor();
//        televisor.crearTelevisor();
//        System.out.println(televisor);
//        System.out.println(televisor.precioFinal());
//        Lavadora lavadora = new Lavadora();
//        lavadora.crearLavadora();
//        System.out.println(lavadora);
//        System.out.println(lavadora.precioFinal());

        // EJERCICIO 03
        List<Electrodomestico> electrodomesticos = new ArrayList<>();
        electrodomesticos.add(new Lavadora("verde", 'c', 50, 30));
        electrodomesticos.add(new Lavadora("azul", 'a', 50, 40));
        electrodomesticos.add(new Televisor("rojo", 'a', 30, 45, true));
        electrodomesticos.add(new Televisor("negro", 'a', 30, 45, false));

        Integer total = 0;
        for (Electrodomestico electrodomestico : electrodomesticos) {
            total += electrodomestico.precioFinal();
        }
        System.out.println("la suma de todos los precios es: " + total);
        total = 0;
        for (Electrodomestico electrodomestico : electrodomesticos) {
            if (electrodomestico instanceof Lavadora) total += electrodomestico.precioFinal();
        }
        System.out.println("la suma de todas las lavadoras es: " + total);
        total = 0;
        for (Electrodomestico electrodomestico : electrodomesticos) {
            if (electrodomestico instanceof Televisor) total += electrodomestico.precioFinal();
        }
        System.out.println("la suma de todas los televisores es: " + total);
    }
}