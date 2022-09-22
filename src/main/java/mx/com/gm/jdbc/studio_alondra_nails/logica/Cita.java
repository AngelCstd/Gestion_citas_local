package mx.com.gm.jdbc.studio_alondra_nails.logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "citas")
public class Cita implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="cita_id")
    private int id;
    @ManyToOne
    @JoinColumn(name="empleado_id")
    private Empleado empleado;
    @ManyToOne
    @JoinColumn(name="servicio_id")
    private Servicio servicio;
    @ManyToOne
    @JoinColumn(name="cliente_id")
    private Cliente cliente;
    @OneToOne
    @JoinColumn(name="pago_id")
    private Pago pago;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dia_de_cita;

    public Cita() {
    }

    public Cita(Empleado empleado, Servicio servicio, Cliente cliente, Pago pago, Date dia_de_cita) {
        this.empleado = empleado;
        this.servicio = servicio;
        this.cliente = cliente;
        this.pago = pago;
        this.dia_de_cita = dia_de_cita;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }

    public Date getDia_de_cita() {
        return dia_de_cita;
    }

    public void setDia_de_cita(Date dia_de_cita) {
        this.dia_de_cita = dia_de_cita;
    }
    

}
