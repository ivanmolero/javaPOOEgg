package org.example;

import org.example.servicios.AppService;

public class Main {
    public static void main(String[] args) {
        AppService app = new AppService();
        app.iniciar();
    }
}