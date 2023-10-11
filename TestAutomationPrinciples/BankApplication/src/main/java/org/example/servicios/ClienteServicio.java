package org.example.servicios;

import org.example.entidades.Cliente;
import org.example.entidades.Cuenta;

import java.util.List;
import java.util.Scanner;

public class ClienteServicio {
    private Scanner scan;

    public ClienteServicio() {
        this.scan = new Scanner(System.in);
    }
    public Cliente crearCliente() {
        Cliente cliente = new Cliente();
        System.out.println("ingrese el nombre del usuario: ");
        cliente.setNombre(scan.nextLine());
        System.out.println("ingrese el dni del usuario: ");
        cliente.setDni(scan.nextLine());
        System.out.println("ingrese la contraseña: ");
        cliente.setPassword(scan.nextLine());
        return cliente;
    }

    public boolean crearCuentaCliente(Cliente cliente) {
        if (cliente.getCuenta() == null) {
            CuentaServicio cuentaServicio = new CuentaServicio();
            cliente.setCuenta(cuentaServicio.crearCuenta(cliente));
            return true;
        }
        return false;
    }

    public void agregarCliente(Cliente cliente, List<Cliente> clientes) {
        clientes.add(cliente);
    }
}
