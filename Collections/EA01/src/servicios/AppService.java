package servicios;

import java.util.Scanner;

public class AppService {
    RazasService razasService;
    Scanner scan;
    public AppService() {
        this.razasService = new RazasService();
        this.scan = new Scanner(System.in);
    }

    /**
     * punto de entrada desde el método main
     */
    public void iniciar() {
        this.razasService.fabricaRazas();
        this.razasService.fabricaRazas(2, "raza");
        this.razasService.fabricaRazas(2, "raza");
        this.razasService.listarRazas();
        this.razasService.eliminarRaza();
        this.razasService.eliminarRaza();
    }
}
