package entidades;

public class Perro extends Animal{
    public Perro(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void alimentarse() {
        super.alimentarse();
        System.out.printf("soy un perro que se alimenta de: %s\n", this.alimento);
    }

    @Override
    public void hacerRuido() {
        System.out.println("ladrar");
    }

    public void caminar() {
        System.out.println("soy un perro y salgo al parque");
    }
}
