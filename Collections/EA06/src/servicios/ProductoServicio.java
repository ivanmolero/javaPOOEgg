package servicios;

import java.util.Map;
import java.util.Scanner;

public class ProductoServicio {
    private Scanner scan;

    public ProductoServicio() {
        this.scan = new Scanner(System.in);
    }

    public void fabricaProductos(Map<String, Double> productos) {
        do {
            crearProducto(productos);
            System.out.println("desea seguir ingresando productos? (S/N)");
        } while(scan.nextLine().equalsIgnoreCase("s"));
    }

    private void crearProducto(Map<String, Double> productos) {
        System.out.println("ingrese el nombre del producto: ");
        String nombre = scan.nextLine();
        System.out.println("ingrese el precio del producto: ");
        Double precio = Double.parseDouble(scan.nextLine());
        productos.put(nombre, precio);
    }

    public void listarProductos(Map<String, Double> productos) {
        productos.forEach((s, aDouble) -> System.out.println("Producto: " + s + " - precio: " + aDouble));
    }

    public void editarProducto(Map<String, Double> productos) {
        listarProductos(productos);
        System.out.println("ingrese el nombre del producto a editar");
        String nombre = scan.nextLine();
        if (productos.containsKey(nombre)) {
            Double precio = productos.get(nombre);
            System.out.println("producto " + nombre + " encontrado, precio: " + precio);
            System.out.println("ingrese el nuevo precio: ");
            Double precioNuevo = Double.parseDouble(scan.nextLine());
            if (!precio.equals(precioNuevo)) {
                productos.put(nombre, precioNuevo);
                System.out.println("producto actualizado con exito");
            } else {
                System.out.println("los precios son iguales, no se actualiza el producto");
            }
        } else {
            System.out.println("el producto no se encuentra en la lista");
        }
    }

    public void eliminarProducto(Map<String, Double> productos) {
        System.out.println("ingrese el nombre del producto a eliminar: ");
        String nombre = scan.nextLine();
        if (productos.containsKey(nombre)) {
            System.out.println("esta seguro de eliminar el producto? (S/N)");
            if (scan.nextLine().equalsIgnoreCase("s")) {
                productos.remove(nombre);
                System.out.println("producto eliminado con exito");
            }
        } else {
            System.out.println("no se encuentra el producto en la lista");
        }
    }
}
