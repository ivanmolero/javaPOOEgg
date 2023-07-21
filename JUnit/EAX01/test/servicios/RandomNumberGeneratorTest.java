package servicios;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class RandomNumberGeneratorTest {
    RandomNumberGenerator rng;
    @BeforeEach
    void setUp() {
        rng = new RandomNumberGenerator();
    }

    @Test
    void generar() {

    }
}