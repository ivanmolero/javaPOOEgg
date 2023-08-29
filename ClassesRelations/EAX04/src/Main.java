import entidades.Alumno;
import entidades.Voto;
import servicios.Simulador;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Simulador simulador = new Simulador();
        int cantidad = 100;
        List<Alumno> alumnos = simulador.generarAlumnos(cantidad, simulador.generarListaNombres(cantidad), simulador.generarDnis(cantidad));
        simulador.mostrarAlumnos(alumnos);
        List<Voto> votos = simulador.votacion(alumnos, 3);
        simulador.mostrarVotos(votos);
        simulador.recuentoVotos(alumnos, votos);
        simulador.mostrarFacilitadores(alumnos, 5);
    }
}