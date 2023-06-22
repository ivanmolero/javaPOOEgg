package entidades;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int anio;
    private String tipo;
    private int desplazamiento;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, int anio, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getDesplazamiento() {
        return desplazamiento;
    }

    public void setDesplazamiento(int desplazamiento) {
        this.desplazamiento = desplazamiento;
    }

    public void frenar() {
        if (!tipo.equals("bicicleta")) {
            desplazamiento += 2;
        }
    }

    public void moverse(int tiempo) {
        int velocidad = 0;
        switch (tipo) {
            case "automovil":
                velocidad = 3;
                break;
            case "motocicleta":
                velocidad = 2;
                break;
            case "bicicleta":
                velocidad = 1;
                break;
        }
        desplazamiento = tiempo * velocidad;
    }
}
