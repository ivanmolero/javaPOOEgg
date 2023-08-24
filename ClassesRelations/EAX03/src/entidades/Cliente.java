package entidades;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String apellidos;
    private String documento;
    private String mail;
    private String domicilio;
    private String telefono;
    private List<Vehiculo> tieneVehiculos;

    public Cliente() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Vehiculo> getTieneVehiculos() {
        if (this.tieneVehiculos == null) {
            this.tieneVehiculos = new ArrayList<>();
        }
        return tieneVehiculos;
    }

    public void setTieneVehiculos(List<Vehiculo> tieneVehiculos) {
        this.tieneVehiculos = tieneVehiculos;
    }
}
