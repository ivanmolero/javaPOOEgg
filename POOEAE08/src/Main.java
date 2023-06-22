import entidades.Cadena;
import servicios.CadenaServicio;

public class Main {
    public static void main(String[] args) {
        CadenaServicio cs = new CadenaServicio();
        Cadena cadena = cs.crearCadena();

        System.out.println("la frase tiene un total de " + cs.mostrarVocales(cadena) + " vocales");
        System.out.println("la frase invertida es: " + cs.invertirFrase(cadena));
        System.out.println("el caracter aparece " + cs.contabilizarCaracter(cadena) + " veces");
        cs.compararLongitud(cadena);
        cs.unirFrases(cadena);
        cs.reemplazar(cadena);
        System.out.println("el caracter está en la frase? " + cs.contiene(cadena));
    }
}