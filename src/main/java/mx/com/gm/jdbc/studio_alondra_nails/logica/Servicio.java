package mx.com.gm.jdbc.studio_alondra_nails.logica;

import java.io.Serializable;
import javax.persistence.*;


@Entity
@Table(name = "Servicios")
public class Servicio implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="servicio_id")
    private int id;
    @Basic
    @Column(name="Servicio")
    private String servicio;
    @Column(name="precio")
    private double precio;
    @Column(name="tiempo_minutos")
    private int minutos;

    public Servicio() {
    }

    public Servicio(String servicio, double precio, int minutos) {
        this.servicio = servicio;
        this.precio = precio;
        this.minutos = minutos;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    @Override
    public String toString() {
        return servicio;
    }
    
    
}
