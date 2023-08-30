package servicios;

import entidades.Producto;
import entidades.Tienda;

import java.util.ArrayList;
import java.util.List;

public class AppServicio {
    private List<Tienda> tiendas;
    private TiendaServicio tiendaServicio;
    private List<Producto> productos;
    private ProductoServicio productoServicio;

    public AppServicio() {
        this.tiendas = new ArrayList<>();
        this.productos = new ArrayList<>();
        this.tiendaServicio = new TiendaServicio();
        this.productoServicio = new ProductoServicio();
    }

    public void iniciar(){
//        for (int i = 0; i < 3; i++) {
//            this.tiendas.add(this.tiendaServicio.crearTienda());
//        }
//        this.tiendaServicio.mostrarTiendas(this.tiendas);
//        for (int i = 0; i < 15; i++) {
//            this.productos.add(productoServicio.crearProducto());
//        }
//        this.productoServicio.mostrarProductos(this.productos);
        cargarDatos();
//        this.tiendaServicio.modificarTienda(this.tiendas);
//        System.out.println("--------------------------");
//        this.tiendaServicio.mostrarTiendas(this.tiendas);
//        System.out.println("--------------------------");
//        this.productoServicio.modificarProducto(this.productos);
//        System.out.println("--------------------------");
//        this.productoServicio.mostrarProductos(this.productos);

//        this.tiendaServicio.eliminarTienda(this.tiendas);
//        System.out.println("--------------------------");
//        this.tiendaServicio.mostrarTiendas(this.tiendas);
//        System.out.println("--------------------------");
//        this.productoServicio.eliminarProducto(this.productos);
//        System.out.println("--------------------------");
//        this.productoServicio.mostrarProductos(this.productos);
        for (Tienda tienda : this.tiendas) {
            tiendaServicio.stockProductos(tienda);
            System.out.println("------------------------------");
        }
        for (int i = 0; i < 3; i++) {
            tiendaServicio.venderProductos(this.tiendas);
        }
        for (Tienda tienda : this.tiendas) {
            tiendaServicio.stockProductos(tienda);
            System.out.println("------------------------------");
        }

    }

    private void cargarDatos() {
        this.tiendas.add(new Tienda("avenida uno", "ivan"));
        this.tiendas.add(new Tienda("avenida dos", "pablo"));
        this.tiendas.add(new Tienda("avenida tres", "david"));

        this.productos.add(new Producto("cocacola", 500.0));
        this.productos.add(new Producto("soda", 200.0));
        this.productos.add(new Producto("jugo", 400.0));
        this.productos.add(new Producto("galleta oreo", 300.0));
        this.productos.add(new Producto("cigarrillos", 1000.0));
        this.productos.add(new Producto("cerveza", 2000.0));
        this.productos.add(new Producto("chocolate", 500.0));
        this.productos.add(new Producto("azucar", 500.0));
        this.productos.add(new Producto("arroz", 300.0));
        this.productos.add(new Producto("fideos", 350.0));
        this.productos.add(new Producto("leche", 500.0));
        this.productos.add(new Producto("cafe", 600.0));
        this.productos.add(new Producto("caramelos", 100.0));
        this.productos.add(new Producto("jugo de mango", 400.0));
        this.productos.add(new Producto("jugo de manzana", 350.0));

        this.tiendas.get(0).getProductosStock().put(this.productos.get(0), 5);
        this.tiendas.get(0).getProductosStock().put(this.productos.get(1), 6);
        this.tiendas.get(0).getProductosStock().put(this.productos.get(2), 3);
        this.tiendas.get(0).getProductosStock().put(this.productos.get(3), 4);
        this.tiendas.get(0).getProductosStock().put(this.productos.get(4), 2);
        this.tiendas.get(1).getProductosStock().put(this.productos.get(4), 5);
        this.tiendas.get(1).getProductosStock().put(this.productos.get(5), 6);
        this.tiendas.get(1).getProductosStock().put(this.productos.get(6), 3);
        this.tiendas.get(1).getProductosStock().put(this.productos.get(7), 4);
        this.tiendas.get(1).getProductosStock().put(this.productos.get(8), 2);
        this.tiendas.get(2).getProductosStock().put(this.productos.get(8), 5);
        this.tiendas.get(2).getProductosStock().put(this.productos.get(9), 6);
        this.tiendas.get(2).getProductosStock().put(this.productos.get(10), 3);
        this.tiendas.get(2).getProductosStock().put(this.productos.get(11), 4);
        this.tiendas.get(2).getProductosStock().put(this.productos.get(12), 2);
    }
}
