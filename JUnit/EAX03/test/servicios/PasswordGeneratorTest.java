package servicios;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class PasswordGeneratorTest {
    PasswordGenerator pg;

    @BeforeAll
    void inicio () {
        pg = new PasswordGenerator();
    }
    @Test
    void generaPasswordLongitud() {
        assertTrue(pg.generaPassword().length() >= 8);
    }

    @Test
    void generaPasswordCaseSensitive() {
        String contrasena = pg.generaPassword();
        assertNotEquals(contrasena, contrasena.toLowerCase());
    }

    @Test
    void generaPasswordEspeciales() {
        String caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        boolean valida = true;
        String contrasena = pg.generaPassword();
        for (int i = 0; i < contrasena.length(); i++) {
            valida = valida && caracteres.contains(contrasena.substring(i, i + 1));
        }
        assertFalse(valida);
    }
}