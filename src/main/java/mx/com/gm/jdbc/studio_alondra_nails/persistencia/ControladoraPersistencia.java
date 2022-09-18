package mx.com.gm.jdbc.studio_alondra_nails.persistencia;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mx.com.gm.jdbc.studio_alondra_nails.logica.*;
import mx.com.gm.jdbc.studio_alondra_nails.persistencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {

    CitaJpaController citaJpa = new CitaJpaController();
    ServicioJpaController servicioJpa = new ServicioJpaController();
    ClienteJpaController clienteJpa = new ClienteJpaController();
    PagoJpaController pagoJpa = new PagoJpaController();
    EmpleadoJpaController empleadoJpa = new EmpleadoJpaController();
    ClienteVipJpaController clienteVJpa = new ClienteVipJpaController();

    public void crearCliente(Cliente cliente) {
        clienteJpa.create(cliente);
    }

    public void crearCita(Cita cita) {
        citaJpa.create(cita);
    }

    public void crearEmpleado(Empleado empleado) {
        empleadoJpa.create(empleado);
    }

    public void crearPago(Pago pago) {
        pagoJpa.create(pago);
    }

    public void crearServicio(Servicio servicio) {
        servicioJpa.create(servicio);
    }

    public void crearClienteVip(ClienteVip cliente) {
        clienteVJpa.create(cliente);
    }

    public void eliminarCita(int id) {
        try {
            citaJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarCliente(int id) {
        try {
            clienteJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarEmpleado(int id) {
        try {
            empleadoJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarPago(int id) {
        try {
            pagoJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarServicio(int id) {
        try {
            servicioJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarClienteVip(int id) {
        try {
            clienteVJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarCita(Cita cita) {
        try {
            citaJpa.edit(cita);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarCliente(Cliente cliente) {
        try {
            clienteJpa.edit(cliente);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarEmpleado(Empleado empleado) {
        try {
            empleadoJpa.edit(empleado);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarPago(Pago pago) {
        try {
            pagoJpa.edit(pago);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarServicio(Servicio servicio) {
        try {
            servicioJpa.edit(servicio);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarClienteVip(ClienteVip cliente) {
        try {
            clienteVJpa.edit(cliente);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Cita traerCita(int id) {
        return citaJpa.findCita(id);
    }

    public ArrayList<Cita> traerListaCitas() {
        List<Cita> lista = citaJpa.findCitaEntities();
        ArrayList<Cita> arraylista = new ArrayList<Cita>(lista);
        return arraylista;
    }

    public Cliente traerCliente(int id) {
        return clienteJpa.findCliente(id);
    }

    public ArrayList<Cliente> traerListaClientes() {
        List<Cliente> lista = clienteJpa.findClienteEntities();
        ArrayList<Cliente> arraylista = new ArrayList<Cliente>(lista);
        return arraylista;
    }

    public Empleado traerEmpleado(int id) {
        return empleadoJpa.findEmpleado(id);
    }

    public ArrayList<Empleado> traerListaEmpleados() {
        List<Empleado> lista = empleadoJpa.findEmpleadoEntities();
        ArrayList<Empleado> arraylista = new ArrayList<Empleado>(lista);
        return arraylista;
    }

    public Pago traerPago(int id) {
        return pagoJpa.findPago(id);
    }

    public ArrayList<Pago> traerListaPagos() {
        List<Pago> lista = pagoJpa.findPagoEntities();
        ArrayList<Pago> arraylista = new ArrayList<Pago>(lista);
        return arraylista;
    }

    public Servicio traerServicio(int id) {
        return servicioJpa.findServicio(id);
    }

    public ArrayList<Servicio> traerListaServicios() {
        List<Servicio> lista = servicioJpa.findServicioEntities();
        ArrayList<Servicio> arraylista = new ArrayList<Servicio>(lista);
        return arraylista;
    }

    public ClienteVip traerClienteVip(int id) {
        return clienteVJpa.findClienteVip(id);
    }

    public ArrayList<ClienteVip> traerListaClientesVip() {
        List<ClienteVip> lista = clienteVJpa.findClienteVipEntities();
        ArrayList<ClienteVip> arraylista = new ArrayList<ClienteVip>(lista);
        return arraylista;
    }

}
