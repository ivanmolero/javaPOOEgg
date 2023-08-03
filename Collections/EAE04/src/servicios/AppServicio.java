package servicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AppServicio {
    private String[] menu = {
            "Crear ciudades",
            "Listar ciudades",
            "Buscar por código",
            "Elimina ciudad",
            "Salir"
    };
    private Scanner scan;
    private CodigoPostalServicio codigoPostalServicio;
    private Map<Integer, String > ciudades;

    public AppServicio() {
        this.scan = new Scanner(System.in);
        this.codigoPostalServicio = new CodigoPostalServicio();
        this.ciudades = new HashMap<>();
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
                this.codigoPostalServicio.fabricaCodigoPostal(this.ciudades);
                break;
            case 2:
                this.codigoPostalServicio.listarCodigoPostal(this.ciudades);
                break;
            case 3:
                this.codigoPostalServicio.buscaCiudad(this.ciudades);
                break;
            case 4:
                this.codigoPostalServicio.eliminaCiudad(this.ciudades);
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
        this.ciudades.put(11630, "Abrajanejo");
        this.ciudades.put(11350, "Albergue");
        this.ciudades.put(11693, "Alcalá del Valle");
        this.ciudades.put(11339, "Aldefilla");
        this.ciudades.put(11202, "Algeciras");
        this.ciudades.put(11205, "Algeciras");
        this.ciudades.put(11351, "Almoraima");

    }
}
