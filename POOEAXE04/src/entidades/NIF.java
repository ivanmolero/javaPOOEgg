package entidades;

import java.text.ParseException;
import java.util.EmptyStackException;

public class NIF {
    public String dni;
    public String letra;

    public NIF() {
    }

    public NIF(String dni, String letra) {
        this.dni = dni;
        this.letra = letra;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni){
        dni = dni.trim();
        this.dni = dni;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    @Override
    public String toString() {
        return "NIF{" +
                "dni='" + dni + '\'' +
                ", letra='" + letra + '\'' +
                '}';
    }
}
