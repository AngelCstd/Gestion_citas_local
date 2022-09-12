
package mx.com.gm.jdbc.studio_alondra_nails.logica;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "empleados")
public class Empleado implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="empleado_id")
    private int id;
    @Basic
    @Column(name="nombre")
    private String nombre;
    @Column(name="apellidos")
    private String apellido;

    public Empleado() {
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
    

}
