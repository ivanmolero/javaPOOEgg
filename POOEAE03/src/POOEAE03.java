import entidades.Operacion;
import servicios.OperacionServicio;

public class POOEAE03 {
    public static void main(String[] args) {
        OperacionServicio os = new OperacionServicio();
        Operacion op01 = os.crearOperacion();
        Operacion op02 = os.crearOperacion();

        System.out.println("primer objeto");

        System.out.println(os.sumar(op01));
        System.out.println(os.restar(op01));
        System.out.println(os.multiplicar(op01));
        System.out.println(os.dividir(op01));

        System.out.println("segundo objeto");

        System.out.println(os.sumar(op02));
        System.out.println(os.restar(op02));
        System.out.println(os.multiplicar(op02));
        System.out.println(os.dividir(op02));
    }
}
