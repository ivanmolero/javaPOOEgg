package org.example.servicios;

import org.example.entidades.ConFactorRiesgo;
import org.example.entidades.Familia;
import org.example.entidades.SinFactorRiesgo;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class FamiliaServicio {
    Scanner scan;

    public FamiliaServicio() {
        this.scan = new Scanner(System.in);
    }

    public Familia crearFamilia() {
        System.out.println("ingrese la dirección de la familia: ");
        String direccion = scan.nextLine();
        System.out.println("ingrese el ide de la familia: ");
        String ide = scan.nextLine();
        System.out.println("ingrese el lote de la familia: ");
        String lote = scan.nextLine();
        System.out.println("ingrese el barrio de la familia: ");
        String barrio = scan.nextLine();
        System.out.println("ingrese la localidad de la familia: ");
        String localidad = scan.nextLine();
        System.out.println("la familia presenta factores de riesgo? (S/N)");
        if (scan.nextLine().equalsIgnoreCase("s")) {
            ConFactorRiesgo conFactorRiesgo = new ConFactorRiesgo(
                    direccion,
                    ide,
                    lote,
                    barrio,
                    localidad
            );
            conFactorRiesgo.setFactores(ingresoFactoresRiesgo(conFactorRiesgo));
            conFactorRiesgo.mostrarFactores();
            return conFactorRiesgo;
        } else {
            System.out.println("la familia presenta mejoras? (S/N)");
            SinFactorRiesgo sinFactorRiesgo = new SinFactorRiesgo(
                    direccion,
                    ide,
                    lote,
                    barrio,
                    localidad,
                    scan.nextLine().equalsIgnoreCase("s")
            );
            return sinFactorRiesgo;
        }
    }

    private List<Integer> ingresoFactoresRiesgo(ConFactorRiesgo conFactorRiesgo) {
        Set<Integer> factores = new HashSet<>();
        do {
            System.out.println("ingrese un factor de riesgo (1-13)");
            factores.add(Integer.parseInt(scan.nextLine()));
            System.out.println("desea agregar factores de riego? (S/N)");
        } while (scan.nextLine().equalsIgnoreCase("s"));
        return factores.stream().toList();
    }

    public void agregarFamilia(Familia familia, List<Familia> familias) {
        familias.add(familia);
    }

    public void editarFamilia(List<Familia> familias) {
        Familia familia = this.seleccionaFamilia(familias);

    }

    private Familia seleccionaFamilia(List<Familia> familias) {
        do {
            this.listarFamilias(familias);
            System.out.println("ingrese el IDE de la familia a seleccionar: ");
            String ide = scan.nextLine();
            List<Familia> familiasCondicion = familias.stream().filter(familia -> familia.getIde().equalsIgnoreCase(ide)).toList();
            if (!familiasCondicion.isEmpty()) {
                return familiasCondicion.get(0);
            } else {
                System.out.println("ide no registrado, repita la busqueda");
            }
        } while (true);
    }

    private void listarFamilias(List<Familia> familias) {
        familias.forEach(familia -> System.out.println(familia));
    }
}
