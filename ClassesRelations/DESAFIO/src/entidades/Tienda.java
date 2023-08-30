package entidades;

import java.util.*;

public class Tienda {
    private Integer id;
    private Map<Producto, Integer> productosStock;
    private String direccion;
    private String representante;
    private static Integer generador = 0;

    public Tienda() {
        generador++;
        this.id = generador;
    }

    public Tienda(String direccion, String representante) {
        this();
        this.direccion = direccion;
        this.representante = representante;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Map<Producto, Integer> getProductosStock() {
        if (this.productosStock == null) {
            this.productosStock = new HashMap<>();
        }
        return productosStock;
    }

    public void setProductosStock(Map<Producto, Integer> productosStock) {
        this.productosStock = productosStock;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    @Override
    public String toString() {
        return "Tienda{" +
                "id=" + id +
                ", productos=" + productosStock +
                ", direccion='" + direccion + '\'' +
                ", representante='" + representante + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tienda tienda = (Tienda) o;
        return Objects.equals(getId(), tienda.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
