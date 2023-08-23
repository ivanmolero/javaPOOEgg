package entidades;

public class Boleto {
    private AgendaPelicula paraExhibicion;
    private Espectador perteneceEspectador;
    private Asiento ocupaAsiento;

    public Boleto() {
    }

    public Boleto(AgendaPelicula paraExhibicion, Espectador perteneceEspectador, Asiento ocupaAsiento) {
        this.paraExhibicion = paraExhibicion;
        this.perteneceEspectador = perteneceEspectador;
        this.ocupaAsiento = ocupaAsiento;
    }

    public AgendaPelicula getParaExhibicion() {
        return paraExhibicion;
    }

    public void setParaExhibicion(AgendaPelicula paraExhibicion) {
        this.paraExhibicion = paraExhibicion;
    }

    public Espectador getPerteneceEspectador() {
        return perteneceEspectador;
    }

    public void setPerteneceEspectador(Espectador perteneceEspectador) {
        this.perteneceEspectador = perteneceEspectador;
    }

    public Asiento getOcupaAsiento() {
        return ocupaAsiento;
    }

    public void setOcupaAsiento(Asiento ocupaAsiento) {
        this.ocupaAsiento = ocupaAsiento;
    }

    @Override
    public String toString() {
        return "Boleto{" +
                "paraExhibicion=" + paraExhibicion +
                ", perteneceEspectador=" + perteneceEspectador +
                ", ocupaAsiento=" + ocupaAsiento +
                '}';
    }
}
