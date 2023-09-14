package org.example.entidades;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FamiliaTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("prueba relaciones de herencia")
    void pruebaRelacionesDeHerencia() {

        assertAll(
                "pruebas de relaciones de herencia",
                () -> assertInstanceOf(Familia.class, new ConFactorRiesgo()),
                () -> assertInstanceOf(Familia.class, new SinFactorRiesgo()),
                () -> assertInstanceOf(Integrante.class, new Ninio()),
                () -> assertInstanceOf(Integrante.class, new Joven()),
                () -> assertInstanceOf(Integrante.class, new Adulto()),
                () -> assertInstanceOf(Integrante.class, new AdultoMayor())
        );
    }
}