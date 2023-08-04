package servicios;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CodigoPostalServicioTest {


    @BeforeEach
    void setUp() {
    }

    @Test
    void crearCodigoPostal() {
        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream("Abrajanejo\n11630\n".getBytes()));

        CodigoPostalServicio codigoPostalServicio = new CodigoPostalServicio();
        Map<Integer, String> ciudades = new HashMap<>();

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(byteArrayOutputStream);

        System.setOut(ps);
        codigoPostalServicio.crearCodigoPostal(ciudades);
        System.setIn(stdin);

        String outputText = byteArrayOutputStream.toString();
        String key = "\n";
        String output = outputText.split(key)[2].trim();//.substring(outputText.indexOf(key) + key.length()).trim();
        assertEquals("el codigo 11630 corresponde a la ciudad Abrajanejo", output );
    }

    @Test
    void fabricaCodigoPostal() {
        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream("Abrajanejo\n11630\nS\nAlbergue\n11350\nS\nAlcalá del Valle\n11693\nn\n".getBytes()));

        CodigoPostalServicio codigoPostalServicio = new CodigoPostalServicio();
        Map<Integer, String> ciudades = new HashMap<>();

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(byteArrayOutputStream);

        System.setOut(ps);
        codigoPostalServicio.fabricaCodigoPostal(ciudades);
        System.setIn(stdin);

        String outputText = byteArrayOutputStream.toString();
        String key = "\n";
        String[] salidas = outputText.split(key);
        //.substring(outputText.indexOf(key) + key.length()).trim();
        assertAll(
                () -> {assertEquals("el codigo 11630 corresponde a la ciudad Abrajaneja", salidas[2].trim() );},
                () -> {assertEquals("el codigo 11350 corresponde a la ciudad Albergue", salidas[6].trim() );},
                () -> {assertEquals("el codigo 11693 corresponde a la ciudad Alcalá de Valle", salidas[10].trim() );}
        );
    }

    @Test
    void listarCodigoPostal() {
    }

    @Test
    void buscaCiudad() {
    }

    @Test
    void eliminaCiudad() {
    }
}