package org.example.entidades;

import org.example.servicios.AlojamientoServicio;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AlojamientoTest {
    Alojamiento alojamiento = new Alojamiento();
    Hotel hotel = new Hotel();
    Hotel4E hotel4E1 = new Hotel4E();
    Hotel4E hotel4E2 = new Hotel4E();
    Hotel4E hotel4E3 = new Hotel4E();
    Hotel4E hotel4E4 = new Hotel4E();
    Hotel5E hotel5E = new Hotel5E();
    AlojamientoExtrahotelero alojamientoExtrahotelero = new AlojamientoExtrahotelero();
    Camping camping1 = new Camping();
    Camping camping2 = new Camping();
    Camping camping3 = new Camping();
    Camping camping4 = new Camping();
    Residencia residencia1 = new Residencia();
    Residencia residencia2 = new Residencia();
    Residencia residencia3 = new Residencia();
    Residencia residencia4 = new Residencia();
    List<Alojamiento> alojamientos = new ArrayList<>();
    @BeforeEach
    void setUp() {
        hotel.setNombre("hotel 1");
        hotel.setCantidadHabitaciones(30);
        hotel.setNumeroCamas(2);

        hotel4E1.setNombre("hotel 4 - 1");
        hotel4E1.setCantidadHabitaciones(30);
        hotel4E1.setNumeroCamas(2);
        hotel4E1.setCapacidadRestaurante(29);
        hotel4E1.setGimnasio('B');

        hotel4E2.setNombre("hotel 4 - 2");
        hotel4E2.setCantidadHabitaciones(30);
        hotel4E2.setNumeroCamas(2);
        hotel4E2.setCapacidadRestaurante(30);
        hotel4E2.setGimnasio('B');

        hotel4E3.setNombre("hotel 4 - 3");
        hotel4E3.setCantidadHabitaciones(30);
        hotel4E3.setNumeroCamas(2);
        hotel4E3.setCapacidadRestaurante(50);
        hotel4E3.setGimnasio('A');

        hotel4E1.setNombre("hotel 4 - 4");
        hotel4E4.setCantidadHabitaciones(30);
        hotel4E4.setNumeroCamas(2);
        hotel4E4.setCapacidadRestaurante(51);
        hotel4E4.setGimnasio('A');

        hotel5E.setNombre("hotel 5 - 1");
        hotel5E.setCantidadHabitaciones(30);
        hotel5E.setNumeroCamas(2);
        hotel5E.setCapacidadRestaurante(51);
        hotel5E.setGimnasio('A');
        hotel5E.setLimosinas(3);

        this.alojamientos.add(hotel);
        this.alojamientos.add(hotel4E1);
        this.alojamientos.add(hotel4E2);
        this.alojamientos.add(hotel4E3);
        this.alojamientos.add(hotel4E4);
        this.alojamientos.add(hotel5E);

        this.camping1.setNombre("camping 1");
        this.camping1.setTieneRestaurante(false);
        this.camping2.setNombre("camping 2");
        this.camping2.setTieneRestaurante(true);
        this.camping3.setNombre("camping 3");
        this.camping3.setTieneRestaurante(false);
        this.camping4.setNombre("camping 4");
        this.camping4.setTieneRestaurante(true);
        this.alojamientos.add(camping1);
        this.alojamientos.add(camping2);
        this.alojamientos.add(camping3);
        this.alojamientos.add(camping4);

        this.residencia1.setNombre("residencia 1");
        this.residencia1.setDescuentoGremio(true);
        this.residencia2.setNombre("residencia 2");
        this.residencia2.setDescuentoGremio(false);
        this.residencia3.setNombre("residencia 3");
        this.residencia3.setDescuentoGremio(true);
        this.residencia4.setNombre("residencia 4");
        this.residencia4.setDescuentoGremio(false);
        this.alojamientos.add(residencia1);
        this.alojamientos.add(residencia2);
        this.alojamientos.add(residencia3);
        this.alojamientos.add(residencia4);

        Collections.shuffle(this.alojamientos);

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void pruebaEstructura() {

        assertAll(
                "pruebas de estructura de herencia",
                () -> assertTrue(alojamiento instanceof Alojamiento),
                () -> assertTrue(hotel instanceof Alojamiento),
                () -> assertTrue(hotel4E1 instanceof Hotel),
                () -> assertTrue(hotel5E instanceof Hotel4E),
                () -> assertTrue(alojamientoExtrahotelero instanceof Alojamiento),
                () -> assertTrue(camping1 instanceof AlojamientoExtrahotelero),
                () -> assertTrue(residencia1 instanceof AlojamientoExtrahotelero)
        );
    }

    @Test
    void pruebaPrecioHabitacion() {
        assertAll(
                "pruebas de precio de habitaciones",
                () -> assertEquals(110, hotel.getPrecioHabitacion()),
                () -> assertEquals(150, hotel4E1.getPrecioHabitacion()),
                () -> assertEquals(170, hotel4E2.getPrecioHabitacion()),
                () -> assertEquals(190, hotel4E3.getPrecioHabitacion()),
                () -> assertEquals(210, hotel4E4.getPrecioHabitacion()),
                () -> assertEquals(255, hotel5E.getPrecioHabitacion())
        );
    }

    @Test
    void pruebaListadosVarios() {
        AlojamientoServicio alojamientoServicio = new AlojamientoServicio();
        List<Alojamiento> hoteles = alojamientoServicio.listaHotelesOrdenada(this.alojamientos);
        List<Alojamiento> campingRestaurante = alojamientoServicio.listaCampingRestaurante(this.alojamientos);
        List<Alojamiento> residenciaDescuento = alojamientoServicio.listaResidenciaDescuento(this.alojamientos);

        assertAll(
                "pruebas de diferentes tipos de listas",
                () -> assertEquals(14, this.alojamientos.size()),
                () -> assertEquals(6, hoteles.size()),
                () -> assertEquals(110, ((Hotel) hoteles.get(5)).getPrecioHabitacion()),
                () -> assertEquals(150, ((Hotel) hoteles.get(4)).getPrecioHabitacion()),
                () -> assertEquals(170, ((Hotel) hoteles.get(3)).getPrecioHabitacion()),
                () -> assertEquals(190, ((Hotel) hoteles.get(2)).getPrecioHabitacion()),
                () -> assertEquals(210, ((Hotel) hoteles.get(1)).getPrecioHabitacion()),
                () -> assertEquals(255, ((Hotel) hoteles.get(0)).getPrecioHabitacion()),
                () -> assertEquals(2, campingRestaurante.size()),
                () -> assertTrue(((Camping)campingRestaurante.get(0)).getTieneRestaurante()),
                () -> assertTrue(((Camping)campingRestaurante.get(1)).getTieneRestaurante()),
                () -> assertEquals(2, residenciaDescuento.size()),
                () -> assertTrue(((Residencia)residenciaDescuento.get(0)).getDescuentoGremio()),
                () -> assertTrue(((Residencia)residenciaDescuento.get(1)).getDescuentoGremio())
        );
    }
}