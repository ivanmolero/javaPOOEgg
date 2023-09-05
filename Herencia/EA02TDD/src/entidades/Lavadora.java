package entidades;

public class Lavadora extends Electrodomestico{
    private Integer carga;

    public Lavadora() {
        super();
    }

    public Lavadora(String color, Character consumoEnergetico, Integer peso, Integer carga) {
        super(color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    @Override
    public Integer precioFinal() {
        Integer incremento = 0;
        if (this.carga > 30) incremento = 500;
        return super.precioFinal() + incremento;
    }
}
