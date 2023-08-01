package utilidades;

import entidades.Pais;

import java.util.Comparator;

public class Comparadores {
    public static Comparator<Pais> orderByNombreAsc = new Comparator<Pais>() {
        @Override
        public int compare(Pais o1, Pais o2) {
            return o1.getNombre().compareTo(o2.getNombre());
        }
    };
}
