package mx.com.gm.jdbc.studio_alondra_nails.igu;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.*;
import mx.com.gm.jdbc.studio_alondra_nails.logica.*;

/*
FALTA EL MOSTRAR LOS DATOS EN LOS PANELES DE LAS CITAS


Servicio servicio = (Servicio)JOptionPane.showInputDialog(null, "Selecciona el servicio a editar", "Servicios",
                JOptionPane.PLAIN_MESSAGE, null, control.traerListaServicios().toArray(), botonEditarCita);
        System.out.println(servicio.getId());

METODO PARA LA ELECCION DE UN SERVICIO ETC....
 */
public class Inicio extends javax.swing.JFrame {

    ControladoraLogica control = new ControladoraLogica();

    public Inicio() {
        initComponents();
        panelCrearDatos.setVisible(false);
        panelEditarDatos.setVisible(false);
        panelCitas.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panelInicio = new javax.swing.JPanel();
        inicioANuevaCita = new javax.swing.JButton();
        inicioAEditarCita = new javax.swing.JButton();
        botonCambioEmpleado = new javax.swing.JButton();
        botonVip = new javax.swing.JButton();
        botonCobrar = new javax.swing.JButton();
        panelLunes = new MyPanel();
        panelMartes = new MyPanel();
        panelMiercoles = new MyPanel();
        panelJueves = new MyPanel();
        panelViernes = new MyPanel();
        panelSabado = new MyPanel();
        panelDomingo = new MyPanel();
        labelMartes = new javax.swing.JLabel();
        labelMiercoles = new javax.swing.JLabel();
        labelJueves = new javax.swing.JLabel();
        labelViernes = new javax.swing.JLabel();
        labelSabado = new javax.swing.JLabel();
        labelDomingo = new javax.swing.JLabel();
        labelLunes = new javax.swing.JLabel();
        label10 = new javax.swing.JLabel();
        label11 = new javax.swing.JLabel();
        label12 = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        label5 = new javax.swing.JLabel();
        label6 = new javax.swing.JLabel();
        label7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        botonEliminarCita = new javax.swing.JButton();
        inicioACrear = new javax.swing.JButton();
        inicioAEditar = new javax.swing.JButton();
        botonMostrarFacturaSemanal = new javax.swing.JButton();
        panelCrearDatos = new javax.swing.JPanel();
        botonCrearPago = new javax.swing.JButton();
        botonCrearCliente = new javax.swing.JButton();
        botonCrearServicio = new javax.swing.JButton();
        botonCrearEmpleado = new javax.swing.JButton();
        crearDatosAInicio = new javax.swing.JButton();
        panelEditarDatos = new javax.swing.JPanel();
        editarDatosAInicio = new javax.swing.JButton();
        comboBoxEditar = new javax.swing.JComboBox<>();
        textField1 = new javax.swing.JTextField();
        textField2 = new javax.swing.JTextField();
        textField3 = new javax.swing.JTextField();
        textField4 = new javax.swing.JTextField();
        panelCitas = new javax.swing.JPanel();
        jdcFecha = new com.toedter.calendar.JDateChooser();
        jcbServicios = new javax.swing.JComboBox<>();
        jcbCliente = new javax.swing.JComboBox<>();
        jcbEmpleado = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jtfAdelantado = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtfTelefono = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jcbHora = new javax.swing.JComboBox<>();
        jcbMinuto = new javax.swing.JComboBox<>();
        buscarClientebotn = new javax.swing.JButton();
        GuardarCitabtn = new javax.swing.JButton();
        botonCitasAInicio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(100, 100));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        panelInicio.setMinimumSize(new java.awt.Dimension(104, 300));
        panelInicio.setPreferredSize(new java.awt.Dimension(1100, 610));
        panelInicio.setLayout(new java.awt.GridBagLayout());

        inicioANuevaCita.setText("Nueva cita");
        inicioANuevaCita.setAlignmentY(0);
        inicioANuevaCita.setMargin(new java.awt.Insets(0, 0, 0, 0));
        inicioANuevaCita.setMaximumSize(new java.awt.Dimension(111, 30));
        inicioANuevaCita.setMinimumSize(new java.awt.Dimension(111, 30));
        inicioANuevaCita.setPreferredSize(new java.awt.Dimension(111, 30));
        inicioANuevaCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioANuevaCitaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 7, 0, 7);
        panelInicio.add(inicioANuevaCita, gridBagConstraints);

        inicioAEditarCita.setText("Editar cita");
        inicioAEditarCita.setMargin(new java.awt.Insets(0, 0, 0, 0));
        inicioAEditarCita.setMaximumSize(new java.awt.Dimension(111, 30));
        inicioAEditarCita.setMinimumSize(new java.awt.Dimension(111, 30));
        inicioAEditarCita.setPreferredSize(new java.awt.Dimension(111, 30));
        inicioAEditarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioAEditarCitaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 7, 0, 7);
        panelInicio.add(inicioAEditarCita, gridBagConstraints);

        botonCambioEmpleado.setText("Empleado");
        botonCambioEmpleado.setMargin(new java.awt.Insets(0, 0, 0, 0));
        botonCambioEmpleado.setMaximumSize(new java.awt.Dimension(111, 30));
        botonCambioEmpleado.setMinimumSize(new java.awt.Dimension(111, 30));
        botonCambioEmpleado.setPreferredSize(new java.awt.Dimension(111, 30));
        botonCambioEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCambioEmpleadoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 35;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 7, 0, 7);
        panelInicio.add(botonCambioEmpleado, gridBagConstraints);

        botonVip.setText("VIP");
        botonVip.setMargin(new java.awt.Insets(0, 0, 0, 0));
        botonVip.setMaximumSize(new java.awt.Dimension(111, 30));
        botonVip.setMinimumSize(new java.awt.Dimension(111, 30));
        botonVip.setPreferredSize(new java.awt.Dimension(111, 30));
        botonVip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVipActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 31;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 7, 0, 7);
        panelInicio.add(botonVip, gridBagConstraints);

        botonCobrar.setText("Cobrar");
        botonCobrar.setMargin(new java.awt.Insets(0, 0, 0, 0));
        botonCobrar.setMaximumSize(new java.awt.Dimension(111, 30));
        botonCobrar.setMinimumSize(new java.awt.Dimension(111, 30));
        botonCobrar.setPreferredSize(new java.awt.Dimension(111, 30));
        botonCobrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCobrarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 27;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 7, 0, 7);
        panelInicio.add(botonCobrar, gridBagConstraints);

        javax.swing.GroupLayout panelLunesLayout = new javax.swing.GroupLayout(panelLunes);
        panelLunes.setLayout(panelLunesLayout);
        panelLunesLayout.setHorizontalGroup(
            panelLunesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelLunesLayout.setVerticalGroup(
            panelLunesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 38;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        panelInicio.add(panelLunes, gridBagConstraints);

        javax.swing.GroupLayout panelMartesLayout = new javax.swing.GroupLayout(panelMartes);
        panelMartes.setLayout(panelMartesLayout);
        panelMartesLayout.setHorizontalGroup(
            panelMartesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelMartesLayout.setVerticalGroup(
            panelMartesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 38;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        panelInicio.add(panelMartes, gridBagConstraints);

        javax.swing.GroupLayout panelMiercolesLayout = new javax.swing.GroupLayout(panelMiercoles);
        panelMiercoles.setLayout(panelMiercolesLayout);
        panelMiercolesLayout.setHorizontalGroup(
            panelMiercolesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelMiercolesLayout.setVerticalGroup(
            panelMiercolesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 38;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        panelInicio.add(panelMiercoles, gridBagConstraints);

        javax.swing.GroupLayout panelJuevesLayout = new javax.swing.GroupLayout(panelJueves);
        panelJueves.setLayout(panelJuevesLayout);
        panelJuevesLayout.setHorizontalGroup(
            panelJuevesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelJuevesLayout.setVerticalGroup(
            panelJuevesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 38;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        panelInicio.add(panelJueves, gridBagConstraints);

        javax.swing.GroupLayout panelViernesLayout = new javax.swing.GroupLayout(panelViernes);
        panelViernes.setLayout(panelViernesLayout);
        panelViernesLayout.setHorizontalGroup(
            panelViernesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelViernesLayout.setVerticalGroup(
            panelViernesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 38;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        panelInicio.add(panelViernes, gridBagConstraints);

        javax.swing.GroupLayout panelSabadoLayout = new javax.swing.GroupLayout(panelSabado);
        panelSabado.setLayout(panelSabadoLayout);
        panelSabadoLayout.setHorizontalGroup(
            panelSabadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelSabadoLayout.setVerticalGroup(
            panelSabadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 38;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        panelInicio.add(panelSabado, gridBagConstraints);

        javax.swing.GroupLayout panelDomingoLayout = new javax.swing.GroupLayout(panelDomingo);
        panelDomingo.setLayout(panelDomingoLayout);
        panelDomingoLayout.setHorizontalGroup(
            panelDomingoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelDomingoLayout.setVerticalGroup(
            panelDomingoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 38;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        panelInicio.add(panelDomingo, gridBagConstraints);

        labelMartes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMartes.setText("Martes");
        labelMartes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelMartes.setMaximumSize(new java.awt.Dimension(125, 20));
        labelMartes.setMinimumSize(new java.awt.Dimension(125, 20));
        labelMartes.setPreferredSize(new java.awt.Dimension(125, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        panelInicio.add(labelMartes, gridBagConstraints);

        labelMiercoles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMiercoles.setText("Miercoles");
        labelMiercoles.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelMiercoles.setMaximumSize(new java.awt.Dimension(125, 20));
        labelMiercoles.setMinimumSize(new java.awt.Dimension(125, 20));
        labelMiercoles.setPreferredSize(new java.awt.Dimension(125, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        panelInicio.add(labelMiercoles, gridBagConstraints);

        labelJueves.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelJueves.setText("Jueves");
        labelJueves.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelJueves.setMaximumSize(new java.awt.Dimension(125, 20));
        labelJueves.setMinimumSize(new java.awt.Dimension(125, 20));
        labelJueves.setPreferredSize(new java.awt.Dimension(125, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        panelInicio.add(labelJueves, gridBagConstraints);

        labelViernes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelViernes.setText("Viernes");
        labelViernes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelViernes.setMaximumSize(new java.awt.Dimension(125, 20));
        labelViernes.setMinimumSize(new java.awt.Dimension(125, 20));
        labelViernes.setPreferredSize(new java.awt.Dimension(125, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        panelInicio.add(labelViernes, gridBagConstraints);

        labelSabado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSabado.setText("Sabado");
        labelSabado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelSabado.setMaximumSize(new java.awt.Dimension(125, 20));
        labelSabado.setMinimumSize(new java.awt.Dimension(125, 20));
        labelSabado.setPreferredSize(new java.awt.Dimension(125, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        panelInicio.add(labelSabado, gridBagConstraints);

        labelDomingo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDomingo.setText("Domingo");
        labelDomingo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelDomingo.setMaximumSize(new java.awt.Dimension(125, 20));
        labelDomingo.setMinimumSize(new java.awt.Dimension(125, 20));
        labelDomingo.setPreferredSize(new java.awt.Dimension(125, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        panelInicio.add(labelDomingo, gridBagConstraints);

        labelLunes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLunes.setText("Lunes");
        labelLunes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelLunes.setMaximumSize(new java.awt.Dimension(125, 20));
        labelLunes.setMinimumSize(new java.awt.Dimension(125, 20));
        labelLunes.setPreferredSize(new java.awt.Dimension(125, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        panelInicio.add(labelLunes, gridBagConstraints);

        label10.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        label10.setText("10:00");
        label10.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        label10.setMaximumSize(new java.awt.Dimension(50, 30));
        label10.setMinimumSize(new java.awt.Dimension(50, 30));
        label10.setPreferredSize(new java.awt.Dimension(50, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.weightx = 1.0;
        panelInicio.add(label10, gridBagConstraints);

        label11.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        label11.setText("11:00");
        label11.setMaximumSize(new java.awt.Dimension(50, 30));
        label11.setMinimumSize(new java.awt.Dimension(50, 30));
        label11.setPreferredSize(new java.awt.Dimension(50, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.weightx = 1.0;
        panelInicio.add(label11, gridBagConstraints);

        label12.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        label12.setText("12:00");
        label12.setMaximumSize(new java.awt.Dimension(50, 30));
        label12.setMinimumSize(new java.awt.Dimension(50, 30));
        label12.setPreferredSize(new java.awt.Dimension(50, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.weightx = 1.0;
        panelInicio.add(label12, gridBagConstraints);

        label1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        label1.setText("1:00");
        label1.setMaximumSize(new java.awt.Dimension(50, 30));
        label1.setMinimumSize(new java.awt.Dimension(50, 30));
        label1.setPreferredSize(new java.awt.Dimension(50, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.weightx = 1.0;
        panelInicio.add(label1, gridBagConstraints);

        label2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        label2.setText("2:00");
        label2.setMaximumSize(new java.awt.Dimension(50, 30));
        label2.setMinimumSize(new java.awt.Dimension(50, 30));
        label2.setPreferredSize(new java.awt.Dimension(50, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 17;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.weightx = 1.0;
        panelInicio.add(label2, gridBagConstraints);

        label3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        label3.setText("3:00");
        label3.setMaximumSize(new java.awt.Dimension(50, 30));
        label3.setMinimumSize(new java.awt.Dimension(50, 30));
        label3.setPreferredSize(new java.awt.Dimension(50, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 21;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.weightx = 1.0;
        panelInicio.add(label3, gridBagConstraints);

        label4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        label4.setText("4:00");
        label4.setMaximumSize(new java.awt.Dimension(50, 30));
        label4.setMinimumSize(new java.awt.Dimension(50, 30));
        label4.setPreferredSize(new java.awt.Dimension(50, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 25;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.weightx = 1.0;
        panelInicio.add(label4, gridBagConstraints);

        label5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        label5.setText("5:00");
        label5.setMaximumSize(new java.awt.Dimension(50, 30));
        label5.setMinimumSize(new java.awt.Dimension(50, 30));
        label5.setPreferredSize(new java.awt.Dimension(50, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 29;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.weightx = 1.0;
        panelInicio.add(label5, gridBagConstraints);

        label6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        label6.setText("6:00");
        label6.setMaximumSize(new java.awt.Dimension(50, 30));
        label6.setMinimumSize(new java.awt.Dimension(50, 30));
        label6.setPreferredSize(new java.awt.Dimension(50, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 33;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.weightx = 1.0;
        panelInicio.add(label6, gridBagConstraints);

        label7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        label7.setText("7:00");
        label7.setMaximumSize(new java.awt.Dimension(50, 30));
        label7.setMinimumSize(new java.awt.Dimension(50, 30));
        label7.setPreferredSize(new java.awt.Dimension(50, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 37;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.weightx = 1.0;
        panelInicio.add(label7, gridBagConstraints);

        jLabel1.setBackground(new java.awt.Color(255, 102, 255));
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("STUDIO ALONDRA NAILS");
        jLabel1.setMaximumSize(new java.awt.Dimension(12345, 12345));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 39;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        panelInicio.add(jLabel1, gridBagConstraints);

        botonEliminarCita.setText("Borrar cita");
        botonEliminarCita.setMargin(new java.awt.Insets(0, 0, 0, 0));
        botonEliminarCita.setMaximumSize(new java.awt.Dimension(111, 30));
        botonEliminarCita.setMinimumSize(new java.awt.Dimension(111, 30));
        botonEliminarCita.setPreferredSize(new java.awt.Dimension(111, 30));
        botonEliminarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarCitaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 7, 0, 7);
        panelInicio.add(botonEliminarCita, gridBagConstraints);

        inicioACrear.setText("Crear");
        inicioACrear.setMargin(new java.awt.Insets(0, 0, 0, 0));
        inicioACrear.setMaximumSize(new java.awt.Dimension(111, 30));
        inicioACrear.setMinimumSize(new java.awt.Dimension(111, 30));
        inicioACrear.setPreferredSize(new java.awt.Dimension(111, 30));
        inicioACrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioACrearActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 7, 0, 7);
        panelInicio.add(inicioACrear, gridBagConstraints);

        inicioAEditar.setText("Editar");
        inicioAEditar.setMargin(new java.awt.Insets(0, 0, 0, 0));
        inicioAEditar.setMaximumSize(new java.awt.Dimension(111, 30));
        inicioAEditar.setMinimumSize(new java.awt.Dimension(111, 30));
        inicioAEditar.setPreferredSize(new java.awt.Dimension(111, 30));
        inicioAEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioAEditarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 19;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 7, 0, 7);
        panelInicio.add(inicioAEditar, gridBagConstraints);

        botonMostrarFacturaSemanal.setText("Semanal");
        botonMostrarFacturaSemanal.setMargin(new java.awt.Insets(0, 0, 0, 0));
        botonMostrarFacturaSemanal.setMaximumSize(new java.awt.Dimension(111, 30));
        botonMostrarFacturaSemanal.setMinimumSize(new java.awt.Dimension(111, 30));
        botonMostrarFacturaSemanal.setPreferredSize(new java.awt.Dimension(111, 30));
        botonMostrarFacturaSemanal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMostrarFacturaSemanalActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 23;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 7, 0, 7);
        panelInicio.add(botonMostrarFacturaSemanal, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(panelInicio, gridBagConstraints);

        panelCrearDatos.setPreferredSize(new java.awt.Dimension(1100, 610));

        botonCrearPago.setText("Crear Pago");
        botonCrearPago.setMinimumSize(new java.awt.Dimension(150, 220));
        botonCrearPago.setPreferredSize(new java.awt.Dimension(150, 220));
        botonCrearPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearPagoActionPerformed(evt);
            }
        });

        botonCrearCliente.setText("Crear Cliente");
        botonCrearCliente.setMinimumSize(new java.awt.Dimension(150, 220));
        botonCrearCliente.setPreferredSize(new java.awt.Dimension(150, 220));
        botonCrearCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearClienteActionPerformed(evt);
            }
        });

        botonCrearServicio.setText("Crear Servicio");
        botonCrearServicio.setMinimumSize(new java.awt.Dimension(150, 220));
        botonCrearServicio.setPreferredSize(new java.awt.Dimension(150, 220));
        botonCrearServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearServicioActionPerformed(evt);
            }
        });

        botonCrearEmpleado.setText("Crear Empleado");
        botonCrearEmpleado.setMinimumSize(new java.awt.Dimension(150, 220));
        botonCrearEmpleado.setPreferredSize(new java.awt.Dimension(150, 220));
        botonCrearEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearEmpleadoActionPerformed(evt);
            }
        });

        crearDatosAInicio.setText("Inicio");
        crearDatosAInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearDatosAInicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCrearDatosLayout = new javax.swing.GroupLayout(panelCrearDatos);
        panelCrearDatos.setLayout(panelCrearDatosLayout);
        panelCrearDatosLayout.setHorizontalGroup(
            panelCrearDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrearDatosLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelCrearDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelCrearDatosLayout.createSequentialGroup()
                        .addComponent(botonCrearCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(botonCrearEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCrearDatosLayout.createSequentialGroup()
                        .addComponent(botonCrearPago, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120)
                        .addComponent(botonCrearServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 382, Short.MAX_VALUE)
                .addComponent(crearDatosAInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        panelCrearDatosLayout.setVerticalGroup(
            panelCrearDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCrearDatosLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelCrearDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCrearCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCrearEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 252, Short.MAX_VALUE)
                .addGroup(panelCrearDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCrearDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonCrearPago, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonCrearServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(crearDatosAInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(panelCrearDatos, gridBagConstraints);

        panelEditarDatos.setPreferredSize(new java.awt.Dimension(1100, 610));

        editarDatosAInicio.setText("Inicio");
        editarDatosAInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarDatosAInicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelEditarDatosLayout = new javax.swing.GroupLayout(panelEditarDatos);
        panelEditarDatos.setLayout(panelEditarDatosLayout);
        panelEditarDatosLayout.setHorizontalGroup(
            panelEditarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEditarDatosLayout.createSequentialGroup()
                .addGroup(panelEditarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEditarDatosLayout.createSequentialGroup()
                        .addGap(964, 964, 964)
                        .addComponent(editarDatosAInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelEditarDatosLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(panelEditarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboBoxEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField1)
                            .addComponent(textField2)
                            .addComponent(textField3)
                            .addComponent(textField4, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        panelEditarDatosLayout.setVerticalGroup(
            panelEditarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEditarDatosLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(comboBoxEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(textField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(textField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(textField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                .addComponent(editarDatosAInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(panelEditarDatos, gridBagConstraints);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Adelantado");

        jtfAdelantado.setText("0");
        jtfAdelantado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfAdelantadoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CITAS");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Servicio");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Cliente");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Empleado");

        jtfTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTelefonoActionPerformed(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Telefono");

        jcbHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "11", "12", "13", "14", "15", "16", "17", "18", "19" }));

        jcbMinuto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "15", "30", "45" }));

        buscarClientebotn.setText("Buscar");
        buscarClientebotn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarClientebotnActionPerformed(evt);
            }
        });

        GuardarCitabtn.setText("Guardar cita");
        GuardarCitabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarCitabtnActionPerformed(evt);
            }
        });

        botonCitasAInicio.setText("Inicio");
        botonCitasAInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCitasAInicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCitasLayout = new javax.swing.GroupLayout(panelCitas);
        panelCitas.setLayout(panelCitasLayout);
        panelCitasLayout.setHorizontalGroup(
            panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCitasLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCitasLayout.createSequentialGroup()
                        .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCitasLayout.createSequentialGroup()
                                .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jcbServicios, 0, 243, Short.MAX_VALUE)
                                        .addComponent(jcbEmpleado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jcbCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jtfAdelantado))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelCitasLayout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jtfTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)))
                            .addGroup(panelCitasLayout.createSequentialGroup()
                                .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelCitasLayout.createSequentialGroup()
                                        .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jcbHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jcbMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 202, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(buscarClientebotn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(440, 440, 440))
                    .addGroup(panelCitasLayout.createSequentialGroup()
                        .addComponent(GuardarCitabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonCitasAInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))))
            .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelCitasLayout.createSequentialGroup()
                    .addGap(186, 186, 186)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(380, Short.MAX_VALUE)))
        );
        panelCitasLayout.setVerticalGroup(
            panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCitasLayout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jcbHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jcbMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcbEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarClientebotn))
                .addGap(35, 35, 35)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbServicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfAdelantado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GuardarCitabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCitasAInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
            .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelCitasLayout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(519, Short.MAX_VALUE)))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(panelCitas, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents
//Este metodo nos ayuda a facilitar el cambio de paneles
    private void cambioPanel(int i) {
        panelEditarDatos.setVisible(false);
        panelCrearDatos.setVisible(false);
        panelInicio.setVisible(false);
        panelCitas.setVisible(false);
        switch(i){
            case 0 -> panelInicio.setVisible(true);
            case 1 -> panelCrearDatos.setVisible(true);
            case 2 -> panelEditarDatos.setVisible(true);
            case 3 -> panelCitas.setVisible(true);
        }
    }
//Cambia de panel Inicio a Nueva Cita
    private void inicioANuevaCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioANuevaCitaActionPerformed
//       int seleccion = JOptionPane.showConfirmDialog(null, "¿Es un cliente nuevo?","Selecciona", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null);
//        if (seleccion == JOptionPane.YES_OPTION) {
//            try{
//                control.clienteNuevo();
//            }catch(Exception ex){
//                JOptionPane.showMessageDialog(null, "Ocurrio un accidente intentelo mas tarde");
//                
//            }
//        }else{
//        }
//        Cliente cliente = (Cliente)JOptionPane.showInputDialog(null, "Selecciona el Cliente", "Clientes",
//                JOptionPane.PLAIN_MESSAGE, null, control.traerListaClientes().toArray(), null);
//        Empleado empleaado = (Empleado)JOptionPane.showInputDialog(null, "Selecciona el Empleado", "Empleado",
//                JOptionPane.PLAIN_MESSAGE, null, control.traerListaEmpleados().toArray(), null);
//        Servicio servicio = (Servicio) JOptionPane.showInputDialog(null, "Selecciona el servicio a usar", "Servicios",
//                JOptionPane.PLAIN_MESSAGE, null, control.traerListaServicios().toArray(), null);
//        control.crearPago(new Pago(Double.parseDouble(JOptionPane.showInputDialog("¿Deja un adelanto?")), servicio.getPrecio()));
//        control.pagoNuevo();
//        control.crearCita(new Cita());
    cambioPanel(3);
    for(Empleado listE : control.traerListaEmpleados()){
        jcbEmpleado.addItem(listE);
    }
    for(Cliente listC : control.traerListaClientes()){
        jcbCliente.addItem(listC);
    }
    for(Servicio listS : control.traerListaServicios()){
        jcbServicios.addItem(listS);
    }


        
        
    }//GEN-LAST:event_inicioANuevaCitaActionPerformed

//Nos cambia de panel Inicio a Creacion
    //listo
    private void inicioACrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioACrearActionPerformed
        cambioPanel(1);
    }//GEN-LAST:event_inicioACrearActionPerformed
//Nos muestra una lista que hace que eliminemos alguna cita
    private void botonEliminarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarCitaActionPerformed
        /*
        FALTA
        VER LAS CITAS QUE NO ESTAN PAGADAS PARA PODER ESCOGER UNA Y ELIMINAR
        PONER BOTON DE ESTAS SEGURO?
        */
    }//GEN-LAST:event_botonEliminarCitaActionPerformed
//Nos cambia de Inicio a Editar
    private void inicioAEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioAEditarActionPerformed
        /*
        FALTA
        LA COLOCACION DE COMPONENTES
        COLOCAR LOS CAMBIOS DE CADA UNO
         */
        ArrayList list = null;
        String[] opciones = {"Cliente", "Empleado", "Pago", "Servicio"};
        int resultado = JOptionPane.showOptionDialog(null, "¿Que quieres editar?", "Elige...", 0, JOptionPane.QUESTION_MESSAGE, null, opciones, EXIT_ON_CLOSE);
        switch (resultado) {
            case 0 ->
                list = new ArrayList<Cliente>(control.traerListaClientes());
            case 1 ->
                list = new ArrayList<Empleado>(control.traerListaEmpleados());
            case 2 ->
                list = new ArrayList<Pago>(control.traerListaPagos());
            case 3 ->
                list = new ArrayList<Servicio>(control.traerListaServicios());
        }
        for (Object objetosLista : list) {
            comboBoxEditar.addItem(objetosLista.toString());
        }
    cambioPanel(2);

    }//GEN-LAST:event_inicioAEditarActionPerformed
//Nos cambia de Inicio a Editar Cita
    private void inicioAEditarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioAEditarCitaActionPerformed
        /*
        FALTA LA CREACION DEL PANEL
        AGREGAR COMPONENTES
        COLOCAR LA SELECCION DE LA CITA
        COLOCAR LA EDICION
         */
        String cita = (JOptionPane.showInputDialog(null, "Selecciona la cita a editar", "Citas",
                JOptionPane.PLAIN_MESSAGE, null, control.traerListaCitas().toArray(), inicioAEditarCita)).toString();
        System.out.println(cita);
    }//GEN-LAST:event_inicioAEditarCitaActionPerformed
//Nos muestra una factura semanal
    private void botonMostrarFacturaSemanalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMostrarFacturaSemanalActionPerformed
        /*
        FALTA 
        LA CREACION DE LA FACTURA Y LA OBTENCION DE LOS DATOS
         */
    }//GEN-LAST:event_botonMostrarFacturaSemanalActionPerformed
//Nos muestra una opcion para cobrar 
    private void botonCobrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCobrarActionPerformed
        /*
        FALTA
        LA OBTENCION DE LOS DATOS LOS CUALES NO HAN SIDO PAGADOS
        EFECTUAR EL PAGO
         */
    }//GEN-LAST:event_botonCobrarActionPerformed
//Cambia los datos del empleado actual al seleccionado
    private void botonCambioEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCambioEmpleadoActionPerformed
        /*
        FALTA LA OBTENCION DE LOS DATOS Y EL ORDEN DE ESTOS PARA COLOCARLOS
        EL CAMBIO DE UN EMPLEADO A OTRO
        LA ELECCION DEL EMPLEADO QUE SE QUIERA VER
         */
    }//GEN-LAST:event_botonCambioEmpleadoActionPerformed
//Crea o muestra los datos de un cliente vip y cuantas compras lleva
    private void botonVipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVipActionPerformed
        /*
        FALTA LA CREACION DONDE SE DA A ESCOGER SI CREAR O MOSTRAR LOS DATOS DEL CLIENTE
        LA OBTENCION DE LOS DATOS DEL CLIENTE
         */


    }//GEN-LAST:event_botonVipActionPerformed
//Crea un pago nuevo
    //listo
    private void botonCrearPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearPagoActionPerformed
        try{
            control.pagoNuevo();
            JOptionPane.showMessageDialog(null, "Se ha creado con exito");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Ocurrio un error, intentelo mas tarde");
        }

    }//GEN-LAST:event_botonCrearPagoActionPerformed
//Nos cambia de panel Crear a Inicio
    //listo
    private void crearDatosAInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearDatosAInicioActionPerformed
        cambioPanel(0);
    }//GEN-LAST:event_crearDatosAInicioActionPerformed
//Crea un servicio nuevo
    //listo
    private void botonCrearServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearServicioActionPerformed
        try{
            control.servicioNuevo();
            JOptionPane.showMessageDialog(null, "Se ha creado con exito");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Ocurrio un error, intentelo mas tarde");
        }
    }//GEN-LAST:event_botonCrearServicioActionPerformed
//Nos cambia de panel Editar a Inicio
    //listo
    private void editarDatosAInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarDatosAInicioActionPerformed
        cambioPanel(0);
    }//GEN-LAST:event_editarDatosAInicioActionPerformed
//Crea un cliente nuevo
    //listo
    private void botonCrearClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearClienteActionPerformed
        try{
            control.clienteNuevo();
            JOptionPane.showMessageDialog(null, "Se ha creado con exito");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Ocurrio un error, intentelo mas tarde");
        }
    }//GEN-LAST:event_botonCrearClienteActionPerformed
//Crea un empleado nuevo
    //listo
    private void botonCrearEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearEmpleadoActionPerformed
        try{
            control.empleadoNuevo();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Ocurrio un error, intentelo mas tarde");
        }
    }//GEN-LAST:event_botonCrearEmpleadoActionPerformed

    private void jtfAdelantadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfAdelantadoActionPerformed

    }//GEN-LAST:event_jtfAdelantadoActionPerformed

    private void jtfTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfTelefonoActionPerformed
//Este boton nos ayuda a buscar un cliente en la base de datos mediante su telefono
    private void buscarClientebotnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarClientebotnActionPerformed

    }//GEN-LAST:event_buscarClientebotnActionPerformed

    private void GuardarCitabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarCitabtnActionPerformed
//        int año = jdcFecha.getCalendar().get(Calendar.YEAR);
//        int mes = jdcFecha.getCalendar().get(Calendar.MONTH);
//        int dia = jdcFecha.getCalendar().get(Calendar.DAY_OF_MONTH);
        Servicio servicio = (Servicio)jcbServicios.getSelectedItem();
        Pago pago = new Pago(Double.parseDouble(jtfAdelantado.getText()), servicio.getPrecio());
         Empleado empleado = (Empleado)jcbEmpleado.getSelectedItem();
        Cliente cliente = (Cliente)jcbCliente.getSelectedItem();
    
        control.crearCita(new Cita(empleado, servicio, cliente, pago, new Date()));
    }//GEN-LAST:event_GuardarCitabtnActionPerformed

    private void botonCitasAInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCitasAInicioActionPerformed
cambioPanel(0);
    }//GEN-LAST:event_botonCitasAInicioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GuardarCitabtn;
    private javax.swing.JButton botonCambioEmpleado;
    private javax.swing.JButton botonCitasAInicio;
    private javax.swing.JButton botonCobrar;
    private javax.swing.JButton botonCrearCliente;
    private javax.swing.JButton botonCrearEmpleado;
    private javax.swing.JButton botonCrearPago;
    private javax.swing.JButton botonCrearServicio;
    private javax.swing.JButton botonEliminarCita;
    private javax.swing.JButton botonMostrarFacturaSemanal;
    private javax.swing.JButton botonVip;
    private javax.swing.JButton buscarClientebotn;
    private javax.swing.JComboBox<String> comboBoxEditar;
    private javax.swing.JButton crearDatosAInicio;
    private javax.swing.JButton editarDatosAInicio;
    private javax.swing.JButton inicioACrear;
    private javax.swing.JButton inicioAEditar;
    private javax.swing.JButton inicioAEditarCita;
    private javax.swing.JButton inicioANuevaCita;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JComboBox<Cliente> jcbCliente;
    private javax.swing.JComboBox<Empleado> jcbEmpleado;
    private javax.swing.JComboBox<String> jcbHora;
    private javax.swing.JComboBox<String> jcbMinuto;
    private javax.swing.JComboBox<Servicio> jcbServicios;
    private com.toedter.calendar.JDateChooser jdcFecha;
    private javax.swing.JTextField jtfAdelantado;
    private javax.swing.JTextField jtfTelefono;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label10;
    private javax.swing.JLabel label11;
    private javax.swing.JLabel label12;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label6;
    private javax.swing.JLabel label7;
    private javax.swing.JLabel labelDomingo;
    private javax.swing.JLabel labelJueves;
    private javax.swing.JLabel labelLunes;
    private javax.swing.JLabel labelMartes;
    private javax.swing.JLabel labelMiercoles;
    private javax.swing.JLabel labelSabado;
    private javax.swing.JLabel labelViernes;
    private javax.swing.JPanel panelCitas;
    private javax.swing.JPanel panelCrearDatos;
    private javax.swing.JPanel panelDomingo;
    private javax.swing.JPanel panelEditarDatos;
    private javax.swing.JPanel panelInicio;
    private javax.swing.JPanel panelJueves;
    private javax.swing.JPanel panelLunes;
    private javax.swing.JPanel panelMartes;
    private javax.swing.JPanel panelMiercoles;
    private javax.swing.JPanel panelSabado;
    private javax.swing.JPanel panelViernes;
    private javax.swing.JTextField textField1;
    private javax.swing.JTextField textField2;
    private javax.swing.JTextField textField3;
    private javax.swing.JTextField textField4;
    // End of variables declaration//GEN-END:variables
}
