package servicios;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateValidatorTest {

    @Test
    void validaFecha() {
        DateValidator dv = new DateValidator();
        assertTrue(dv.validaFecha(1, 1, 2023));
        assertTrue(dv.validaFecha(31, 12, 2023));
        assertTrue(dv.validaFecha(31, 7, 2023));
        assertFalse(dv.validaFecha(32, 7, 2023));
        assertTrue(dv.validaFecha(31, 8, 2023));
        assertFalse(dv.validaFecha(32, 8, 2023));
        assertTrue(dv.validaFecha(30, 9, 2023));
        assertFalse(dv.validaFecha(31, 9, 2023));
        assertTrue(dv.validaFecha(28, 2, 2023));
        assertFalse(dv.validaFecha(29, 2, 2023));
        assertTrue(dv.validaFecha(29, 2, 2020));
        assertFalse(dv.validaFecha(30, 2, 2020));
        assertTrue(dv.validaFecha(28, 2, 1900));
        assertFalse(dv.validaFecha(29, 2, 1900));
    }
}