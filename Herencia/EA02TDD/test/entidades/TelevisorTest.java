package entidades;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelevisorTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void createTelevisor() {
        Televisor televisor01 = new Televisor("verde claro", 'z', 50, 40, false);
        Televisor televisor02 = new Televisor("azul", 'b', 80, 40, true);
        assertAll(
                () -> assertEquals("blanco", televisor01.getColor()),
                () -> assertEquals('F', televisor01.getConsumoEnergetico()),
                () -> assertEquals("azul", televisor02.getColor()),
                () -> assertEquals('B', televisor02.getConsumoEnergetico()),
                () -> assertEquals(1000, televisor01.getPrecio()),
                () -> assertEquals(1000, televisor02.getPrecio()),
                () -> assertEquals(40, televisor01.getResolucion()),
                () -> assertTrue(televisor02.getSintonizadorTDT()),
                () -> assertFalse(televisor01.getSintonizadorTDT())
        );
    }

    @Test
    void precioFinalTelevisor() {
        Televisor televisor01 = new Televisor("verde claro", 'z', 50, 40, false);
        Televisor televisor02 = new Televisor("azul", 'b', 30, 40, true);
        Televisor televisor03 = new Televisor("azul", 'b', 30, 45, false);
        Televisor televisor04 = new Televisor("azul", 'b', 30, 45, true);
        assertAll(
                () -> assertEquals(1900, televisor01.precioFinal()),
                () -> assertEquals(2800, televisor02.precioFinal()),
                () -> assertEquals(2990, televisor03.precioFinal()),
                () -> assertEquals(3490, televisor04.precioFinal())
        );
    }
}