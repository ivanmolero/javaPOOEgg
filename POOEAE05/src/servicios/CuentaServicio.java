package servicios;

import entidades.Cuenta;

import java.util.Scanner;

public class CuentaServicio {
    private Scanner scan = new Scanner(System.in);
    public Cuenta crearCuenta() {
        Cuenta cuenta = new Cuenta();
        System.out.println("ingrese el dni del usuario: ");
        cuenta.setDni(Long.parseLong(scan.nextLine()));
        System.out.println("ingrese el saldo de la cuenta: ");
        cuenta.setSaldo(Integer.parseInt(scan.nextLine()));
        return cuenta;
    }
    public void ingresar(Cuenta cuenta, int ingreso) {
        System.out.println("se ingresa " + ingreso);
        cuenta.setSaldo(cuenta.getSaldo() + ingreso);
    }
    public void retirar(Cuenta cuenta, int retiro) {
        if (cuenta.getSaldo() >= retiro) {
            System.out.println("se retira: " + retiro);
            cuenta.setSaldo(cuenta.getSaldo() - retiro);
        } else {
            System.out.println("se retira: " + cuenta.getSaldo());
            cuenta.setSaldo(0);
        }
    }
    public void extraccionRapida(Cuenta cuenta, int retiro) {
        if (cuenta.getSaldo() * 0.2 >= retiro) {
            retirar(cuenta, retiro);
        } else {
            System.out.println("no es posible retirar " + retiro + " por extracción rápida");
        }
    }
    public void consultarSaldo(Cuenta cuenta) {
        System.out.println("el saldo de la cuenta " + cuenta.getNumeroCuenta() + " es: " + cuenta.getSaldo());
    }
    public void consultarDatos(Cuenta cuenta) {
        System.out.println(cuenta);
    }
}
