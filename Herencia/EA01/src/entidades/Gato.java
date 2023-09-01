package entidades;

public class Gato extends Animal{
    public Gato(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void hacerRuido() {
        System.out.println("maullar");
    }
}
