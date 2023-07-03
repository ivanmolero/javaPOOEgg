import entidades.Vehiculo;

public class Main {
    public static void main(String[] args) {
        Vehiculo[] vehiculos = new Vehiculo[3];
        vehiculos[0] = new Vehiculo("Toyota", "Corolla", 2023, "automovil");
        vehiculos[1] = new Vehiculo("Honda", "X85", 2018, "motocicleta");
        vehiculos[2] = new Vehiculo("Best", "A01", 2020, "bicicleta");

        int[] tiempos = {5,10,60,300};
        for (int i = 0; i < 3; i++) {
            System.out.println("tiempo de recorrido: " + tiempos[i] + " segundos:");
            for (int j = 0; j < 3; j++) {
                vehiculos[j].moverse(tiempos[i]);
                System.out.println("vehiculo " + (j + 1) + " recorre: " + vehiculos[j].getDesplazamiento());
            }
            System.out.println();
        }
        int maxdes = 0, pos = 0;
        for (int i = 0; i < 3; i++) {
            vehiculos[i].moverse(tiempos[3]);
            vehiculos[i].frenar();
            if (vehiculos[i].getDesplazamiento() > maxdes) {
                maxdes = vehiculos[i].getDesplazamiento();
                pos = i;
            }
        }
        System.out.println("a los 5 minutos el mayor desplazamiento fue del vehiculo " + (pos + 1) + ", se desplaza " + vehiculos[pos].getDesplazamiento() + " m.");
    }
}