package servicios;

import entidades.Cliente;

import java.util.List;
import java.util.Scanner;

public class ClienteServicio {
    Scanner scan = AppServicio.scan;
    public void crearCliente(List<Cliente> lista) {
        System.out.println("CREAR CLIENTE");
        Cliente cliente = new Cliente();
        System.out.println("ingrese el nombre: ");
        cliente.setNombre(scan.nextLine());
        System.out.println("ingrese la edad: ");
        cliente.setEdad(Integer.parseInt(scan.nextLine()));
        System.out.println("ingrese la altura: ");
        cliente.setAltura(Double.parseDouble(scan.nextLine()));
        System.out.println("ingrese el peso: ");
        cliente.setPeso(Double.parseDouble(scan.nextLine()));
        System.out.println("ingrese el objetivo");
        cliente.setObjetivo(scan.nextLine());
        lista.add(cliente);
    }

    public void listarClientes(List<Cliente> clientes) {
        int i = 0;
        for (Cliente cliente : clientes) {
            System.out.println(i + " - " + cliente.toString());
            i++;
        }
    }

    public void editarCliente(List<Cliente> clientes) {
        Cliente cliente = seleccionaCliente(clientes);
        int op = 0;
        do {
            do {
                System.out.println("Modificando datos");
                System.out.println("1. Nombre   <"  + cliente.getNombre() + ">");
                System.out.println("2. Edad     <"  + cliente.getEdad() + ">");
                System.out.println("3. Altura   <"  + cliente.getAltura() + ">");
                System.out.println("4. Peso     <"  + cliente.getPeso() + ">");
                System.out.println("5. Objetivo <"  + cliente.getObjetivo() + ">");
                System.out.println("6. Salir");
                System.out.println("seleccione una opción");
                op = Integer.parseInt(scan.nextLine());
                if (op < 1 || op > 6) {
                    System.out.println("seleccione una opción válida");
                }
            } while(op < 1 || op > 6);
            switch (op) {
                case 1:
                    System.out.println("ingrese el nuevo valor de nombre");
                    cliente.setNombre(scan.nextLine());
                    break;
                case 2:
                    System.out.println("ingrese el nuevo valor de edad");
                    cliente.setEdad(Integer.parseInt(scan.nextLine()));
                    break;
                case 3:
                    System.out.println("ingrese el nuevo valor de altura");
                    cliente.setAltura(Double.parseDouble(scan.nextLine()));
                    break;
                case 4:
                    System.out.println("ingrese el nuevo valor de peso");
                    cliente.setPeso(Double.parseDouble(scan.nextLine()));
                    break;
                case 5:
                    System.out.println("ingrese el nuevo valor de objetivo");
                    cliente.setObjetivo(scan.nextLine());
                    break;
            }
        } while(op != 6);
    }

    private Cliente seleccionaCliente(List<Cliente> clientes) {
        int posicion = -1;
        System.out.println("seleccionar cliente");
        listarClientes(clientes);
        System.out.println("ingrese la posición del cliente a seleccionar");
        posicion = Integer.parseInt(scan.nextLine());
        return clientes.get(posicion);
    }

    public void eliminaCliente(List<Cliente> clientes) {
        Cliente cliente = seleccionaCliente(clientes);
        System.out.println("está seguro de eliminar el cliente (S/N)?");
        if (scan.nextLine().equalsIgnoreCase("s")) {
            clientes.remove(cliente);
            System.out.println("cliente eliminado con éxito");
        }
    }
}
