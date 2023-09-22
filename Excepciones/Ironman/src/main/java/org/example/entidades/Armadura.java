package org.example.entidades;

import java.util.ArrayList;
import java.util.List;

public class Armadura {
    private String colorPrimario;
    private String colorSecundario;
    private String resistencia;
    private Integer nivelSalud;
    private Generador generador;
    private Dispositivo botaDerecha;
    private Dispositivo botaIzquierda;
    private Dispositivo guanteDerecho;
    private Dispositivo guanteIzquierdo;
    private Dispositivo sintetizador;
    private Dispositivo consola;

    private List<Dispositivo> dispositivos;

    public Armadura() {
        this.crearDispositivos();
        this.dispositivos = new ArrayList<>();
        this.dispositivos.add(this.botaDerecha);
        this.dispositivos.add(this.botaIzquierda);
        this.dispositivos.add(this.guanteDerecho);
        this.dispositivos.add(this.guanteIzquierdo);
        this.dispositivos.add(this.sintetizador);
        this.dispositivos.add(this.consola);
    }

    public Armadura(String colorPrimario, String colorSecundario, String resistencia) {
        this();
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
        this.resistencia = resistencia;
    }

    private void crearDispositivos() {
        this.botaDerecha = new Dispositivo(3500f, false, TipoDispositivo.BOTA, "BOTA DERECHA");
        this.botaIzquierda = new Dispositivo(3500f, false, TipoDispositivo.BOTA, "BOTA IZQUIERDA");
        this.guanteDerecho = new Dispositivo(5000f, true, TipoDispositivo.GUANTE, "GUANTE DERECHO");
        this.guanteIzquierdo = new Dispositivo(5000f, true, TipoDispositivo.GUANTE, "GUANTE IZQUIERDO");
        this.sintetizador = new Dispositivo(2000f, false, TipoDispositivo.SINTETIZADOR, "SINTETIZADOR");
        this.consola = new Dispositivo(1500f, false, TipoDispositivo.CONSOLA, "CONSOLA");
    }

    public String getColorPrimario() {
        return colorPrimario;
    }

    public void setColorPrimario(String colorPrimario) {
        this.colorPrimario = colorPrimario;
    }

    public String getColorSecundario() {
        return colorSecundario;
    }

    public void setColorSecundario(String colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    public String getResistencia() {
        return resistencia;
    }

    public void setResistencia(String resistencia) {
        this.resistencia = resistencia;
    }

    public Integer getNivelSalud() {
        return nivelSalud;
    }

    public void setNivelSalud(Integer nivelSalud) {
        this.nivelSalud = nivelSalud;
    }

    public Generador getGenerador() {
        return generador;
    }

    public void setGenerador(Generador generador) {
        this.generador = generador;
    }

    public Dispositivo getBotaDerecha() {
        return botaDerecha;
    }

    public void setBotaDerecha(Dispositivo botaDerecha) {
        this.botaDerecha = botaDerecha;
    }

    public Dispositivo getBotaIzquierda() {
        return botaIzquierda;
    }

    public void setBotaIzquierda(Dispositivo botaIzquierda) {
        this.botaIzquierda = botaIzquierda;
    }

    public Dispositivo getGuanteDerecho() {
        return guanteDerecho;
    }

    public void setGuanteDerecho(Dispositivo guanteDerecho) {
        this.guanteDerecho = guanteDerecho;
    }

    public Dispositivo getGuanteIzquierdo() {
        return guanteIzquierdo;
    }

    public void setGuanteIzquierdo(Dispositivo guanteIzquierdo) {
        this.guanteIzquierdo = guanteIzquierdo;
    }

    public Dispositivo getSintetizador() {
        return sintetizador;
    }

    public void setSintetizador(Dispositivo sintetizador) {
        this.sintetizador = sintetizador;
    }

    public Dispositivo getConsola() {
        return consola;
    }

    public void setConsola(Dispositivo consola) {
        this.consola = consola;
    }

    public List<Dispositivo> getDispositivos() {
        return dispositivos;
    }

    public void caminar(Integer segundos) {
        this.generador.disminuirCarga(this.botaDerecha.usar(IntensidadUso.BASICO, segundos));
        this.generador.disminuirCarga(this.botaIzquierda.usar(IntensidadUso.BASICO, segundos));
    }

    public void correr(Integer segundos) {
        this.generador.disminuirCarga(this.botaDerecha.usar(IntensidadUso.NORMAL, segundos));
        this.generador.disminuirCarga(this.botaIzquierda.usar(IntensidadUso.NORMAL, segundos));
    }

    public void propulsarse(Integer segundos) {
        this.generador.disminuirCarga(this.botaDerecha.usar(IntensidadUso.INTENSIVO, segundos));
        this.generador.disminuirCarga(this.botaIzquierda.usar(IntensidadUso.INTENSIVO, segundos));
    }

    public void volar(Integer segundos) {
        this.propulsarse(segundos);
        this.generador.disminuirCarga(this.guanteDerecho.usar(IntensidadUso.NORMAL, segundos));
        this.generador.disminuirCarga(this.guanteIzquierdo.usar(IntensidadUso.NORMAL, segundos));
    }

    public void atacar(Integer segundos) {
        this.generador.disminuirCarga(this.guanteDerecho.usar(IntensidadUso.INTENSIVO, segundos));
        this.generador.disminuirCarga(this.guanteIzquierdo.usar(IntensidadUso.INTENSIVO, segundos));
    }

    public void escribir() {
        this.generador.disminuirCarga(this.consola.usar(IntensidadUso.BASICO, 1));
    }

    public void hablar(Integer segundos) {
        this.generador.disminuirCarga(this.sintetizador.usar(IntensidadUso.BASICO, segundos));
    }

    @Override
    public String toString() {
        String salida = String.format("""
            ARMADURA: MARK I
                Color Primario: %s
                Color Secundario: %s
                Resistencia: %s
            ----------------------------------------
            """.stripIndent(), this.colorPrimario, this.colorSecundario, this.resistencia);
        for (Dispositivo dispositivo : this.dispositivos) {
            salida += dispositivo.toString();
        }
        return salida;
    }
}
