import com.sun.security.jgss.GSSUtil;
import entidades.Cuenta;
import servicios.CuentaServicio;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        CuentaServicio cs = new CuentaServicio();
        List<Cuenta> cuentas = new ArrayList<>();
        System.out.println("ingrese cuantas cuentas desea ingresar: ");
        int numeroCuentas = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < numeroCuentas; i++){
            cuentas.add(cs.crearCuenta());
        }
        int op = 6;
        Cuenta ctaSel = null;
        do {
            if (op == 6) {
                ctaSel = seleccionaCuenta(cuentas);
            }
            op = seleccionaServicio();
            if (op != 7 && op != 6) {
                brindarServicio(ctaSel, cs, op);
            }
        } while(op != 7);
    }

    private static void brindarServicio(Cuenta cuenta, CuentaServicio cs, int op) {
        switch (op) {
            case 1:
                cs.consultarDatos(cuenta);
                break;
            case 2:
                cs.consultarSaldo(cuenta);
                break;
            case 3:
                System.out.println("ingrese la cantidad a depositar: ");
                int ingreso = Integer.parseInt(scan.nextLine());
                cs.ingresar(cuenta, ingreso);
                break;
            case 4:
                System.out.println("ingrese la cantidad a retirar: ");
                int retiro = Integer.parseInt(scan.nextLine());
                cs.retirar(cuenta, retiro);
                break;
            case 5:
                System.out.println("ingrese la cantidad para extracción rápida: ");
                int extraccion = Integer.parseInt(scan.nextLine());
                cs.extraccionRapida(cuenta, extraccion);
                break;
            default:
                System.out.println("ingrese una selección válida");
        }
    }

    private static int seleccionaServicio() {
        int op = 0;
        do {
            System.out.println("MENU OPERACIONES");
            System.out.println("1. DATOS CUENTA");
            System.out.println("2. CONSULTA SALDO");
            System.out.println("3. DEPOSITO");
            System.out.println("4. RETIRO");
            System.out.println("5. EXTRACCIÓN RÁPIDA");
            System.out.println("6. CAMBIAR CUENTA");
            System.out.println("7. SALIR");
            System.out.println("seleccione una opción:");
            op = Integer.parseInt(scan.nextLine());
            if (op < 0 || op > 7) {
                System.out.println("ingrese una opción válida");
            }
        } while(op < 0 || op > 7);
        return op;
    }

    private static Cuenta seleccionaCuenta(List<Cuenta> cuentas) {
        int op = -1;
        do {
            for (int i = 0; i < cuentas.size(); i++) {
                System.out.println(i + ". " + cuentas.get(i).getNumeroCuenta() +
                        " - " + cuentas.get(i).getSaldo());
            }
            System.out.println("seleccione una cuenta:");
            op = Integer.parseInt(scan.nextLine());
        } while(op < 0 || op >= cuentas.size());
        return cuentas.get(op);
    }
}