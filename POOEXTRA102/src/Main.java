import entidades.FiguraGeometrica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion = 0;
        String tipo = "";
        do {
            opcion = seleccionaOpcion();
            switch (opcion){
                case 1:
                    tipo = "cuadrado";
                    break;
                case 2:
                    tipo = "rectangulo";
                    break;
                case 3:
                    tipo = "triangulo";
                    break;
                case 4:
                    tipo = "circulo";
                    break;
                case 5:
                    tipo = "hexagono";
                    break;
                case 6:
                    tipo = "pentagono";
                    break;
                case 7:
                    tipo = "rombo";
                    break;
                case 8:
                    System.out.println("nos vemos");
                    break;
                default:
                    System.out.println("ingrese un valor válido");
            }
            if (opcion < 8) {
                FiguraGeometrica figura = new FiguraGeometrica(tipo);
                figura.ingresarDatos();
                System.out.println("el área de la figura es: " + figura.getArea());
                System.out.println("el perimetro de la figura es: " + figura.getPerimetro());
            }
        } while (opcion != 8);
    }

    private static int seleccionaOpcion() {
        Scanner scan = new Scanner(System.in);
        int opcion = 0;
        System.out.println("MENU");
        System.out.println("1. CUADRADO");
        System.out.println("2. RECTANGULO");
        System.out.println("3. TRIANGULO");
        System.out.println("4. CIRCULO");
        System.out.println("5. HEXAGONO");
        System.out.println("6. PENTAGONO");
        System.out.println("7. ROMBO");
        System.out.println("8. SALIR");
        System.out.println("seleccione una opción: ");
        opcion = Integer.parseInt(scan.nextLine());
        return opcion;
    }
}