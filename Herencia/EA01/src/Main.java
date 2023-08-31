import entidades.Animal;
import entidades.Caballo;
import entidades.Gato;
import entidades.Perro;

public class Main {
    public static void main(String[] args) {
        //Declaracion de objeto perro
        Animal perro1 = new Perro("Stich", "carnivoro", 15, "Doberman");
        perro1.alimentarse();
        ((Perro) perro1).caminar();

        //Declaracion de otro objeto perro
        Animal perro2 = new Perro("Teddy", "croquetas", 10, "Chihuahua");
        perro2.alimentarse();

        //Declaracion del objeto gato
        Animal gato = new Gato("Pelusa", "galletas", 15, "Siames");
        gato.alimentarse();

        //Declaracion de objeto caballo
        Animal caballo = new Caballo("Spark", "pasto", 25, "Fino");
        caballo.alimentarse();
    }
}