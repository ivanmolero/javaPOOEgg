package entidades;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BarcoTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void crearBarcoTest() {
        Barco barco = new Barco() {};
        assertTrue(barco instanceof Barco);
    }

    void attributesTest() {

    }
}