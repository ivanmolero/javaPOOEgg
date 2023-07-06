import entidades.AdivinaMes;
import servicios.AdivinaMesServicio;

public class Main {
    public static void main(String[] args) {
        AdivinaMes adivinaMes = new AdivinaMes();
        AdivinaMesServicio servicio = new AdivinaMesServicio();
        servicio.adivinaMes(adivinaMes);
    }
}