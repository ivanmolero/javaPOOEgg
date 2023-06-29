package servicios;

import entidades.Curso;

import java.util.Scanner;

public class InterfazServicio {
    Scanner scan = new Scanner(System.in);
    Curso curso;
    CursoServicio cs = new CursoServicio();
    public void mostrarMenu() {
        String[] elementos = {
                "1. Crear Curso",
                "2. Mostrar Curso",
                "3. Calcular Ganancia",
                "4. Salir"
        };
        for (int i = 0; i < elementos.length; i++) {
            System.out.println(elementos[i]);
        }
    }

    public int seleccionaOpcion(int salida) {
        int op = 0;
        do {
            mostrarMenu();
            System.out.println("seleccione la opción: ");
            op = Integer.parseInt(scan.nextLine());
            if (op > salida || op < 0) {
                System.out.println("ingrese una opción válida");
            }
        } while(op > salida || op < 0);
        return op;
    }
    
    public void activaOpcion(int opcion) {
        switch (opcion) {
            case 1:
                curso = cs.crearCurso();
                break;
            case 2:
                System.out.println(curso.toString());
                break;
            case 3:
                System.out.println("la ganancia del curso " + curso.getNombreCurso() + " es: " + cs.calcularGanancia(curso));
                break;

        }
    }
}
