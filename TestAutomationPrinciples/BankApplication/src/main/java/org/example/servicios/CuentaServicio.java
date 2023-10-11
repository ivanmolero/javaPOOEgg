package org.example.servicios;

import org.example.entidades.Cliente;
import org.example.entidades.Cuenta;

import java.util.Scanner;

public class CuentaServicio {
    private Scanner scan;

    public CuentaServicio() {
        this.scan = new Scanner(System.in);
    }

    public Cuenta crearCuenta(Cliente cliente) {
        Cuenta cuenta = new Cuenta();
        System.out.println("ingrese el saldo de apertura de la cuenta:");
        cuenta.setSaldo(Double.parseDouble(scan.nextLine()));
        cuenta.setPropietario(cliente);
        return cuenta;
    }
}
