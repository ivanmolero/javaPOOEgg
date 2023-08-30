package servicios;

import entidades.Producto;

import java.util.List;
import java.util.Scanner;

public class ProductoServicio {
    private Scanner scan;

    public ProductoServicio() {
        scan = new Scanner(System.in);
    }

    public Producto crearProducto() {
        Producto producto = new Producto();
        System.out.println("ingrese el nombre del producto:");
        producto.setNombre(scan.nextLine());
        System.out.println("ingrese el precio del producto:");
        producto.setPrecio(Double.parseDouble(scan.nextLine()));
        return producto;
    }

    public void mostrarProductos(List<Producto> productos) {
        productos.forEach(producto -> System.out.println(producto));
    }

    public void modificarProducto(List<Producto> productos) {
        Producto producto = seleccionarProducto(productos);
        Integer opcion = 0;
        do {
            System.out.println("1. Nombre\t" + producto.getNombre());
            System.out.println("2. Precio\t" + producto.getPrecio());
            System.out.println("3. Salir");
            System.out.println("seleccione el valor a cambiar");
            opcion = Integer.parseInt(scan.nextLine());
            switch (opcion) {
                case 1:
                    System.out.println("ingrese el nuevo nombre: ");
                    producto.setNombre(scan.nextLine());
                    break;
                case 2:
                    System.out.println("ingrese el nuevo precio: ");
                    producto.setPrecio(Double.parseDouble(scan.nextLine()));
                    break;
                case 3:
                    break;
                default:
                    System.out.println("ingrese una opción valida");
            }
        } while (opcion != 3);
    }

    public Producto seleccionarProducto(List<Producto> productos) {
        Producto buscar = null;
        do {
            mostrarProductos(productos);
            System.out.println("ingrese el nombre del producto a seleccionar: ");
            buscar = new Producto(scan.nextLine(), 0.0);
            if (productos.contains(buscar)) {
                return productos.get(productos.indexOf(buscar));
            } else {
                System.out.println("el producto no existe");
            }
        } while (true);
    }

    public void eliminarProducto(List<Producto> productos) {
        Producto producto = seleccionarProducto(productos);
        System.out.println("esta seguro de eliminar el producto? (S/N)");
        if (scan.nextLine().equalsIgnoreCase("S")) {
            productos.remove(producto);
            System.out.println("producto eliminado con exito");
        } else {
            System.out.println("el producto no se elimina");
        }
    }
}
