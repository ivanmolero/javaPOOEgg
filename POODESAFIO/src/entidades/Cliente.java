package entidades;

public class Cliente {
    private int id;
    private String nombre;
    private double peso;
    private int edad;
    private double altura;
    private String objetivo;
    private static int generador = 0;

    public Cliente() {
        generador++;
        id = generador;
    }

    public Cliente(String nombre, double peso, int edad, double altura, String objetivo) {
        this();
        this.nombre = nombre;
        this.peso = peso;
        this.edad = edad;
        this.altura = altura;
        this.objetivo = objetivo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    @Override
    public String toString() {
        return "Cliente {" +
                "\n\tid = " + id +
                "\n\tnombre = '" + nombre + '\'' +
                "\n\tpeso = " + peso +
                "\n\tedad = " + edad +
                "\n\taltura = " + altura +
                "\n\tobjetivo='" + objetivo + '\'' +
                "\n\t}";
    }
}
