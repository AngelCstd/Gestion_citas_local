package mx.com.gm.jdbc.studio_alondra_nails.logica;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.com.gm.jdbc.studio_alondra_nails.logica.Cliente;
import mx.com.gm.jdbc.studio_alondra_nails.logica.Empleado;
import mx.com.gm.jdbc.studio_alondra_nails.logica.Pago;
import mx.com.gm.jdbc.studio_alondra_nails.logica.Servicio;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-09-04T19:51:39", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Cita.class)
public class Cita_ { 

    public static volatile SingularAttribute<Cita, Cliente> cliente;
    public static volatile SingularAttribute<Cita, Servicio> servicio;
    public static volatile SingularAttribute<Cita, Empleado> empleado;
    public static volatile SingularAttribute<Cita, Date> dia_cita;
    public static volatile SingularAttribute<Cita, Date> hora_cita;
    public static volatile SingularAttribute<Cita, Integer> id;
    public static volatile SingularAttribute<Cita, Pago> pago;

}