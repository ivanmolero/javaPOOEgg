package servicios;

import entidades.Pais;

import java.util.*;

public class PaisServicio {
    Scanner scan;

    public PaisServicio() {
        scan = new Scanner(System.in);
    }

    public Pais crearPais() {
        Pais pais = new Pais();
        System.out.println("ingrese el nombre del pais: ");
        pais.setNombre(scan.nextLine());
        return pais;
    }

    public void agregarPais(Pais pais, Set<Pais> paises) {
        paises.add(pais);
    }

    public void fabricaPaises(Set<Pais> paises) {
        do {
            agregarPais(crearPais(), paises);
            System.out.println("desea seguir ingresando paises? (S/N)");
        } while(scan.nextLine().equalsIgnoreCase("s"));
    }

    public void listarPaises(Set<Pais> paises) {
        paises.forEach(pais -> System.out.println(pais));
    }
    public void listarPaises(List<Pais> paises) {
        paises.forEach(pais -> System.out.println(pais));
    }

    public void ordenarPaises(Set<Pais> paises, Comparator<Pais> comparator) {
        List<Pais> listaPaises = new ArrayList<>(paises);
        Collections.sort(listaPaises, comparator);
        listarPaises(listaPaises);
    }

    public void mezclarPaises(Set<Pais> paises) {
        List<Pais> listaPaises = new ArrayList<>(paises);
        Collections.shuffle(listaPaises);
        listarPaises(listaPaises);
    }

    public void eliminaPais(Set<Pais> paises) {
        System.out.println("ingrese el nombre del pais a eliminar: ");
        String nombrePais = scan.nextLine();
        if (paises.contains(new Pais(nombrePais))) {
            Iterator<Pais> iterator = paises.iterator();
            while (iterator.hasNext()) {
                Pais pais = iterator.next();
                if (pais.getNombre().equals(nombrePais)) {
                    iterator.remove();
                }
            }
            System.out.println("pais " + nombrePais + " eliminado con exito") ;
        } else {
            System.out.println("pais " + nombrePais + " no esta en la lista");
        }
    }
}
