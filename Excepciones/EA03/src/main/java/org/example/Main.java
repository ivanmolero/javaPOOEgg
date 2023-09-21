package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DivisionNumero divisionNumero = new DivisionNumero();
        try {
            divisionNumero.division(Integer.parseInt(scan.nextLine()), scan.nextInt());
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println("no es posible la división entre cero");
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            System.out.println("no se puede convertir a numero");
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
            System.out.println("el valor ingresado no es un entero");
        }
    }
}