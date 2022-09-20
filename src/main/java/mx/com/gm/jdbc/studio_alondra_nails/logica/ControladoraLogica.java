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

    public void clienteNuevo() {
        crearCliente(new Cliente(JOptionPane.showInputDialog("Nombre"), 
                JOptionPane.showInputDialog("Apellido"), 
                Integer.parseInt(JOptionPane.showInputDialog("Telefono"))));
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

    public void empleadoNuevo() {
        String nombre = JOptionPane.showInputDialog("Nombre");
        String apellido = JOptionPane.showInputDialog("Apellido");
        if (nombre == null || apellido == null) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error intentelo mas tarde");
        }else{
        crearEmpleado(new Empleado(nombre,apellido));    
        }
        
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

    public void pagoNuevo() {
        Servicio servicio = (Servicio) JOptionPane.showInputDialog(null, "Selecciona el servicio a usar", "Servicios",
                JOptionPane.PLAIN_MESSAGE, null, traerListaServicios().toArray(), null);
        crearPago(new Pago(Double.parseDouble(JOptionPane.showInputDialog("¿Deja un adelanto?")), servicio.getPrecio()));
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

    public void servicioNuevo() {
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
