package org.example.entidades;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class PersonaTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("pruebas de estructura de herencia")
    void pruebasDeEstructuraDeHerencia() {

        assertAll(
                "pruebas para verificar la estructura de herencia de la aplicacion",
                () -> assertInstanceOf(Empleado.class, new Profesor()),
                () -> assertInstanceOf(Persona.class, new Profesor()),
                () -> assertInstanceOf(Empleado.class, new Servicio()),
                () -> assertInstanceOf(Persona.class, new Servicio()),
                () -> assertInstanceOf(Persona.class, new Estudiante())
        );
    }

    @Test
    @DisplayName("pruebas de cambio de estado civil")
    void pruebasDeCambioDeEstadoCivil() {
        Profesor profesor = new Profesor();
        profesor.setEstadoCivil(EstadoCivil.SOLTERO);
        Servicio servicio = new Servicio();
        servicio.setEstadoCivil(EstadoCivil.CASADO);
        Estudiante estudiante = new Estudiante();
        estudiante.setEstadoCivil(EstadoCivil.CASADO);
        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream("2\n".getBytes()));

        profesor.cambioEstadoCivil();

        System.setIn(stdin);

        System.setIn(new ByteArrayInputStream("4\n".getBytes()));

        servicio.cambioEstadoCivil();

        System.setIn(stdin);

        System.setIn(new ByteArrayInputStream("3\n".getBytes()));

        estudiante.cambioEstadoCivil();

        System.setIn(stdin);

        assertAll(
                "pruebas para validar el cambio de estado civil de una persona",
                () -> assertEquals(EstadoCivil.CASADO, profesor.getEstadoCivil()),
                () -> assertEquals(EstadoCivil.DIVORCIADO, servicio.getEstadoCivil()),
                () -> assertEquals(EstadoCivil.VIUDO, estudiante.getEstadoCivil())
        );
    }

    @Test
    @DisplayName("pruebas de cambio de despacho")
    void pruebasDeCambioDeDespacho() {
        Profesor profesor = new Profesor();
        profesor.setDespacho(1);
        Servicio servicio = new Servicio();
        servicio.setDespacho(1);

        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream("5\n".getBytes()));

        profesor.reasignaDespacho();

        System.setIn(stdin);

        System.setIn(new ByteArrayInputStream("5\n".getBytes()));

        servicio.reasignaDespacho();

        System.setIn(stdin);

        assertAll(
                "pruebas para validar el cambio de despacho en empleados",
                () -> assertEquals(5, profesor.getDespacho()),
                () -> assertEquals(5, servicio.getDespacho())
        );
    }

    @Test
    @DisplayName("prueba de matricular estudiante en nuevo curso")
    void pruebaDeMatricularEstudianteEnNuevoCurso() {
        Estudiante estudiante = new Estudiante();
        estudiante.setCurso("Calculo I");

        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream("Calculo II\n".getBytes()));

        estudiante.matricularEstudiante();

        System.setIn(stdin);

        assertAll(
                "pruebas para validar la matricula en un nuevo curso de un estudiante",
                () -> assertEquals("Calculo II", estudiante.getCurso())
        );
    }

    @Test
    @DisplayName("prueba de cambio de departamento de un profesor")
    void pruebaDeCambioDeDepartamentoDeUnProfesor() {
        Profesor profesor = new Profesor();
        profesor.setDepartamento("Matematicas");

        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream("Lengua\n".getBytes()));

        profesor.cambioDepartamento();

        System.setIn(stdin);

        assertAll(
                "prueba de validación de cambio de departamento de un profesor",
                () -> assertEquals("Lengua", profesor.getDepartamento())
        );
    }

    @Test
    @DisplayName("prueba de traslado de seccion de un personal de servicio")
    void pruebaDeTrasladoDeSeccionDeUnPersonalDeServicio() {
        Servicio servicio = new Servicio();
        servicio.setSeccion("biblioteca");

        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream("Decanato\n".getBytes()));

        servicio.trasladoSeccion();

        System.setIn(stdin);

        assertAll(
                "prueba de validación de un traslado de sección de un personal de servicio",
                () -> assertEquals("Decanato", servicio.getSeccion())
        );
    }
}