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
//        productoServicio.crearProducto();
        codigoPostalServicio.crearCodigoPostal(ciudades);
        System.setIn(stdin);

        String outputText = byteArrayOutputStream.toString();
        String key = "\n";
        //String output = outputText.substring(outputText.indexOf(key) + key.length()).trim();
        String output = outputText.split(key)[2].trim();//.substring(outputText.indexOf(key) + key.length()).trim();
        assertEquals("el codigo 11630 corresponde a la ciudad Abrajanejo", output );
    }

    @Test
    void fabricaCodigoPostal() {
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