package mx.com.gm.jdbc.studio_alondra_nails.logica;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.com.gm.jdbc.studio_alondra_nails.logica.ClienteVip;
import mx.com.gm.jdbc.studio_alondra_nails.logica.Pago;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-09-04T19:51:39", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(CompraVip.class)
public class CompraVip_ { 

    public static volatile SingularAttribute<CompraVip, Integer> id;
    public static volatile SingularAttribute<CompraVip, Pago> pago;
    public static volatile SingularAttribute<CompraVip, ClienteVip> clientevip;

}