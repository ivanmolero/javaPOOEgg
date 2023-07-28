package servicios;

import entidades.Producto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tienda {
    private List<Producto> productos;
    private Scanner scan;

    public Tienda() {
        this.productos = new ArrayList<>();
        scan = new Scanner(System.in);
    }

    public void fabricaProductos(ProductoServicio ps) {
        do {
            Producto producto = ps.crearProducto();
            ps.agregarProducto(producto, this.productos);
            System.out.println("desea seguir ingresando productos? (S/N)");
        } while(scan.nextLine().equalsIgnoreCase("s"));
    }

    public void listarProductos(ProductoServicio ps) {
        ps.listarProductos(this.productos);
    }

    public void editarProducto(ProductoServicio ps) {
        Producto producto = seleccionaProducto();
        ps.editarProducto(producto);
    }

    public void eliminarProducto(ProductoServicio ps) {
        Producto producto = seleccionaProducto();
        ps.eliminarProducto(producto, this.productos);
    }

    private Producto seleccionaProducto() {
        int pos = 0;
        for (int i = 0; i < this.productos.size(); i++) {
            System.out.println(i + " - " + this.productos.get(i));
        }
        System.out.println("ingrese el indice del producto a seleccionar");
        pos = Integer.parseInt(scan.nextLine());
        return this.productos.get(pos);
    }

    private Producto seleccionaProducto(String nombre) {
        for (Producto producto : this.productos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                return producto;
            }
        }
        System.out.println("el producto " + nombre + " no se encuentra en la lista");
        return null;
    }

    public boolean venta() {
        System.out.println("ingrese el nombre del producto que desea comprar");
        String nombreProducto = scan.nextLine();
        Producto producto = this.seleccionaProducto(nombreProducto);
        if (producto != null) {
            if (producto.getCantidad() >= 1) {
                producto.setCantidad(producto.getCantidad() - 1);
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public void reposicion() {
        System.out.println("ingrese el nombre del producto que desea reponer");
        String nombreProducto = scan.nextLine();
        Producto producto = this.seleccionaProducto(nombreProducto);
        if (producto != null) {
            producto.setCantidad(producto.getCantidad() + 1);
            System.out.println("cantidad actual del producto " + producto.getNombre() + ": " + producto.getCantidad());
        }
    }
}
