package mx.com.gm.jdbc.studio_alondra_nails.logica;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import mx.com.gm.jdbc.studio_alondra_nails.persistencia.*;

public class ControladoraLogica {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void crearCliente(Cliente cliente) {
        controlPersis.crearCliente(cliente);
    }

    public void crearCita(Cita cita) {
        controlPersis.crearCita(cita);
    }

    public void crearEmpleado(Empleado empleado) {
        controlPersis.crearEmpleado(empleado);
    }

    public void crearPago(Pago pago) {
        controlPersis.crearPago(pago);
    }

    public void crearServicio(Servicio servicio) {
        controlPersis.crearServicio(servicio);
    }

    public void eliminarCita(int id) {
        controlPersis.eliminarCita(id);
    }

    public void eliminarCliente(int id) {
        controlPersis.eliminarCliente(id);
    }

    public void eliminarEmpleado(int id) {
        controlPersis.eliminarEmpleado(id);
    }

    public void eliminarPago(int id) {
        controlPersis.eliminarPago(id);
    }

    public void eliminarServicio(int id) {
        controlPersis.eliminarServicio(id);
    }

    public void editarCita(Cita cita) {
        controlPersis.editarCita(cita);
    }

    public void editarCliente(Cliente cliente) {
        controlPersis.editarCliente(cliente);
    }

    public void editarEmpleado(Empleado empleado) {
        controlPersis.editarEmpleado(empleado);
    }

    public void editarPago(Pago pago) {
        controlPersis.editarPago(pago);
    }

    public void editarServicio(Servicio servicio) {
        controlPersis.editarServicio(servicio);
    }
    
    public Cita traerCita(int id){
        return controlPersis.traerCita(id);
    }

    public ArrayList<Cita> traerListaCitas(){
        return controlPersis.traerListaCitas();
    }
    
    public Cliente traerCliente(int id){
        return controlPersis.traerCliente(id);
    }

    public ArrayList<Cliente> traerListaClientes(){
        return controlPersis.traerListaClientes();
    }
    
    public Empleado traerEmpleado(int id){
        return controlPersis.traerEmpleado(id);
    }

    public ArrayList<Empleado> traerListaEmpleados(){
        return controlPersis.traerListaEmpleados();
    }
    
    public Pago traerPago(int id){
        return controlPersis.traerPago(id);
    }

    public ArrayList<Pago> traerListaPagos(){
        return controlPersis.traerListaPagos();
    }
    
    public Servicio traerServicio(int id){
        return controlPersis.traerServicio(id);
    }

    public ArrayList<Servicio> traerListaServicios(){
        return controlPersis.traerListaServicios();
    }

    public void ServicioNuevo() {

        String nombre = JOptionPane.showInputDialog("¿Como se llama el servicio?");
       double precio = Double.parseDouble(JOptionPane.showInputDialog("¿Cual es el precio?"));
       int minutos = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos minutos toma el servicio?"));
       crearServicio(new Servicio(nombre, precio, minutos));    

       
    }
    
}
