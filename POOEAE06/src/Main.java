import entidades.Cafetera;
import servicios.CafeteraServicio;
import servicios.MenuServicio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CafeteraServicio cs = new CafeteraServicio();
        MenuServicio ms = new MenuServicio();
        Cafetera[] cafeteras = ms.crearCafeteras(cs);
        int op = 1;
        Cafetera cafSel = null;
        do {
            if (op == 1) {
                cafSel = ms.seleccionaCafetera(cafeteras);
            }
            op = ms.seleccionaOpcionMenu();
            if (op != 1) {
                ms.ejecutaOpcion(cs, cafSel, op);
            }
        } while(op != 7);
    }

}