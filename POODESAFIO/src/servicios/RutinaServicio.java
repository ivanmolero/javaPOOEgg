package servicios;

import entidades.Rutina;

import java.util.List;
import java.util.Scanner;

public class RutinaServicio {
    Scanner scan = new Scanner(System.in);
    public void crearRutina(List<Rutina> lista) {
        System.out.println("CREAR RUTINA");
        Rutina rutina = new Rutina();
        System.out.println("ingrese el nombre: ");
        rutina.setNombre(scan.nextLine());
        System.out.println("ingrese la duración: ");
        rutina.setDuracion(Integer.parseInt(scan.nextLine()));
        System.out.println("ingrese el nivel de dificultad: ");
        rutina.setNivelDificultad(Integer.parseInt(scan.nextLine()));
        System.out.println("ingrese la descripción: ");
        rutina.setDescripcion(scan.nextLine());
        lista.add(rutina);
    }

    public void listarRutinas(List<Rutina> rutinas) {
        int i = 0;
        for (Rutina rutina : rutinas) {
            System.out.println(i + " - " + rutina.toString());
            i++;
        }
    }

    public void editarRutina(List<Rutina> rutinas) {
        Rutina rutina = seleccionaRutina(rutinas);
        int op = 0;
        do {
            do {
                System.out.println("Modificando datos");
                System.out.println("1. Nombre      <"  + rutina.getNombre() + ">");
                System.out.println("2. Duración    <"  + rutina.getDuracion() + ">");
                System.out.println("3. Dificultad  <"  + rutina.getNivelDificultad() + ">");
                System.out.println("4. Descripción <"  + rutina.getDescripcion() + ">");
                System.out.println("5. Salir");
                System.out.println("seleccione una opción");
                op = Integer.parseInt(scan.nextLine());
                if (op < 1 || op > 5) {
                    System.out.println("seleccione una opción válida");
                }
            } while(op < 1 || op > 5);
            switch (op) {
                case 1:
                    System.out.println("ingrese el nuevo valor de nombre");
                    rutina.setNombre(scan.nextLine());
                    break;
                case 2:
                    System.out.println("ingrese el nuevo valor de duración (minutos)");
                    rutina.setDuracion(Integer.parseInt(scan.nextLine()));
                    break;
                case 3:
                    System.out.println("ingrese el nuevo valor de dificultad");
                    rutina.setNivelDificultad(Integer.parseInt(scan.nextLine()));
                    break;
                case 4:
                    System.out.println("ingrese el nuevo valor de descripción");
                    rutina.setDescripcion(scan.nextLine());
                    break;
            }
        } while(op != 6);
    }

    private Rutina seleccionaRutina(List<Rutina> rutinas) {
        int posicion = -1;
        System.out.println("seleccionar rutina");
        listarRutinas(rutinas);
        System.out.println("ingrese la posición de la rutina a seleccionar");
        posicion = Integer.parseInt(scan.nextLine());
        return rutinas.get(posicion);
    }

    public void eliminaRutina(List<Rutina> rutinas) {
        Rutina rutina = seleccionaRutina(rutinas);
        System.out.println("está seguro de eliminar la rutina (S/N)?");
        if (scan.nextLine().equalsIgnoreCase("s")) {
            rutinas.remove(rutina);
            System.out.println("rutina eliminada con éxito");
        }
    }
}
