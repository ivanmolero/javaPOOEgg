package servicios;

import entidades.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    List<Task> tareas = new ArrayList<>();
    public void agregarTarea(Task tarea) {
        tareas.add(tarea);
    }

    public void eliminarTarea(Task tarea) {
        tareas.remove(tarea);
    }

    public List<Task> listarTareas() {
        return tareas;
    }
}
