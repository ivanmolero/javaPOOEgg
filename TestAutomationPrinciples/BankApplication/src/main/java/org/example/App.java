package org.example;

import org.example.entidades.Cliente;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Cliente cliente = new Cliente();
        cliente.setNombre("Pablo");
        cliente.setDni("12345678");
        cliente.setDireccion("por ahi");
        System.out.println(cliente.toString());
    }
}
