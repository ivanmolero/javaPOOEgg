package entidades;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElectrodomesticoTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void createElectrodomestico() {
        Electrodomestico electro01 = new Electrodomestico("verde claro", 'z', 50);
        Electrodomestico electro02 = new Electrodomestico("azul", 'b', 80);
        assertAll(
                () -> assertEquals("blanco", electro01.getColor()),
                () -> assertEquals('F', electro01.getConsumoEnergetico()),
                () -> assertEquals("azul", electro02.getColor()),
                () -> assertEquals('B', electro02.getConsumoEnergetico()),
                () -> assertEquals(1000, electro01.getPrecio()),
                () -> assertEquals(1000, electro02.getPrecio())
        );
    }

    @Test
    void precioFinalElectrodomestico() {
        Electrodomestico electro01 = new Electrodomestico("verde claro", 'z', 50);
        Electrodomestico electro02 = new Electrodomestico("azul", 'b', 30);
        assertAll(
                () -> assertEquals(1900, electro01.precioFinal()),
                () -> assertEquals(2300, electro02.precioFinal())
        );
    }
}