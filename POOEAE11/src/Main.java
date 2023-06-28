import java.util.Date;
import java.util.Scanner;

public class Main {
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int dia = 0, mes = 0, anio = 0;
        System.out.println("ingrese el día para la nueva fecha: ");
        dia = Integer.parseInt(scan.nextLine());
        System.out.println("ingrese el mes para la nueva fecha: ");
        mes = Integer.parseInt(scan.nextLine());
        System.out.println("ingrese el año para la nueva fecha: ");
        anio = Integer.parseInt(scan.nextLine());
        Date fecha = new Date();
        fecha.setYear(anio - 1900);
        fecha.setMonth(mes - 1);
        fecha.setDate(dia);
        System.out.println(fecha);
        Date fechaActual = new Date();
        System.out.println(fechaActual);
        System.out.println("la diferencia de años es: " + (fechaActual.getYear() - fecha.getYear()));
    }
}