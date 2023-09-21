package org.example.entidades;

public class Dispositivo {
    private Float consumoEnergia;
    private Boolean estaDaniado;
    private Boolean esArma;
    private TipoDispositivo tipoDispositivo;
    private Boolean estaDestruido;
    private String nombre;

    public Dispositivo() {
        this.estaDaniado = false;
        this.estaDestruido = false;
    }

    public Dispositivo(Float consumoEnergia, Boolean esArma, TipoDispositivo tipoDispositivo, String nombre) {
        this();
        this.consumoEnergia = consumoEnergia;
        this.esArma = esArma;
        this.tipoDispositivo = tipoDispositivo;
        this.nombre = nombre;
    }

    public Float getConsumoEnergia() {
        return consumoEnergia;
    }

    public void setConsumoEnergia(Float consumoEnergia) {
        this.consumoEnergia = consumoEnergia;
    }

    public Boolean getEstaDaniado() {
        return estaDaniado;
    }

    public void setEstaDaniado(Boolean estaDaniado) {
        this.estaDaniado = estaDaniado;
    }

    public Boolean getEsArma() {
        return esArma;
    }

    public void setEsArma(Boolean esArma) {
        this.esArma = esArma;
    }

    public TipoDispositivo getTipoDispositivo() {
        return tipoDispositivo;
    }

    public void setTipoDispositivo(TipoDispositivo tipoDispositivo) {
        this.tipoDispositivo = tipoDispositivo;
    }

    public Boolean getEstaDestruido() {
        return estaDestruido;
    }

    public void setEstaDestruido(Boolean estaDestruido) {
        this.estaDestruido = estaDestruido;
    }
    public Float usar(IntensidadUso intensidadUso, Integer tiempo) {
        this.sufriendoDanios();
        return intensidadUso.getMultiplicador() * tiempo * this.consumoEnergia;
    }

    public void sufriendoDanios() {
        this.estaDaniado = Math.random() <= 0.3;
    }

    public void reparar() {
        this.estaDaniado = Math.random() <= 0.6;
        if (this.estaDaniado) this.destruir();
    }

    public void destruir() {
        this.estaDestruido = Math.random() <= 0.3;
    }

    @Override
    public String toString() {
        return String.format("""
                NOMBRE: %s
                    Consumo de Energia: %s joules
                    Daño: %s
                    Arma: %s
                    Destruido: %s
                    Tipo de Dispositivo: %s
                """.stripIndent(), nombre, consumoEnergia, estaDaniado, esArma, estaDestruido, tipoDispositivo);
    }
}
