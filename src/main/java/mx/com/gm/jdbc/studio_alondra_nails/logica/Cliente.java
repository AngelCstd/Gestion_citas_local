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
    private double apellido;
    @Column(name="telefono")
    private int telefono;
    
//    @OneToOne(mappedBy="cliente")
//    private ClienteVip clienteVip;

    public Cliente() {
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

    public double getApellido() {
        return apellido;
    }

    public void setApellido(double apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
}
