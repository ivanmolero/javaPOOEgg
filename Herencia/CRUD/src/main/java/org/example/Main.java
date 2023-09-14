package org.example;

import org.example.entidades.Persona;
import org.example.entidades.Producto;
import org.example.servicios.Crud;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Persona persona = new Persona();
        Crud crud = new Crud();
//        persona = (Persona) crud.crearObjeto(persona);
//        System.out.println(persona);
//        crud.editaObjeto(persona);
//        System.out.println(persona);

        Producto producto = (Producto) crud.crearObjeto(new Producto());
        System.out.println(producto);
        crud.editaObjeto(producto);
        System.out.println(producto);
    }
}