package entidades;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class FiguraGeometrica {
    private Double perimetro;
    private Double area;
    private String tipo;
    private DecimalFormat df;


    public FiguraGeometrica() {
    }

    public FiguraGeometrica(String tipo) {
        this.tipo = tipo;
        df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.HALF_UP);
    }

    public double getPerimetro() {
        return Double.parseDouble(df.format(perimetro));
    }

    public double getArea() {
        return Double.parseDouble(df.format(area));
    }

    public String getTipo() {
        return tipo;
    }

    public void ingresarDatos(){
        Scanner scan = new Scanner(System.in);
        switch (this.tipo){
            case "cuadrado":
                System.out.println("ingrese el lado: ");
                double lado = Double.parseDouble(scan.nextLine());
                perimetro = 4 * lado;
                area = lado * lado;
                break;
            case "rectangulo":
                System.out.println("ingrese la base: ");
                double base = Double.parseDouble(scan.nextLine());
                System.out.println("ingrese la altura: ");
                double altura = Double.parseDouble(scan.nextLine());
                perimetro = (base + altura) * 2;
                area = base * altura;
                break;
            case "triangulo":
                System.out.println("ingrese la base: ");
                double base1 = Double.parseDouble(scan.nextLine());
                System.out.println("ingrese la altura: ");
                double altura1 = Double.parseDouble(scan.nextLine());
                area = (base1 * altura1) / 2;
                double hipo = Math.pow(Math.pow(base1 / 2, 2) + Math.pow(altura1, 2), 0.5);
                perimetro = hipo * 2 + base1;
                break;
            case "circulo":
                System.out.println("ingrese el radio: ");
                double radio = Double.parseDouble(scan.nextLine());
                perimetro = 2 * Math.PI * radio;
                area = Math.PI * radio * radio;
                break;
            case "hexagono":
                System.out.println("ingrese el lado: ");
                double lado1 = Double.parseDouble(scan.nextLine());
                System.out.println("ingrese el apotema: ");
                double apotema = Double.parseDouble(scan.nextLine());
                perimetro = 6 * lado1;
                area = (perimetro * apotema) / 2;
                break;
            case "pentagono":
                System.out.println("ingrese el lado: ");
                double lado2 = Double.parseDouble(scan.nextLine());
                System.out.println("ingrese el apotema: ");
                double apotema1 = Double.parseDouble(scan.nextLine());
                perimetro = 5 * lado2;
                area = (perimetro * apotema1) / 2;
                break;
            case "rombo":
                System.out.println("ingrese la diagonal mayor: ");
                double dMayor = Double.parseDouble(scan.nextLine());
                System.out.println("ingrese la diagonal menor: ");
                double dMenor = Double.parseDouble(scan.nextLine());
                double lado3 = Math.pow(Math.pow(dMayor / 2, 2) + Math.pow(dMenor / 2, 2), 0.5);
                perimetro = 4 * lado3;
                area = (dMayor * dMenor) / 2;
                break;
        }
    }
}
