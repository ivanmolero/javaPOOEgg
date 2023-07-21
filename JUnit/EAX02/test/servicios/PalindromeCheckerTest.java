package servicios;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class PalindromeCheckerTest {
    PalindromeChecker pc;
    @BeforeAll
    void inicio() {
        pc = new PalindromeChecker();
    }
    @Test
    void verificaPalindromo1() {
        assertTrue(pc.verificaPalindromo("ana"));
    }

    @Test
    void verificaPalindromo2() {
        assertFalse(pc.verificaPalindromo("juan"));
    }

    @Test
    void verificaPalindromo3() {
        assertTrue(pc.verificaPalindromo("Ana"));
    }

}