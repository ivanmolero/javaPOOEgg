package servicios;

import entidades.Pais;
import utilidades.Comparadores;

import java.util.*;

public class AppServicio {
    private String[] menu = {
            "Crear paises",
            "Listar paises",
            "Ordenar paises",
            "Mezclar paises",
            "Elimina pais",
            "Salir"
    };
    private Scanner scan;
    private PaisServicio paisServicio;
    private Set<Pais> paises;

    public AppServicio() {
        this.scan = new Scanner(System.in);
        this.paisServicio = new PaisServicio();
        this.paises = new HashSet<Pais>();
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
                this.paisServicio.fabricaPaises(this.paises);
                break;
            case 2:
                this.paisServicio.listarPaises(this.paises);
                break;
            case 3:
                this.paisServicio.ordenarPaises(this.paises, Comparadores.orderByNombreAsc);
                break;
            case 4:
                this.paisServicio.mezclarPaises(this.paises);
                break;
            case 5:
                this.paisServicio.eliminaPais(this.paises);
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
        this.paises.add(new Pais("Peru"));
        this.paises.add(new Pais("Argentina"));
        this.paises.add(new Pais("Colombia"));
        this.paises.add(new Pais("Argentina"));
        this.paises.add(new Pais("Uruguay"));
        this.paises.add(new Pais("Bolivia"));
        this.paises.add(new Pais("Colombia"));
        this.paises.add(new Pais("Venezuela"));
        this.paises.add(new Pais("Ecuador"));
        this.paises.add(new Pais("Peru"));
        this.paises.add(new Pais("Bolivia"));
    }
}
