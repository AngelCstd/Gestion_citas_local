package mx.com.gm.jdbc.studio_alondra_nails.logica;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import mx.com.gm.jdbc.studio_alondra_nails.persistencia.*;

public class ControladoraLogica {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    /*
    
    CITAS
    
     */
    public void crearCita(Cita cita) {
        controlPersis.crearCita(cita);
    }

    public void eliminarCita(int id) {
        controlPersis.eliminarCita(id);
    }

    public void editarCita(Cita cita) {
        controlPersis.editarCita(cita);
    }

    public Cita traerCita(int id) {
        return controlPersis.traerCita(id);
    }

    public ArrayList<Cita> traerListaCitas() {
        return controlPersis.traerListaCitas();
    }

    /*
    
    CLIENTES
    
     */
    public void crearCliente(Cliente cliente) {
        controlPersis.crearCliente(cliente);
    }

    public void eliminarCliente(int id) {
        controlPersis.eliminarCliente(id);
    }

    public void editarCliente(Cliente cliente) {
        controlPersis.editarCliente(cliente);
    }

    public Cliente traerCliente(int id) {
        return controlPersis.traerCliente(id);
    }

    public ArrayList<Cliente> traerListaClientes() {
        return controlPersis.traerListaClientes();
    }

    /*
    
    EMPLEADOS
    
     */
    public void crearEmpleado(Empleado empleado) {
        controlPersis.crearEmpleado(empleado);
    }

    public void eliminarEmpleado(int id) {
        controlPersis.eliminarEmpleado(id);
    }

    public void editarEmpleado(Empleado empleado) {
        controlPersis.editarEmpleado(empleado);
    }

    public Empleado traerEmpleado(int id) {
        return controlPersis.traerEmpleado(id);
    }

    public ArrayList<Empleado> traerListaEmpleados() {
        return controlPersis.traerListaEmpleados();
    }

    /*
    
    PAGOS
    
     */
    public void crearPago(Pago pago) {
        controlPersis.crearPago(pago);
    }

    public void eliminarPago(int id) {
        controlPersis.eliminarPago(id);
    }

    public void editarPago(Pago pago) {
        controlPersis.editarPago(pago);
    }

    public Pago traerPago(int id) {
        return controlPersis.traerPago(id);
    }

    public ArrayList<Pago> traerListaPagos() {
        return controlPersis.traerListaPagos();
    }

    /*
    
    SERVICIOS
    
     */
    public void crearServicio(Servicio servicio) {
        controlPersis.crearServicio(servicio);
    }

    public void eliminarServicio(int id) {
        controlPersis.eliminarServicio(id);
    }

    public void editarServicio(Servicio servicio) {
        controlPersis.editarServicio(servicio);
    }

    public Servicio traerServicio(int id) {
        return controlPersis.traerServicio(id);
    }

    public ArrayList<Servicio> traerListaServicios() {
        return controlPersis.traerListaServicios();
    }

    public void ServicioNuevo() {
        crearServicio(new Servicio(JOptionPane.showInputDialog("¿Como se llama el servicio?"), 
                Double.parseDouble(JOptionPane.showInputDialog("¿Cual es el precio?")), 
                Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos minutos toma el servicio?"))));

    }
    /*
    
    CLIENTES VIP
    
     */
    
    public void crearClienteVip(ClienteVip cvi) {
        controlPersis.crearClienteVip(cvi);
    }

    public void eliminarClienteVip(int id) {
        controlPersis.eliminarClienteVip(id);
    }

    public void editarClienteVip(ClienteVip cvi) {
        controlPersis.editarClienteVip(cvi);
    }

    public ClienteVip traerClienteVip(int id) {
        return controlPersis.traerClienteVip(id);
    }

    public ArrayList<ClienteVip> traerListaClientesVip() {
        return controlPersis.traerListaClientesVip();
    }
}
