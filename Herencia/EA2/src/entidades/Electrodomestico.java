package entidades;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Electrodomestico {
    protected Double precio;
    protected String color;
    protected Character consumo;
    protected Integer peso;


    public Electrodomestico() {
    }

    public Electrodomestico(Double precio, String color, Character consumo, Integer peso) {
        this.precio = precio;
        this.color = this.comprobarColor(color);
        this.consumo = this.comprobarConsumoElectrico(consumo);
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = this.comprobarColor(color);
    }

    public Character getConsumo() {
        return consumo;
    }

    public void setConsumo(Character consumo) {
        this.consumo = this.comprobarConsumoElectrico(consumo);
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    private Character comprobarConsumoElectrico(Character consumo) {
        if ("ABCDEF".contains(consumo.toString().toUpperCase())) {
            return consumo.toString().toUpperCase().charAt(0);
        }
        return 'F';
    }

    private String comprobarColor(String color) {
        List<String> colores = Arrays.asList("blanco negro rojo azul gris".split(" "));
        if (colores.contains(color.toLowerCase())) {
            return color.toLowerCase();
        }
        return "blanco";
    }

    public void crearElectrodomestico() {
        Scanner scan = new Scanner(System.in);
        System.out.println("ingrese el color del electrodomestico: ");
        this.color = this.comprobarColor(scan.nextLine());
        System.out.println("ingrese el consumo del electrodomestico: ");
        this.consumo = this.comprobarConsumoElectrico(scan.nextLine().charAt(0));
        System.out.println("ingrese el peso del electrodomestico: ");
        this.peso = Integer.parseInt(scan.nextLine());
    }

    public Integer precioFinal() {
        return 0;
    }
}
