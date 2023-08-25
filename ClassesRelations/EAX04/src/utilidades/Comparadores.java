package utilidades;

import entidades.Alumno;

import java.util.Comparator;

public class Comparadores {
    public static Comparator<Alumno> orderByVotosDesc = new Comparator<Alumno>() {
        @Override
        public int compare(Alumno o1, Alumno o2) {
            return o2.getCantidadVotos().compareTo(o1.getCantidadVotos());
        }
    };
}
