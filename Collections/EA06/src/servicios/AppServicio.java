package servicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AppServicio {
    private String[] menu = {
            "Crear productos",
            "Editar producto",
            "Eliminar producto",
            "Listar productos",
            "Salir"
    };
    private Scanner scan;
    private ProductoServicio productoServicio;
    private Map<String, Double> productos;

    public AppServicio() {
        this.scan = new Scanner(System.in);
        this.productoServicio = new ProductoServicio();
        this.productos = new HashMap<>();
    }

    public void iniciar() {
        cargarDatos();
        int op = 0;
        do {
            op = seleccionMenu(menu);
            accionaSeleccion(op);
        } while(op != menu.length);
    }

    private void accionaSeleccion(int op) {
        switch (op) {
            case 1:
                this.productoServicio.fabricaProductos(this.productos);
                break;
            case 2:
                this.productoServicio.editarProducto(this.productos);
                break;
            case 3:
                this.productoServicio.eliminarProducto(this.productos);
                break;
            case 4:
                this.productoServicio.listarProductos(this.productos);
                break;
            case 5:
                break;
        }
    }

    private int seleccionMenu(String[] menu) {
        int op = 0;
        int i;
        do {
            i = 1;
            for (String elemento : menu) {
                System.out.println(i + " - " + elemento);
                i++;
            }
            System.out.println("ingrese la opción: ");
            op = Integer.parseInt(scan.nextLine());
            if (op < 1 || op > menu.length) {
                System.out.println("opción ingresada fuera de rango");
            }
        } while(op < 1 || op > menu.length);
        return op;
    }

    private void cargarDatos() {
        this.productos.put("arroz", 5.0);
        this.productos.put("cebolla", 7.0);
        this.productos.put("tomate", 4.0);
        this.productos.put("azucar", 5.5);
        this.productos.put("papa blanca", 2.0);
        this.productos.put("papa maqtillo", 2.5);
        this.productos.put("papa amarilla", 4.5);
        this.productos.put("papa compis", 4.0);
    }
}
