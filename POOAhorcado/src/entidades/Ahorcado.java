package entidades;

public class Ahorcado {
    String[] vectorPalabra;
    String[] vectorAvance; // _a_a__a
    String palabra;
    int letrasEncontradas;
    int jugadasMaximas;
    int jugadasRealizadas;

    public Ahorcado() {
    }

    public Ahorcado(String[] vectorPalabra, String[] vectorAvance, String palabra, int letrasEncontradas, int jugadasMaximas, int jugadasRealizadas) {
        this.vectorPalabra = vectorPalabra;
        this.vectorAvance = vectorAvance;
        this.palabra = palabra;
        this.letrasEncontradas = letrasEncontradas;
        this.jugadasMaximas = jugadasMaximas;
        this.jugadasRealizadas = jugadasRealizadas;
    }

    public String[] getVectorPalabra() {
        return vectorPalabra;
    }

    public void setVectorPalabra(String[] vectorPalabra) {
        this.vectorPalabra = vectorPalabra;
    }

    public String[] getVectorAvance() {
        return vectorAvance;
    }

    public void setVectorAvance(String[] vectorAvance) {
        this.vectorAvance = vectorAvance;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
        vectorPalabra = new String[palabra.length()];
        vectorAvance = new String[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            vectorPalabra[i] = palabra.substring(i, i + 1);
            vectorAvance[i] = "_";
        }
        letrasEncontradas = 0;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getJugadasMaximas() {
        return jugadasMaximas;
    }

    public void setJugadasMaximas(int jugadasMaximas) {
        this.jugadasMaximas = jugadasMaximas;
        this.jugadasRealizadas = 0;
    }

    public int getJugadasRealizadas() {
        return jugadasRealizadas;
    }

    public void setJugadasRealizadas(int jugadasRealizadas) {
        this.jugadasRealizadas = jugadasRealizadas;
    }
}
