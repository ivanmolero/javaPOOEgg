package org.example.entidades;

import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class EdificioTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void pruebaEstructura() {
        assertAll(
                "pruebas de relación de herencia",
                () -> assertInstanceOf(
                        Edificio.class,
                        new Polideportivo(),
                        "la clase Polideportivo no tiene relación con la clase Edificio"
                ),
                () -> assertInstanceOf(
                        Edificio.class,
                        new EdificioDeOficinas(),
                        "la clase EdificioDeOficinas no tiene relación con la clase Edificio"
                )
        );
    }

    @Test
    @DisplayName("pruebas de calculo de superficie")
    void pruebasDeCalculoDeSuperficie() {
        Polideportivo polideportivo1 = new Polideportivo(100, 30, 200, "Poli 01", TipoInstalacion.TECHADO);
        Polideportivo polideportivo2 = new Polideportivo(100, 30, 200, "Poli 02", TipoInstalacion.ABIERTO);
        EdificioDeOficinas edificioDeOficinas1 = new EdificioDeOficinas(50, 45, 150, 15, 40, 15);
        assertAll(
                "pruebas para el cálculo de superficie",
                () -> assertEquals(
                        38000,
                        polideportivo1.calcularSuperficie(),
                        "no coincide valor superficie para polideportivo techado"
                ),
                () -> assertEquals(
                        18000,
                        polideportivo2.calcularSuperficie(),
                        "no coincide valor superficie para polideportivo abierto"
                ),
                () -> assertEquals(
                        25500,
                        edificioDeOficinas1.calcularSuperficie(),
                        "no coincide valor superficie para edificio oficinas"
                )
        );
    }

    @Test
    @DisplayName("pruebas de calculo de volumen")
    void pruebasDeCalculoDeVolumen() {
        Polideportivo polideportivo1 = new Polideportivo(100, 30, 200, "Poli 01", TipoInstalacion.TECHADO);
        Polideportivo polideportivo2 = new Polideportivo(100, 30, 200, "Poli 02", TipoInstalacion.ABIERTO);
        EdificioDeOficinas edificioDeOficinas1 = new EdificioDeOficinas(50, 45, 150, 15, 40, 15);
        assertAll(
                "pruebas para el calculo de volumen",
                () -> assertEquals(
                        600000,
                        polideportivo1.calcularVolumen(),
                        "no coincide el valor del volumen para polideportivo techado"
                ),
                () -> assertEquals(
                        600000,
                        polideportivo2.calcularVolumen(),
                        "no coincide el valor del volumen para polideportivo abierto"
                ),
                () -> assertEquals(
                        337500,
                        edificioDeOficinas1.calcularVolumen(),
                        "no coincide el calculo del volumen para el edificio de oficinas"
                )
        );
    }
    
    @Test
    @DisplayName("pruebas de cantidad de personas por edificio")
    void pruebasDeCantidadDePersonasPorEdificio() {
        EdificioDeOficinas edificioDeOficinas1 = new EdificioDeOficinas(50, 45, 150, 15, 40, 15);

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(byteArrayOutputStream);
        System.setOut(ps);

        edificioDeOficinas1.cantPersonas();

        String outputText = byteArrayOutputStream.toString();
        String key = "\n";
        String personasPiso = outputText.split(key)[0].trim();
        String personasEdificio = outputText.split(key)[1].trim();

        assertAll(
                "pruebas para el cálculo de la cantidad de personas por edificio y por piso",
                () -> assertEquals(
                        "la cantidad de personas por piso es de 40 personas.",
                        personasPiso,
                        "no coincide el calculo de cantidad de personas por piso"
                ),
                () -> assertEquals(
                        "la cantidad de personas en el edificio es de 600 personas.",
                        personasEdificio,
                        "no coincide el calculo de cantidad de personas por edificio"
                )
        );
    }
}