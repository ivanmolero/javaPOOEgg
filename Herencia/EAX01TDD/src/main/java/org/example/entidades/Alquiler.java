package org.example.entidades;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class Alquiler {
    private String nombreCliente;
    private String documentoCliente;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private Integer posicionAmarre;
    private Barco barco;
    private DateTimeFormatter dtf;

    public Alquiler() {
        dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    }

    public Alquiler(String nombreCliente, String documentoCliente, LocalDate fechaAlquiler, LocalDate fechaDevolucion, Integer posicionAmarre, Barco barco) {
        this();
        this.nombreCliente = nombreCliente;
        this.documentoCliente = documentoCliente;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDocumentoCliente() {
        return documentoCliente;
    }

    public void setDocumentoCliente(String documentoCliente) {
        this.documentoCliente = documentoCliente;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Integer getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(Integer posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    public Integer calcularAlquiler() {
        Period period = Period.between(this.fechaAlquiler, this.fechaDevolucion);
        return period.getDays() * barco.calculoModulo();
    }

    public void crearAlquiler(List<Barco> barcos) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ingrese el nombre del cliente: ");
        this.nombreCliente = scan.nextLine();
        System.out.println("ingrese el numero de documento del cliente: ");
        this.documentoCliente = scan.nextLine();
        System.out.println("ingrese la fecha de inicio de alquiler (dd/mm/aaaa): ");
        this.fechaAlquiler = LocalDate.parse(scan.nextLine(), this.dtf);
        System.out.println("ingrese la fecha de devolución del barco (dd/mm/aaaa): ");
        this.fechaDevolucion = LocalDate.parse(scan.nextLine(), this.dtf);
        System.out.println("ingrese la posición de amarre en el muelle: ");
        this.posicionAmarre = Integer.parseInt(scan.nextLine());
        System.out.println("la lista de barcos es: ");
        for (int i = 0; i < barcos.size(); i++) {
            System.out.println((i + 1) + " - " + barcos.get(i).toString());
        }
        System.out.println("ingrese la selección: ");
        int posicion = Integer.parseInt(scan.nextLine());
        this.barco = barcos.get(posicion - 1);
        System.out.println("el monto del alquiler del barco es: " + this.calcularAlquiler());
    }
}
