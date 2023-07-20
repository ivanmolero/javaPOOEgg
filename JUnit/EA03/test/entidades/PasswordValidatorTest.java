package entidades;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class PasswordValidatorTest {
    PasswordValidator pv;
    @BeforeEach
    void setUp() {
        pv = new PasswordValidator();
    }

    @Test
    void longitudMinima() {
        assertEquals(false, pv.longitudMinima("hola"));
        assertEquals(true, pv.longitudMinima("holacomovamos"));
    }

    @Test
    void caracteresEspeciales() {
        assertEquals(false, pv.caracteresEspeciales("holacomovamos"));
        assertEquals(true, pv.caracteresEspeciales("hola!comovamos"));
    }

    @Test
    void caseSensitive() {
        assertEquals(false, pv.caseSensitive("holacomovamos"));
        assertEquals(true, pv.caseSensitive("holaComoVamos"));
    }
}