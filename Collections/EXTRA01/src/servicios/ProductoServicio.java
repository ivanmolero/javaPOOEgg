package servicios;

import entidades.Producto;

import java.util.List;
import java.util.Scanner;

public class ProductoServicio {
    private Scanner scan;

    public ProductoServicio() {
        this.scan = new Scanner(System.in);
    }

    public Producto crearProducto() {
        Producto producto = new Producto();
        System.out.println("ingrese el nombre del producto");
        producto.setNombre(scan.nextLine());
        System.out.println("ingrese la categoria del producto");
        producto.setCategoria(scan.nextLine());
        System.out.println("ingrese el precio del producto");
        producto.setPrecio(Double.parseDouble(scan.nextLine()));
        System.out.println("ingrese la cantidad del producto");
        producto.setCantidad(Integer.parseInt(scan.nextLine()));
        System.out.println(producto);
        return producto;
    }

    public void agregarProducto(Producto producto, List<Producto> productos) {
        if (producto.getNombre().trim().isEmpty()) {
            System.out.println("no se puede ingresar un producto sin nombre");
            return;
        }
        productos.add(producto);
    }

    public void listarProductos(List<Producto> productos) {
        productos.forEach(producto -> System.out.println(producto));
    }

    public void editarProducto(Producto producto) {
        int op = 0;
        do {
            System.out.println("1 - Nombre: " + producto.getNombre());
            System.out.println("2 - Categoria: " + producto.getCategoria());
            System.out.println("3 - Precio: " + producto.getPrecio());
            System.out.println("4 - Salir");
            System.out.println("ingrese la opción");
            op = Integer.parseInt(scan.nextLine());
            switch (op) {
                case 1:
                    System.out.println("ingrese el nuevo nombre");
                    producto.setNombre(scan.nextLine());
                    break;
                case 2:
                    System.out.println("ingrese la nueva categoria");
                    producto.setCategoria(scan.nextLine());
                    break;
                case 3:
                    System.out.println("ingrese el nuevo precio");
                    producto.setPrecio(Double.parseDouble(scan.nextLine()));
                    break;
                case 4:
                    break;
                default:
                    System.out.println("ingrese una opcion valida");
            }
        } while(op != 4);
    }

    public void eliminarProducto(Producto producto, List<Producto> productos) {
        System.out.println("esta seguro de eliminar " + producto.getNombre() + "? (S/N)");
        if (scan.nextLine().equalsIgnoreCase("s")) {
            productos.remove(producto);
        }
    }
}
