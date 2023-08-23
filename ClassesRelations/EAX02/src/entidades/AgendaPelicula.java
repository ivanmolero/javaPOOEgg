package entidades;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class AgendaPelicula {
    private LocalDateTime horaInicio;
    private LocalDateTime horaFin;
    private Double precioAsiento;
    private Sala ocupaSala;
    private Pelicula exhibePelicula;
    private List<Boleto> tieneBoletos;

    public AgendaPelicula() {
    }

    public AgendaPelicula(LocalDateTime horaInicio, LocalDateTime horaFin, Double precioAsiento, Sala ocupaSala, Pelicula exhibePelicula) {
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.precioAsiento = precioAsiento;
        this.ocupaSala = ocupaSala;
        this.exhibePelicula = exhibePelicula;
    }

    public LocalDateTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalDateTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalDateTime getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(LocalDateTime horaFin) {
        this.horaFin = horaFin;
    }

    public Double getPrecioAsiento() {
        return precioAsiento;
    }

    public void setPrecioAsiento(Double precioAsiento) {
        this.precioAsiento = precioAsiento;
    }

    public Sala getOcupaSala() {
        return ocupaSala;
    }

    public void setOcupaSala(Sala ocupaSala) {
        this.ocupaSala = ocupaSala;
    }

    public Pelicula getExhibePelicula() {
        return exhibePelicula;
    }

    public void setExhibePelicula(Pelicula exhibePelicula) {
        this.exhibePelicula = exhibePelicula;
    }

    public List<Boleto> getTieneBoletos() {
        if (this.tieneBoletos == null) this.tieneBoletos = new ArrayList<>();
        return tieneBoletos;
    }

    public void setTieneBoletos(List<Boleto> tieneBoletos) {
        this.tieneBoletos = tieneBoletos;
    }

    @Override
    public String toString() {
        return "AgendaPelicula{" +
                "horaInicio=" + horaInicio +
                ", horaFin=" + horaFin +
                ", precioAsiento=" + precioAsiento +
                ", ocupaSala=" + ocupaSala +
                ", exhibePelicula=" + exhibePelicula +
                ", tieneBoletos=" + this.getTieneBoletos().size() +
                '}';
    }
}
