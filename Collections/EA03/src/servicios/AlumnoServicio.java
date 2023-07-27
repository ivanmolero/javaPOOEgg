package servicios;

import entidades.Alumno;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlumnoServicio {
    private Scanner scan;
    private List<Alumno> alumnos;
    private Alumno alumno;
    public AlumnoServicio() {
        this.scan = new Scanner(System.in);
        this.alumnos = new ArrayList<>();
    }

    public Alumno crearAlumno() {
        this.alumno = new Alumno();
        System.out.println("ingrese el nombre del alumno: ");
        this.alumno.setNombre(scan.nextLine());
        System.out.println("ingrese tres notas a promediar: ");
        for (int i = 0; i < 3; i++) {
            System.out.print("nota " + (i + 1) + ": ");
            this.alumno.getNotas().add(Integer.parseInt(scan.nextLine()));
        }
        return this.alumno;
    }

    public void agregarAlumno(Alumno alumno) {
        this.alumnos.add(alumno);
    }

    public void fabricaAlumnos() {
        Alumno alumno;
        do {
            System.out.println("Crear alumno: ");
            alumno = crearAlumno();
            agregarAlumno(alumno);
            System.out.println(alumno);
            System.out.println("desea seguir ingresando alumnos? (S/N): ");
        } while(scan.nextLine().equalsIgnoreCase("s"));
    }

    public void listarAlumnos() {
        this.alumnos.forEach((alumno) -> System.out.println(alumno));
    }

    public void notaFinal() {
        String nombre;
        do {
            listarAlumnos();
            System.out.println("ingrese el nombre del alumno para ver su nota final: ");
            nombre = scan.nextLine();
            if (existeNombreAlumno(nombre)) {
                System.out.println("la nota final de " + nombre + " es: " + calculaNotaFinal(nombre));
            } else {
                System.out.println("el alumno de nombre " + nombre + " no está en la lista");
            }
            System.out.println("desea seguir calculando notas finales: (S/N)");
        } while(scan.nextLine().equalsIgnoreCase("s"));
    }

    private double calculaNotaFinal(String nombre) {
        Alumno seleccionado = null;
        for (Alumno alumno : this.alumnos) {
            if (alumno.getNombre().equals(nombre)) {
                seleccionado = alumno;
                break;
            }
        }
        double notaFinal = 0.0;
        for (int nota : seleccionado.getNotas()) {
            notaFinal += nota;
        }
        return notaFinal / seleccionado.getNotas().size();
    }

    private boolean existeNombreAlumno(String nombre) {
        for (Alumno alumno : this.alumnos) {
            if (alumno.getNombre().equals(nombre)) {
                return true;
            }
        }
        return false;
    }
}
