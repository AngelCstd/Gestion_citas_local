package mx.com.gm.jdbc.studio_alondra_nails.logica;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="pagos")
public class Pago implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="pago_id")
    private int id;
    @Basic
    @Column(name="adelantado")
    private double adelantado;
    @Column(name="deuda")
    private double deuda;
    @Column(name="pagado")
    private boolean pagado = false;

    public Pago() {
    }

    
    public Pago(double adelantado, double deuda) {
        this.adelantado = adelantado;
        this.deuda = deuda;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAdelantado() {
        return adelantado;
    }

    public void setAdelantado(double adelantado) {
        this.adelantado = adelantado;
    }

    public double getDeuda() {
        return deuda;
    }

    public void setDeuda(double deuda) {
        this.deuda = deuda;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    @Override
    public String toString() {
        return id + ".- " + deuda;
    }
    
}
