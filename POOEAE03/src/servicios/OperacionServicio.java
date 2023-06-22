package servicios;

import entidades.Operacion;

import java.util.Scanner;

public class OperacionServicio {
    Scanner scan = new Scanner(System.in);

    public Operacion crearOperacion(){
        Operacion operacion = new Operacion();
        System.out.println("ingrese el primer número: ");
        operacion.setNumero1(scan.nextDouble());
        System.out.println("ingrese el segundo número: ");
        operacion.setNumero2(scan.nextDouble());
        return operacion;
    }

    public double sumar(Operacion operacion) {
        System.out.println("SUMAR");
        return operacion.getNumero1() + operacion.getNumero2();
    }

    public double restar(Operacion operacion) {
        System.out.println("RESTAR");
        return operacion.getNumero1() - operacion.getNumero2();
    }

    public double multiplicar(Operacion operacion) {
        System.out.println("MULTIPLICAR");
        if (operacion.getNumero1() == 0 || operacion.getNumero2() == 0) {
            System.out.println("error en la operación, multiplicación por cero.");
        }
        return operacion.getNumero1() * operacion.getNumero2();
    }

    public double dividir(Operacion operacion) {
        System.out.println("DIVIDIR");
        if (operacion.getNumero2() == 0) {
            System.out.println("error en la operación, división por cero.");
            return 0;
        }
        return operacion.getNumero1() / operacion.getNumero2();
    }
}
