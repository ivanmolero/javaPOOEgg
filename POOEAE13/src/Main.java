import entidades.Curso;
import servicios.CursoServicio;
import servicios.InterfazServicio;

public class Main {
    public static void main(String[] args) {
        InterfazServicio is = new InterfazServicio();
        int op = 0;
        do {
            op = is.seleccionaOpcion(4);
            is.activaOpcion(op);
        } while(op != 4);
    }
}