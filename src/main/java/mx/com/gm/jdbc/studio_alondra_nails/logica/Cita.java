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
    @Temporal(TemporalType.DATE)
    private Date dia_cita;
    @Temporal(TemporalType.TIMESTAMP)
    private Date hora_cita;

    public Cita() {
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

    public Date getDia_cita() {
        return dia_cita;
    }

    public void setDia_cita(Date dia_cita) {
        this.dia_cita = dia_cita;
    }

    public Date getHora_cita() {
        return hora_cita;
    }

    public void setHora_cita(Date hora_cita) {
        this.hora_cita = hora_cita;
    }
    

}
