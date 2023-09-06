package entidades;

import java.util.Scanner;

public class Lavadora extends Electrodomestico{
    private Integer carga;

    public Lavadora() {
        super();
    }

    public Lavadora(String color, Character consumoEnergetico, Integer peso, Integer carga) {
        super(color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    public void crearLavadora() {
        Scanner scan = new Scanner(System.in);
        super.crearElectrodomestico();
        System.out.println("ingrese la carga: ");
        this.carga = Integer.parseInt(scan.nextLine());
    }

    @Override
    public Integer precioFinal() {
        Integer incremento = 0;
        if (this.carga > 30) incremento = 500;
        return super.precioFinal() + incremento;
    }

    @Override
    public String toString() {
        return "Lavadora{" +
                "carga=" + carga +
                ", precio=" + precio +
                ", color='" + color + '\'' +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso +
                '}';
    }
}
