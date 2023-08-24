package entidades;

public class Vehiculo {
    private String marca;
    private String modelo;
    private Integer anio;
    private String numeroMotor;
    private String chasis;
    private String color;
    private String tipo;
    private Cliente pertenceCliente;
    private Poliza tienePoliza;

    public Vehiculo() {
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

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public String getNumeroMotor() {
        return numeroMotor;
    }

    public void setNumeroMotor(String numeroMotor) {
        this.numeroMotor = numeroMotor;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Cliente getPertenceCliente() {
        return pertenceCliente;
    }

    public void setPertenceCliente(Cliente pertenceCliente) {
        this.pertenceCliente = pertenceCliente;
    }

    public Poliza getTienePoliza() {
        return tienePoliza;
    }

    public void setTienePoliza(Poliza tienePoliza) {
        this.tienePoliza = tienePoliza;
    }
}
