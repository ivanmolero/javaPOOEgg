package entidades;

public class Revolver {
    private Integer posicionActual;
    private Integer posicionAgua;
    private Integer tamanioTambor;

    public Revolver() {
        this.posicionActual = 0;
        this.posicionAgua = 0;
    }

    public Revolver(Integer tamanioTambor) {
        this();
        this.tamanioTambor = tamanioTambor;
    }

    public Integer getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(Integer posicionActual) {
        this.posicionActual = posicionActual;
    }

    public Integer getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(Integer posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    public Integer getTamanioTambor() {
        return tamanioTambor;
    }

    public void setTamanioTambor(Integer tamanioTambor) {
        this.tamanioTambor = tamanioTambor;
    }

    public void llenarRevolver() {
        this.posicionActual = (int) (Math.random() * this.tamanioTambor) + 1;
        this.posicionAgua = (int) (Math.random() * this.tamanioTambor) + 1;
    }

    public Boolean mojar() {
        return this.posicionAgua.equals(this.posicionActual);
    }

    public void siguienteChorro() {
        this.posicionActual++;
        if (this.posicionActual.equals(this.tamanioTambor + 1)) this.posicionActual = 1;
    }

    @Override
    public String toString() {
        return "Revolver{" +
                "posicionActual=" + posicionActual +
                ", posicionAgua=" + posicionAgua +
                ", tamanioTambor=" + tamanioTambor +
                '}';
    }
}
