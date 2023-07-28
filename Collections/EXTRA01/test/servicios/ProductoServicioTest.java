package servicios;

import entidades.Producto;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ProductoServicioTest {
    //ProductoServicio productoServicio;

    @BeforeAll
    void iniciar() {
        //productoServicio = new ProductoServicio();
    }

    @Test
    void crearProductoValido() {
        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream("Pantalon\nAdultos\n15\n2\n".getBytes()));
        ProductoServicio productoServicio = new ProductoServicio();
//        ContactManager contactManager = new ContactManager();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(byteArrayOutputStream);

        System.setOut(ps);
        productoServicio.crearProducto();
        System.setIn(stdin);

        String outputText = byteArrayOutputStream.toString();
        String key = "\n";
        //String output = outputText.substring(outputText.indexOf(key) + key.length()).trim();
        String output = outputText.split(key)[4].trim();//.substring(outputText.indexOf(key) + key.length()).trim();
        assertEquals("Producto{nombre='Pantalon', categoria=Adulto, precio=15.0, cantidad=2}", output );
    }

//    @Test
//    void crearProductoNoValido() {
//
//    }
//
//    @Test
//    void agregarProducto() {
//        Producto producto = new Producto(" ", " ", 0, 0);
//
//        assertTrue();
//    }
//
//    @Test
//    void editarProducto() {
//    }
//
//    @Test
//    void eliminarProducto() {
//    }
}