package org.example.entidades;

public class ProblemaSalud {
    private Integer ordenIntegrante;
    private String ideFamilia;
    private Boolean hta;
    private Boolean dbt;

    public ProblemaSalud() {
    }

    public ProblemaSalud(Integer ordenIntegrante, String ideFamilia, Boolean hta, Boolean dbt) {
        this.ordenIntegrante = ordenIntegrante;
        this.ideFamilia = ideFamilia;
        this.hta = hta;
        this.dbt = dbt;
    }

    public Integer getOrdenIntegrante() {
        return ordenIntegrante;
    }

    public void setOrdenIntegrante(Integer ordenIntegrante) {
        this.ordenIntegrante = ordenIntegrante;
    }

    public String getIdeFamilia() {
        return ideFamilia;
    }

    public void setIdeFamilia(String ideFamilia) {
        this.ideFamilia = ideFamilia;
    }

    public Boolean getHta() {
        return hta;
    }

    public void setHta(Boolean hta) {
        this.hta = hta;
    }

    public Boolean getDbt() {
        return dbt;
    }

    public void setDbt(Boolean dbt) {
        this.dbt = dbt;
    }
}
