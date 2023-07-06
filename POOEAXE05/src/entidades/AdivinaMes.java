package entidades;

public class AdivinaMes {
    static final String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio",
            "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
    private String mesSecreto;

    public AdivinaMes() {
        int posicion = (int) (Math.random() * 120) % 12;
        mesSecreto = meses[posicion];
    }

    public AdivinaMes(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

}
