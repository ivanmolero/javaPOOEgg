package servicios;

import entidades.Curso;

import java.util.Scanner;

public class CursoServicio {
    private Scanner scan = new Scanner(System.in);
    public void cargarAlumnos(Curso curso) {
        String[] alumnos = curso.getAlumnos();
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("ingrese el nombre del alumno " + (i + 1) + ": ");
            alumnos[i] = scan.nextLine();
        }
    }

    public Curso crearCurso() {
        Curso curso = new Curso();
        System.out.println("ingrese el nombre del curso: ");
        curso.setNombreCurso(scan.nextLine());
        System.out.println("ingrese la cantidad de horas por día: ");
        curso.setCantidadHorasPorDia(Integer.parseInt(scan.nextLine()));
        System.out.println("ingrese la cantidad de dias por semana: ");
        curso.setCantidadDiasPorSemana(Integer.parseInt(scan.nextLine()));
        System.out.println("ingrese el turno (mañana/tarde): ");
        curso.setTurno(scan.nextLine());
        System.out.println("ingrese el precio por hora: ");
        curso.setPrecioPorHora(Double.parseDouble(scan.nextLine()));
        cargarAlumnos(curso);
        return curso;
    }

    public double calcularGanancia(Curso curso) {
        return curso.getPrecioPorHora() * curso.getCantidadHorasPorDia() * curso.getCantidadDiasPorSemana() * curso.getAlumnos().length;
    }
}
