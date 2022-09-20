package mx.com.gm.jdbc.studio_alondra_nails.logica;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "Clientes")
public class Cliente implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="cliente_id")
    private int id;
    @Basic
    @Column(name="nombre")
    private String nombre;
    @Column(name="apellido")
    private String apellido;
    @Column(name="telefono")
    private int telefono;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return nombre + " #" + telefono;
    }
    
    
}
