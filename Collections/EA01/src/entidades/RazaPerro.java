package entidades;

public class RazaPerro {
    String nombreRaza;

    public RazaPerro() {
    }

    public RazaPerro(String nombreRaza) {
        this.nombreRaza = nombreRaza;
    }

    public String getNombreRaza() {
        return nombreRaza;
    }

    public void setNombreRaza(String nombreRaza) {
        this.nombreRaza = nombreRaza;
    }

    @Override
    public String toString() {
        return "RazaPerro{" +
                "nombreRaza='" + nombreRaza + '\'' +
                '}';
    }
}
