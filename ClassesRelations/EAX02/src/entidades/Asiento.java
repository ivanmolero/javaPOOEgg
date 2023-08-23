package entidades;

public class Asiento {
    private Integer fila;
    private Character columna;
    private Boolean estaOcupado;

    public Asiento() {
        this.estaOcupado = false;
    }

    public Asiento(Integer fila, Character columna) {
        this();
        this.fila = fila;
        this.columna = columna;
    }

    public Integer getFila() {
        return fila;
    }

    public void setFila(Integer fila) {
        this.fila = fila;
    }

    public Character getColumna() {
        return columna;
    }

    public void setColumna(Character columna) {
        this.columna = columna;
    }

    public Boolean getEstaOcupado() {
        return estaOcupado;
    }

    public void setEstaOcupado(Boolean estaOcupado) {
        this.estaOcupado = estaOcupado;
    }

    @Override
    public String toString() {
        // Operador ternario, es un if que evalua this.estaOcupado, si es true "X", sino " "
        String ocupado = (this.estaOcupado) ? "X" : " ";
        return this.fila.toString() + this.columna.toString() + ocupado;
    }
}
