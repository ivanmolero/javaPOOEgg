import servicios.InterfazServicio;

public class Main {
    public static void main(String[] args) {
        InterfazServicio is = new InterfazServicio();
        int op = 0;
        int[] limite = new int[1];
        do {
            op = is.seleccionaOpcion(limite);
            is.activaOpcion(op);
        } while(op != limite[0]);
    }
}