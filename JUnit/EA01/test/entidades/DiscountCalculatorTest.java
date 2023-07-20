package entidades;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiscountCalculatorTest {
    static DiscountCalculator dc;
    @BeforeAll
    static void setUp() {
        dc = new DiscountCalculator();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testDescuento() {
        assertEquals(90, dc.descuento(10, 100));
        assertEquals(150, dc.descuento(25, 200));
    }

    @Test
    void testDescuento10() {
        assertEquals(45, dc.descuento10(50));
        assertEquals(180, dc.descuento10(200));
    }

    @Test
    void testDescuentoMaximo() {
        assertEquals(150, dc.descuentoMaximo(200));
        assertEquals(750, dc.descuentoMaximo(1000));
    }

    @Test
    void testSinDescuento() {
        assertEquals(100, dc.sinDescuento(100));
        assertEquals(250, dc.sinDescuento(250));
    }
}