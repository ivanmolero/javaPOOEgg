import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] arreglo1 = new double[50];
        double[] arreglo2;
        arregloAleatorio(arreglo1);
        Arrays.sort(arreglo1);
        arreglo2 = Arrays.copyOf(arreglo1, 20);
        Arrays.fill(arreglo2, 10, 20, 0.5);
        System.out.println(Arrays.toString(arreglo1));
        System.out.println(Arrays.toString(arreglo2));
    }

    private static void arregloAleatorio(double[] arreglo1) {
        for (int i = 0; i < arreglo1.length; i++) {
            arreglo1[i] = Math.random();
        }
    }
}