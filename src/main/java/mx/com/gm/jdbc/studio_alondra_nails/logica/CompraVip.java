package mx.com.gm.jdbc.studio_alondra_nails.logica;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="compras_vip")
public class CompraVip implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="compravip_id")
    private int id;
    @ManyToOne
    @JoinColumn(name="clientevip_id")
    private ClienteVip clientevip;
    @ManyToOne
    @JoinColumn(name="pago_id")
    private Pago pago;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ClienteVip getClientevip() {
        return clientevip;
    }

    public void setClientevip(ClienteVip clientevip) {
        this.clientevip = clientevip;
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }
    
    
    
    
}
