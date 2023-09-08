package org.example.entidades;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AlquilerTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void pruebasHerencia() {
        Velero velero = new Velero();
        Motor motor = new Motor();
        Yate yate = new Yate();
        assertAll("pruebas de relacion de herencia",
                () -> assertTrue(velero instanceof Barco),
                () -> assertTrue(motor instanceof Barco),
                () -> assertTrue(yate instanceof Motor),
                () -> assertTrue(yate instanceof Barco)
        );
    }

    @Test
    void pruebasCalculoModulo() {
        Barco barco = new Barco("matricula", 10, 1985);
        Motor motor = new Motor("matricula", 10, 1985, 350);
        Velero velero = new Velero("matricula", 10, 1985, 3);
        Yate yate = new Yate("matricula", 10, 1985, 350, 5);
        assertAll("pruebas de calculo de módulo",
                () -> assertEquals(100, barco.calculoModulo()),
                () -> assertEquals(450, motor.calculoModulo()),
                () -> assertEquals(103, velero.calculoModulo()),
                () -> assertEquals(455, yate.calculoModulo())
        );
    }

    @Test
    void pruebasAlquiler() {
        Alquiler alquiler01 = new Alquiler(
                "juan perez", "01234567",
                LocalDate.of(2023, 8, 10),
                LocalDate.of(2023, 8, 15),
                5,
                new Barco("matricula", 10, 1985)
        );
        Alquiler alquiler02 = new Alquiler(
                "juan perez", "01234567",
                LocalDate.of(2023, 8, 10),
                LocalDate.of(2023, 8, 15),
                5,
                new Motor("matricula", 10, 1985, 350)
        );
        Alquiler alquiler03 = new Alquiler(
                "juan perez", "01234567",
                LocalDate.of(2023, 8, 10),
                LocalDate.of(2023, 8, 15),
                5,
                new Velero("matricula", 10, 1985, 3)
        );
        Alquiler alquiler04 = new Alquiler(
                "juan perez", "01234567",
                LocalDate.of(2023, 8, 10),
                LocalDate.of(2023, 8, 15),
                5,
                new Yate("matricula", 10, 1985, 350, 5)
        );
        assertAll("pruebas de calculo de alquiler",
                () -> assertEquals(500, alquiler01.calcularAlquiler()),
                () -> assertEquals(2250, alquiler02.calcularAlquiler()),
                () -> assertEquals(515, alquiler03.calcularAlquiler()),
                () -> assertEquals(2275, alquiler04.calcularAlquiler())
        );
    }

    @Test
    void pruebaCrearAlquiler() {
        List<Barco> barcos = new ArrayList<>();
        barcos.add(new Barco("matricula", 10, 1985));
        barcos.add(new Motor("matricula", 10, 1985, 350));
        barcos.add(new Velero("matricula", 10, 1985, 3));
        barcos.add(new Yate("matricula", 10, 1985, 350, 5));
        Alquiler alquiler = new Alquiler();

        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream("juan perez\n01234567\n10/08/2023\n20/08/2023\n5\n1".getBytes()));

//        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
//        PrintStream ps = new PrintStream(byteArrayOutputStream);
//
//        System.setOut(ps);
//
        alquiler.crearAlquiler(barcos);
//
        System.setIn(stdin);
//
//        String outputText = byteArrayOutputStream.toString();
//        String key = "\n";
//        //String output = outputText.substring(outputText.indexOf(key) + key.length()).trim();
//        String output = outputText.split(key)[11].trim();//.substring(outputText.indexOf(key) + key.length()).trim();
//        //assertEquals("Producto{nombre='Pantalon', categoria=Adulto, precio=15.0, cantidad=2}", output );
        assertAll("pruebas de ingreso de datos",
                // () -> assertEquals("el monto del alquiler del barco es: 1000", output)
                () -> assertEquals(1000, alquiler.calcularAlquiler())
        );
    }
}