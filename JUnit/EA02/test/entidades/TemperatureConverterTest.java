package entidades;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TemperatureConverterTest {
    TemperatureConverter tc;

    @BeforeAll
    void setUp() {
        tc = new TemperatureConverter();
    }

    @Test
    void celciusFahrenheit() {
        assertEquals(32, tc.celciusFahrenheit(0));
        assertEquals(122, tc.celciusFahrenheit(50));
    }

    @Test
    void fahrenheitCelcius() {
        assertEquals(0, tc.fahrenheitCelcius(32));
        assertEquals(50, tc.fahrenheitCelcius(122));
    }

    @Test
    void celciusKelvin() {
        assertEquals(273.15, tc.celciusKelvin(0));
    }

    @Test
    void kelvinCelcius() {
        assertEquals(0, tc.kelvinCelcius(273.15));
    }
}