import servicios.RefugioPerros;

public class Main {
    public static void main(String[] args) {
        RefugioPerros refugioPerros = new RefugioPerros();
        refugioPerros.listarPersonas();
        refugioPerros.listarPerros();
        refugioPerros.adoptar();
        refugioPerros.listarPersonas();
    }
}