package entidades;

public class Televisor extends Electrodomestico{
    private Integer resolucion;
    private Boolean sintonizadorTDT;

    public Televisor() {
        super();
    }

    public Televisor(String color, Character consumoEnergetico, Integer peso, Integer resolucion, Boolean sintonizadorTDT) {
        super(color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }

    public Boolean getSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(Boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    @Override
    public Integer precioFinal() {
        Integer incremento = 0;
        if (this.resolucion > 40) incremento = (int) (super.precioFinal() * 1.3);
        if (this.sintonizadorTDT) incremento += 500;
        return super.precioFinal() + incremento;
    }
}
