package entidades;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Electrodomestico {
    protected Integer precio;
    protected String color;
    protected Character consumoEnergetico;
    protected Integer peso;

    public Electrodomestico() {
        this.precio = 1000;
    }

    public Electrodomestico(String color, Character consumoEnergetico, Integer peso) {
        this();
        this.color = this.comprobarColor(color);
        this.consumoEnergetico = this.comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Character getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(Character consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    protected void crearElectrodomestico() {
        Scanner scan = new Scanner(System.in);
        System.out.println("ingrese el color: ");
        this.color = this.comprobarColor(scan.nextLine());
        System.out.println("ingrese el consumo energetico: ");
        this.consumoEnergetico = this.comprobarConsumoEnergetico(scan.nextLine().charAt(0));
        System.out.println("ingrese el peso: ");
        this.peso = Integer.parseInt(scan.nextLine());
    }

    private Character comprobarConsumoEnergetico(Character consumoEnergetico) {
        consumoEnergetico = consumoEnergetico.toString().trim().toUpperCase().charAt(0);
        if ("ABCDEF".contains(consumoEnergetico.toString())) {
            return consumoEnergetico;
        }
        return 'F';
    }

    private String comprobarColor(String color) {
        color = color.trim().toLowerCase();
        List<String> colores = Arrays.asList("blanco negro azul rojo gris".split(" "));
        if (colores.contains(color)) {
            return color;
        }
        return "blanco";
    }

    public Integer precioFinal() {
        Integer precioPeso = 0;
        if (this.peso >= 1 && this.peso <= 19) {
            precioPeso = 100;
        } else if (this.peso <= 49) {
            precioPeso = 500;
        } else if (this.peso <= 79) {
            precioPeso = 800;
        } else {
            precioPeso = 1000;
        }
        Map<Character, Integer> precioConsumo = Map.of('A', 1000, 'B', 800, 'C', 600,
                'D', 500, 'E', 300, 'F', 100);
        return this.precio + precioPeso + precioConsumo.get(this.consumoEnergetico);
    }
}
