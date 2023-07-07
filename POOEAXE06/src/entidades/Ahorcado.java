package entidades;

public class Ahorcado {
    private String[] arregloPalabra;
    private String palabraBuscar;
    private int letrasEncontradas;
    private String[] avancePalabra;
    private int cantidadJugadasMax;
    private int cantidadJugadasActual;

    public Ahorcado() {
    }

    public Ahorcado(String[] arregloPalabra, String palabraBuscar, int letrasEncontradas, String[] avancePalabra, int cantidadJugadasMax, int cantidadJugadasActual) {
        this.arregloPalabra = arregloPalabra;
        this.palabraBuscar = palabraBuscar;
        this.letrasEncontradas = letrasEncontradas;
        this.avancePalabra = avancePalabra;
        this.cantidadJugadasMax = cantidadJugadasMax;
        this.cantidadJugadasActual = cantidadJugadasActual;
    }

    public String[] getArregloPalabra() {
        return arregloPalabra;
    }

    public void setArregloPalabra(String[] arregloPalabra) {
        this.arregloPalabra = arregloPalabra;
    }

    public String getPalabraBuscar() {
        return palabraBuscar;
    }

    public void setPalabraBuscar(String palabraBuscar) {
        this.palabraBuscar = palabraBuscar;
        arregloPalabra = new String[palabraBuscar.length()];
        avancePalabra = new String[palabraBuscar.length()];
        letrasEncontradas = 0;
        for (int i = 0; i < palabraBuscar.length(); i++) {
            arregloPalabra[i] = palabraBuscar.substring(i, i + 1);
            avancePalabra[i] = "_";
        }
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getCantidadJugadasMax() {
        return cantidadJugadasMax;
    }

    public void setCantidadJugadasMax(int cantidadJugadasMax) {
        this.cantidadJugadasMax = cantidadJugadasMax;
        this.cantidadJugadasActual = 0;
    }

    public int getCantidadJugadasActual() {
        return cantidadJugadasActual;
    }

    public void setCantidadJugadasActual(int cantidadJugadasActual) {
        this.cantidadJugadasActual = cantidadJugadasActual;
    }

    public String[] getAvancePalabra() {
        return avancePalabra;
    }

    public void setAvancePalabra(String[] avancePalabra) {
        this.avancePalabra = avancePalabra;
    }
}
