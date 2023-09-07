package entidades;

import interfaces.CalculoFormas;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CirculoTest {
    Circulo circulo;
    Rectangulo rectangulo;

    public CirculoTest() {
        circulo = new Circulo();
        rectangulo = new Rectangulo();
    }

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void circuloImplementsCalculoFormas() {
        assertAll("pruebas de implementación de interfaz CalculoFormas",
            () -> assertTrue(circulo instanceof CalculoFormas),
            () -> assertTrue(rectangulo instanceof CalculoFormas)
        );
    }

    @Test
    void areas() {
        Circulo circulo = new Circulo(5.0);
        Rectangulo rectangulo = new Rectangulo(5.0, 10.0);
        assertAll("pruebas de calculo de area",
                () -> assertEquals(78.54, circulo.calcularArea(), 0.1),
                () -> assertEquals(50.0, rectangulo.calcularArea(), 0.1)
        );
    }

    @Test
    void perimetros() {
        Circulo circulo = new Circulo(5.0);
        Rectangulo rectangulo = new Rectangulo(5.0, 10.0);
        assertAll( "pruebas de calculo de perimetro",
                () -> assertEquals(31.416, circulo.calcularPerimetro(), 0.1),
                () -> assertEquals(30.0, rectangulo.calcularPerimetro(), 0.1)
        );
    }
}