import entidades.Matematica;
import servicios.MatematicaServicio;

public class Main {
    public static void main(String[] args) {
        Matematica matematica = new Matematica();
        MatematicaServicio ms = new MatematicaServicio();
        System.out.println(matematica.toString());

        System.out.println("el mayor es: " + ms.devolverMayor(matematica));
        System.out.println("la potencia es: " + ms.calcularPotencia(matematica));
        System.out.println("la raiz es: " + ms.calculaRaiz(matematica));
    }
}