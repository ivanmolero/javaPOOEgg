package servicios;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.w3c.dom.Text;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TextAnalyzerTest {

    TextAnalyzer ta;

    @BeforeEach
    void setUp() {
        ta = new TextAnalyzer();
    }

    @Test
    void numeroPalabras() {
        assertEquals(7, ta.numeroPalabras("1 2 3 4 5 6 7"));
    }

    @Test
    void numeroFrases() {
        assertEquals(3, ta.numeroFrases("1 2 3. 4 5 6. 7 8 9"));
    }

    @Test
    void frecuenciaPalabras() {
        assertEquals(3, ta.frecuenciaPalabras("1 1 1 2 2 3 4 5 6 7").get("1"));
        assertEquals(2, ta.frecuenciaPalabras("1 1 1 2 2 3 4 5 6 7").get("2"));
        assertEquals(1, ta.frecuenciaPalabras("1 1 1 2 2 3 4 5 6 7").get("3"));
    }
}