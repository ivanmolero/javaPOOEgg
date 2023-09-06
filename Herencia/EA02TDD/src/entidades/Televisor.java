package entidades;

import java.util.Scanner;

public class Televisor extends Electrodomestico{
    private Integer resolucion;
    private Boolean sintonizadorTDT;

    public Televisor() {
        super();
    }

    public Televisor(String color, Character consumoEnergetico, Integer peso, Integer resolucion, Boolean sintonizadorTDT) {
        super(color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }

    public Boolean getSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(Boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public void crearTelevisor() {
        Scanner scan = new Scanner(System.in);
        super.crearElectrodomestico();
        System.out.println("ingrese la resolución en pulgadas: ");
        this.resolucion = Integer.parseInt(scan.nextLine());
        System.out.println("ingrese si tiene sintonizador TDT: (S/N)");
        this.sintonizadorTDT = scan.nextLine().equalsIgnoreCase("s");
    }

    @Override
    public Integer precioFinal() {
        Integer incremento = 0;
        if (this.resolucion > 40) incremento += (int) (super.precioFinal() * 0.3);
        if (this.sintonizadorTDT) incremento += 500;
        return super.precioFinal() + incremento;
    }

    @Override
    public String toString() {
        return "Televisor{" +
                "resolucion=" + resolucion +
                ", sintonizadorTDT=" + sintonizadorTDT +
                ", precio=" + precio +
                ", color='" + color + '\'' +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso +
                '}';
    }
}
