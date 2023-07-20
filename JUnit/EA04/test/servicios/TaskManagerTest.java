package servicios;

import entidades.Task;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TaskManagerTest {
    TaskManager tm;
    @BeforeEach
    void setUp() {
        tm = new TaskManager();
    }

    @Test
    void agregarTarea() {
        int size = tm.listarTareas().size();
        Task task = new Task("tarea 01", "detalle");
        tm.agregarTarea(task);
        assertEquals(size + 1, tm.listarTareas().size());
        assertTrue(tm.listarTareas().contains(task));
    }

    @Test
    void eliminarTarea() {
        Task task = new Task("tarea 02", "detalle");
        tm.agregarTarea(task);
        int size = tm.listarTareas().size();
        tm.eliminarTarea(task);
        assertEquals(size - 1, tm.listarTareas().size());
        assertFalse(tm.listarTareas().contains(task));
    }

    @Test
    void listarTareas() {
        assertNotNull(tm.listarTareas());
    }
}