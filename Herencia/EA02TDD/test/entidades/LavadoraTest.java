package entidades;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LavadoraTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void createLavadora() {
        Lavadora lav01 = new Lavadora("verde claro", 'z', 50, 40);
        Lavadora lav02 = new Lavadora("azul", 'b', 30, 30);
        assertAll(
                () -> assertEquals("blanco", lav01.getColor()),
                () -> assertEquals('F', lav01.getConsumoEnergetico()),
                () -> assertEquals("azul", lav02.getColor()),
                () -> assertEquals('B', lav02.getConsumoEnergetico()),
                () -> assertEquals(1000, lav01.getPrecio()),
                () -> assertEquals(1000, lav02.getPrecio()),
                () -> assertEquals(40, lav01.getCarga()),
                () -> assertEquals(30, lav02.getCarga())
        );
    }

    @Test
    void precioFinalLavadora() {
        Lavadora lav01 = new Lavadora("verde claro", 'z', 50, 40);
        Lavadora lav02 = new Lavadora("azul", 'b', 30, 30);
        assertAll(
                () -> assertEquals(2400, lav01.precioFinal()),
                () -> assertEquals(2300, lav02.precioFinal())
        );
    }
}