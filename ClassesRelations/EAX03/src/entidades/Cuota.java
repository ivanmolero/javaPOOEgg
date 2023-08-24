package entidades;

import java.time.LocalDate;

public class Cuota {
    private Long id;
    private Integer numeroCuota;
    private Double totalCuota;
    private Boolean estaPagada;
    private LocalDate fechaVencimiento;
    private String formaPago;

    public Cuota() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumeroCuota() {
        return numeroCuota;
    }

    public void setNumeroCuota(Integer numeroCuota) {
        this.numeroCuota = numeroCuota;
    }

    public Double getTotalCuota() {
        return totalCuota;
    }

    public void setTotalCuota(Double totalCuota) {
        this.totalCuota = totalCuota;
    }

    public Boolean getEstaPagada() {
        return estaPagada;
    }

    public void setEstaPagada(Boolean estaPagada) {
        this.estaPagada = estaPagada;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }
}
