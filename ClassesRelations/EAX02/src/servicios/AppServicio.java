package servicios;

import entidades.Cine;

public class AppServicio {
    public void iniciar() {
        CineServicio cineServicio = new CineServicio(new Cine("Cinematron"));
        cineServicio.crearSalas(2);
        System.out.println(cineServicio.getCine());
        cineServicio.crearAgendaPeliculas();
        cineServicio.mostrarRegistroPeliculas();
    }
}
