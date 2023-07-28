package servicios;

import entidades.Producto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppServicio {
    Tienda tienda;
    String[] menu = {
            "Mantenimiento de Productos",
            "Venta",
            "Reposición de Productos",
            "Salir"
    };
    String[] menuCRUDProducto = {
            "Crear Producto",
            "Modificar Producto",
            "Listar Productos",
            "Eliminar Producto",
            "Salir"
    };
    Scanner scan;
    ProductoServicio ps;
    public AppServicio() {
        this.tienda = new Tienda();
        this.scan = new Scanner(System.in);
        this.ps = new ProductoServicio();
    }

    public void iniciar() {
        int op = 0;
        do {
            op = seleccionaMenu(menu);
            activaSeleccionMenu(op);
        } while(op != menu.length);
    }

    private void activaSeleccionMenu(int op) {
        switch (op) {
            case 1:
                int opcion = 0;
                do {
                    opcion = seleccionaMenu(menuCRUDProducto);
                    activaSeleccionMenuCRUDProducto(opcion);
                } while(opcion != menuCRUDProducto.length);
                break;
            case 2:
                if (this.tienda.venta()) {
                    System.out.println("venta realizada con exito");
                } else {
                    System.out.println("no se pudo realizar la venta");
                }
                break;
            case 3:
                this.tienda.reposicion();
                break;

        }
    }

    private void activaSeleccionMenuCRUDProducto(int op) {
        switch (op) {
            case 1:
                this.tienda.fabricaProductos(this.ps);
                break;
            case 2:
                this.tienda.editarProducto(this.ps);
                break;
            case 3:
                this.tienda.listarProductos(this.ps);
                break;
            case 4:
                this.tienda.eliminarProducto(this.ps);
                break;
        }
    }

    private int seleccionaMenu(String[] menu) {
        int op = 0;
        do {
            for (int i = 0; i < menu.length; i++) {
                System.out.println((i + 1) + " - " + menu[i]);
            }
            System.out.println("ingrese la opción");
            op = Integer.parseInt(scan.nextLine());
            if (op < 1 || op > menu.length) {
                System.out.println("ingrese una opción válida");
            }
        } while(op < 1 || op > menu.length);
        return op;
    }
}
