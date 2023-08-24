package entidades;

import java.time.LocalDate;

public class Poliza {
    private Integer numeroPoliza;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Integer cantidadCuotas;
    private String formaPago;
    private Double totalSeguro;
    private Boolean incluyeGranizo;
    private Double maximoGranizo;
    private String tipoCobertura;
    private Cliente perteneceCliente;
    private Vehiculo aseguraVehiculo;

    public Poliza() {
    }

    public Integer getNumeroPoliza() {
        return numeroPoliza;
    }

    public void setNumeroPoliza(Integer numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Integer getCantidadCuotas() {
        return cantidadCuotas;
    }

    public void setCantidadCuotas(Integer cantidadCuotas) {
        this.cantidadCuotas = cantidadCuotas;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public Double getTotalSeguro() {
        return totalSeguro;
    }

    public void setTotalSeguro(Double totalSeguro) {
        this.totalSeguro = totalSeguro;
    }

    public Boolean getIncluyeGranizo() {
        return incluyeGranizo;
    }

    public void setIncluyeGranizo(Boolean incluyeGranizo) {
        this.incluyeGranizo = incluyeGranizo;
    }

    public Double getMaximoGranizo() {
        return maximoGranizo;
    }

    public void setMaximoGranizo(Double maximoGranizo) {
        this.maximoGranizo = maximoGranizo;
    }

    public String getTipoCobertura() {
        return tipoCobertura;
    }

    public void setTipoCobertura(String tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }

    public Cliente getPerteneceCliente() {
        return perteneceCliente;
    }

    public void setPerteneceCliente(Cliente perteneceCliente) {
        this.perteneceCliente = perteneceCliente;
    }

    public Vehiculo getAseguraVehiculo() {
        return aseguraVehiculo;
    }

    public void setAseguraVehiculo(Vehiculo aseguraVehiculo) {
        this.aseguraVehiculo = aseguraVehiculo;
    }
}
