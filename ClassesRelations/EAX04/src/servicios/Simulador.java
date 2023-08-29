package servicios;

import entidades.Alumno;
import entidades.Voto;
import utilidades.Comparadores;

import java.util.*;

public class Simulador {
    private List<String> nombres;
    private List<String> apellidos;

    public Simulador() {
        this.nombres = new ArrayList<>();
        this.apellidos = new ArrayList<>();
        cargarDatos();
    }

    private void cargarDatos() {
        String valores = "Alejandro Alberto Andrés Antonio Carlos David Diego Eduardo Fernando Francisco Gabriel Guillermo Héctor Ignacio Iván Javier Jorge José Juan Luis Manuel Marcos Miguel Pablo Pedro Rafael Roberto Santiago Sebastián Tomás Vicente Alejandra Ana Andrea Antonia Beatriz Camila Carolina Catalina Claudia Daniela Diana Elena Erika Gabriela Isabel Irene Jacqueline Jessica Laura Lucía María Mariana Marta Natalia Nicole Patricia Paula Pilar Renata Sofía Valeria Victoria";
        this.nombres.addAll(Arrays.asList(valores.split(" ")));
        valores = "Acuña Aguilar Alcántara Alonso Álvarez Anaya Aparicio Aranda Arenas Ávila Ayala Baeza Báez Ballesteros Barragán Bautista Beltrán Bernal Blanco Bolaños Bonilla Borja Calderón Camacho Campos Cano Cárdenas Carranza Carrera Castillo Castro Centeno Cerda Chávez Cisneros Colmenares Contreras Cortés Crespo Cruz Cuevas Delgado Díaz Domínguez Escobar Espinosa Estrada Fernández Flores Fonseca Franco García Garza Gómez González Guerrero Gutiérrez Guzmán Hernández Herrera Ibarra Ibáñez Jiménez Lara Limón López Martínez Martínez Medina Meléndez Méndez Mendoza Mercado Molina Morales Moreno Muñoz Narváez Navarro Núñez Olvera Ortega Ortiz Oviedo Páez Paredes Pérez Pérez Pizarro Ponce Ramírez Ramos Rangel Reyes Rivera Rodríguez Romero Ruiz Sánchez Sánchez Sandoval Santos Saucedo Serrano Silva Soto Suárez Tapia Torres Treviño Valdez Valencia Varela Vázquez Velázquez Vidal Villa Villanueva Villegas Villarreal Yáñez";
        this.apellidos.addAll(Arrays.asList(valores.split(" ")));
    }

    public List<String> generarListaNombres(int cantidad) {
        List<String> lista = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            lista.add(valorAleatorio(this.nombres) + " " + valorAleatorio(this.apellidos));
        }
        return lista;
    }

    private String valorAleatorio(List<String> lista) {
        return lista.get((int)(Math.random() * lista.size()));
    }

    public List<String> generarDnis(int cantidad) {
        Set<String> lista = new HashSet<>();
        String valor = "";
        do {
            valor = String.valueOf((int)(Math.random() * 98999999) + 1000000);
            if (valor.length() < 8) valor = "0".repeat(8 - valor.length()) + valor;
            lista.add(valor);
        } while(lista.size() < cantidad);
        return lista.stream().toList();
    }

    public List<Alumno> generarAlumnos(int cantidad, List<String> nombres, List<String> dnis) {
        List<Alumno> lista = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            lista.add(new Alumno(valorAleatorio(nombres), dnis.get(i)));
        }
        return lista;
    }

    public void mostrarAlumnos(List<Alumno> alumnos) {
        alumnos.forEach(alumno -> System.out.println(alumno));
    }

    public List<Voto> votacion(List<Alumno> alumnos, Integer cantidadVotos) {
        List<Voto> votos = new ArrayList<>();
        Set<Alumno> votados = new HashSet<>();
        for (Alumno alumno : alumnos) {
            votados.add(alumno);
            do {
                votados.add(alumnos.get((int)(Math.random() * alumnos.size())));
            } while(votados.size() < cantidadVotos + 1);
            votados.remove(alumno);
            incrementaVotos(votados);
            votos.add(new Voto(alumno, votados.stream().toList()));
            votados.clear();
        }
        return votos;
    }

    private void incrementaVotos(Set<Alumno> votados) {
        for (Alumno alumno : votados) {
            alumno.setCantidadVotos(alumno.getCantidadVotos() + 1);
        }
    }

    public void mostrarVotos(List<Voto> votos) {
        votos.forEach(voto -> System.out.println(voto));
    }

    public void recuentoVotos(List<Alumno> alumnos, List<Voto> votos) {
        int conteo = 0;
        for (Alumno alumno : alumnos) {
            conteo = 0;
            for (Voto voto : votos) {
                for (Alumno votado : voto.getVotados()) {
                    if (votado.equals(alumno)) conteo++;
                }
            }
            if (alumno.getCantidadVotos() == conteo) {
                System.out.printf("alumno %s, votos: %d - validado\n", alumno.getDni(), conteo);
            } else {
                System.out.printf("alumno %s, votos: %d  - difiere registro: %d\n", alumno.getDni(), conteo, alumno.getCantidadVotos());;
            }
        }
    }

    public void mostrarFacilitadores(List<Alumno> alumnos, Integer cantidad) {
        alumnos.sort(Comparadores.orderByVotosDesc);
        List<Alumno> facilitadores = alumnos.subList(0, cantidad);
        List<Alumno> suplentes = alumnos.subList(cantidad, 2 * cantidad);
        System.out.println("FACILITADORES");
        facilitadores.forEach(alumno -> System.out.println(alumno));
        System.out.println();
        System.out.println("SUPLENTES");
        suplentes.forEach(alumno -> System.out.println(alumno));
    }
}
