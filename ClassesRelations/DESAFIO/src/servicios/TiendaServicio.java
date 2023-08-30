package servicios;

import entidades.Producto;
import entidades.Tienda;

import java.util.List;
import java.util.Scanner;

public class TiendaServicio {
    private Scanner scan;

    public TiendaServicio() {
        this.scan = new Scanner(System.in);
    }

    public Tienda crearTienda() {
        Tienda tienda = new Tienda();
        System.out.println("ingrese la dirección de la tienda: ");
        tienda.setDireccion(scan.nextLine());
        System.out.println("ingrese el nombre del representante de la tienda: ");
        tienda.setRepresentante(scan.nextLine());
        return tienda;
    }

    public void mostrarTiendas(List<Tienda> tiendas) {
        tiendas.forEach(tienda -> System.out.println(tienda));
    }

    public void modificarTienda(List<Tienda> tiendas) {
        Tienda tienda = seleccionarTienda(tiendas);
        Integer opcion = 0;
        do {
            System.out.println("1. Dirección\t" + tienda.getDireccion());
            System.out.println("2. Representante\t" + tienda.getRepresentante());
            System.out.println("3. Salir");
            System.out.println("seleccione el valor a cambiar");
            opcion = Integer.parseInt(scan.nextLine());
            switch (opcion) {
                case 1:
                    System.out.println("ingrese la nueva dirección: ");
                    tienda.setDireccion(scan.nextLine());
                    break;
                case 2:
                    System.out.println("ingrese el nuevo representante: ");
                    tienda.setRepresentante(scan.nextLine());
                    break;
                case 3:
                    break;
                default:
                    System.out.println("ingrese una opción valida");
            }
        } while (opcion != 3);
    }

    private Tienda seleccionarTienda(List<Tienda> tiendas) {
        Tienda buscar = null;
        do {
            mostrarTiendas(tiendas);
            System.out.println("ingrese el id de la tienda a seleccionar: ");
            Integer id = Integer.parseInt(scan.nextLine());
            for (Tienda tienda : tiendas) {
                if (tienda.getId().equals(id)) {
                    return tienda;
                }
            }
            System.out.println("el id de la tienda no existe");
        } while (true);
    }

    public void eliminarTienda(List<Tienda> tiendas) {
        Tienda tienda = seleccionarTienda(tiendas);
        System.out.println("esta seguro de eliminar la tienda? (S/N)");
        if (scan.nextLine().equalsIgnoreCase("S")) {
            tiendas.remove(tienda);
            System.out.println("tienda eliminada con exito");
        } else {
            System.out.println("la tienda no se elimina");
        }
    }

    public void agregarProductos(List<Tienda> tiendas, List<Producto> productos) {
        Tienda tienda = seleccionarTienda(tiendas);
        ProductoServicio productoServicio = new ProductoServicio();
        Producto producto = productoServicio.seleccionarProducto(productos);
        System.out.println("ingrese la cantidad a agregar");
        Integer cantidad = Integer.parseInt(scan.nextLine());
        if (tienda.getProductosStock().containsKey(producto)) {
            Integer valor = tienda.getProductosStock().get(producto) + cantidad;
            tienda.getProductosStock().put(producto, valor);
        } else {
            tienda.getProductosStock().put(producto, cantidad);
        }
    }

    public void venderProductos(List<Tienda> tiendas) {
        Tienda tienda = seleccionarTienda(tiendas);
        ProductoServicio productoServicio = new ProductoServicio();
        Producto compra = productoServicio.seleccionarProducto(tienda.getProductosStock().keySet().stream().toList());
        if (tienda.getProductosStock().containsKey(compra)) {
            System.out.println("ingrese la cantidad que desea comprar: ");
            Integer cantidad = Integer.parseInt(scan.nextLine());
            if (cantidad <= tienda.getProductosStock().get(compra)) {
                Integer diferencia = tienda.getProductosStock().get(compra) - cantidad;
                tienda.getProductosStock().put(compra, diferencia);
            } else {
                System.out.println("no se cuenta con el stock suficiente");
            }
        } else {
            System.out.println("el producto no existe en la tienda");
        }
    }

    public void eliminarProductos(List<Tienda> tiendas) {
        Tienda tienda = seleccionarTienda(tiendas);
        tienda.getProductosStock().forEach((producto, integer) -> System.out.println(producto + " - STOCK: " + integer));
        ProductoServicio productoServicio = new ProductoServicio();
        Producto eliminar = productoServicio.seleccionarProducto(tienda.getProductosStock().keySet().stream().toList());
        System.out.println("esta seguro de eliminar el producto? (S/N)");
        if (scan.nextLine().equalsIgnoreCase("s")) {
            tienda.getProductosStock().remove(eliminar);
            System.out.println("producto eliminado con exito");
        } else {
            System.out.println("no se elimima ningun producto");
        }
    }

    public void stockProductos(Tienda tienda) {
        tienda.getProductosStock().forEach((producto, integer) -> System.out.println(producto + " - STOCK: " + integer));
    }
}
