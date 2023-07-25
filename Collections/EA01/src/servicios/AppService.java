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
        razasService.fabricaRazas();
        razasService.fabricaRazas(5, "raza");
        razasService.listarRazas();
    }
}
