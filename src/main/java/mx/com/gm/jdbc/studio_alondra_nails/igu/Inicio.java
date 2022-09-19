package mx.com.gm.jdbc.studio_alondra_nails.igu;

import javax.swing.*;
import mx.com.gm.jdbc.studio_alondra_nails.logica.*;
/*
FALTA EL MOSTRAR LOS DATOS EN LOS PANELES DE LAS CITAS

*/
public class Inicio extends javax.swing.JFrame {

    ControladoraLogica control = new ControladoraLogica();

    public Inicio() {
        initComponents();
        panelNuevaCita.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panelInicio = new javax.swing.JPanel();
        nuevaCitaCambioPanel = new javax.swing.JButton();
        botonEditarCita = new javax.swing.JButton();
        botonCambioEmpleado = new javax.swing.JButton();
        botonVip = new javax.swing.JButton();
        botonMostrarFacturaMensual = new javax.swing.JButton();
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
        botonCambioPanelCreacion = new javax.swing.JButton();
        botonCambioPanelEdicion = new javax.swing.JButton();
        botonMostrarFacturaSemanal = new javax.swing.JButton();
        panelNuevaCita = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(100, 100));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        panelInicio.setMinimumSize(new java.awt.Dimension(104, 300));
        panelInicio.setPreferredSize(new java.awt.Dimension(1100, 610));
        panelInicio.setLayout(new java.awt.GridBagLayout());

        nuevaCitaCambioPanel.setText("Nueva cita");
        nuevaCitaCambioPanel.setAlignmentY(0);
        nuevaCitaCambioPanel.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nuevaCitaCambioPanel.setMaximumSize(new java.awt.Dimension(111, 30));
        nuevaCitaCambioPanel.setMinimumSize(new java.awt.Dimension(111, 30));
        nuevaCitaCambioPanel.setPreferredSize(new java.awt.Dimension(111, 30));
        nuevaCitaCambioPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevaCitaCambioPanelActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 7, 0, 7);
        panelInicio.add(nuevaCitaCambioPanel, gridBagConstraints);

        botonEditarCita.setText("Editar cita");
        botonEditarCita.setMargin(new java.awt.Insets(0, 0, 0, 0));
        botonEditarCita.setMaximumSize(new java.awt.Dimension(111, 30));
        botonEditarCita.setMinimumSize(new java.awt.Dimension(111, 30));
        botonEditarCita.setPreferredSize(new java.awt.Dimension(111, 30));
        botonEditarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarCitaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 7, 0, 7);
        panelInicio.add(botonEditarCita, gridBagConstraints);

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

        botonMostrarFacturaMensual.setText("Mensual");
        botonMostrarFacturaMensual.setMargin(new java.awt.Insets(0, 0, 0, 0));
        botonMostrarFacturaMensual.setMaximumSize(new java.awt.Dimension(111, 30));
        botonMostrarFacturaMensual.setMinimumSize(new java.awt.Dimension(111, 30));
        botonMostrarFacturaMensual.setPreferredSize(new java.awt.Dimension(111, 30));
        botonMostrarFacturaMensual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMostrarFacturaMensualActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 27;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 7, 0, 7);
        panelInicio.add(botonMostrarFacturaMensual, gridBagConstraints);

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

        botonCambioPanelCreacion.setText("Crear");
        botonCambioPanelCreacion.setMargin(new java.awt.Insets(0, 0, 0, 0));
        botonCambioPanelCreacion.setMaximumSize(new java.awt.Dimension(111, 30));
        botonCambioPanelCreacion.setMinimumSize(new java.awt.Dimension(111, 30));
        botonCambioPanelCreacion.setPreferredSize(new java.awt.Dimension(111, 30));
        botonCambioPanelCreacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCambioPanelCreacionActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 7, 0, 7);
        panelInicio.add(botonCambioPanelCreacion, gridBagConstraints);

        botonCambioPanelEdicion.setText("Editar");
        botonCambioPanelEdicion.setMargin(new java.awt.Insets(0, 0, 0, 0));
        botonCambioPanelEdicion.setMaximumSize(new java.awt.Dimension(111, 30));
        botonCambioPanelEdicion.setMinimumSize(new java.awt.Dimension(111, 30));
        botonCambioPanelEdicion.setPreferredSize(new java.awt.Dimension(111, 30));
        botonCambioPanelEdicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCambioPanelEdicionActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 19;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 7, 0, 7);
        panelInicio.add(botonCambioPanelEdicion, gridBagConstraints);

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
        getContentPane().add(panelInicio, gridBagConstraints);

        jButton6.setText("InicioBack");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelNuevaCitaLayout = new javax.swing.GroupLayout(panelNuevaCita);
        panelNuevaCita.setLayout(panelNuevaCitaLayout);
        panelNuevaCitaLayout.setHorizontalGroup(
            panelNuevaCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1100, Short.MAX_VALUE)
            .addGroup(panelNuevaCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNuevaCitaLayout.createSequentialGroup()
                    .addContainerGap(389, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(513, Short.MAX_VALUE)))
        );
        panelNuevaCitaLayout.setVerticalGroup(
            panelNuevaCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
            .addGroup(panelNuevaCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNuevaCitaLayout.createSequentialGroup()
                    .addContainerGap(246, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(294, Short.MAX_VALUE)))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(panelNuevaCita, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nuevaCitaCambioPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevaCitaCambioPanelActionPerformed
        //Cambia de panel para la creacion de una nueva cita
        /*
        FALTAN LOS COMPONENTES PARA CREAR LA NUEVA CITA
         */
        panelInicio.setVisible(false);
        panelNuevaCita.setVisible(true);


    }//GEN-LAST:event_nuevaCitaCambioPanelActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        //Cambia de panel para volver al inicio
        panelNuevaCita.setVisible(false);
        panelInicio.setVisible(true);


    }//GEN-LAST:event_jButton6ActionPerformed

    private void botonCambioPanelCreacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCambioPanelCreacionActionPerformed
        //Nos cambia de panel para la creacion de cualquier servicio o cliente en la base de datos
        try {
            control.ServicioNuevo();
            JOptionPane.showMessageDialog(this, "Se ha guardado con exito");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error, intentelo mas tarde");
        }

    }//GEN-LAST:event_botonCambioPanelCreacionActionPerformed

    private void botonEliminarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarCitaActionPerformed
        //Nos muestra una lista que hace que eliminemos alguna cita
        int id = Integer.parseInt(JOptionPane.showInputDialog("¿Cual es el id de la cita a eliminar?"));
        control.eliminarCita(id);
    }//GEN-LAST:event_botonEliminarCitaActionPerformed

    private void botonCambioPanelEdicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCambioPanelEdicionActionPerformed
        //Nos cambia a un panel para editar cualquier cosa de la base de datos
        /*
        FALTA
        EL CAMBIO DE PANEL
        LA COLOCACION DE COMPONENTES
        COLOCAR LOS CAMBIOS DE CADA UNO
        */
        String servicio = (JOptionPane.showInputDialog(null, "Selecciona el servicio a editar", "Servicios",
                JOptionPane.PLAIN_MESSAGE, null, control.traerListaServicios().toArray(), botonEditarCita)).toString();
        System.out.println(servicio);
    }//GEN-LAST:event_botonCambioPanelEdicionActionPerformed

    private void botonEditarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarCitaActionPerformed
        //Nos cambia a un panel para editar citas
        /*
        FALTA LA CREACION DEL PANEL
        AGREGAR COMPONENTES
        COLOCAR LA SELECCION DE LA CITA
        COLOCAR LA EDICION
        */
        
        String cita = (JOptionPane.showInputDialog(null, "Selecciona la cita a editar", "Citas",
                JOptionPane.PLAIN_MESSAGE, null, control.traerListaCitas().toArray(), botonEditarCita)).toString();
        System.out.println(cita);

    }//GEN-LAST:event_botonEditarCitaActionPerformed

    private void botonMostrarFacturaSemanalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMostrarFacturaSemanalActionPerformed
        //Nos muestra una factura semanal
        /*
        FALTA 
        LA CREACION DE LA FACTURA Y LA OBTENCION DE LOS DATOS
        */
    }//GEN-LAST:event_botonMostrarFacturaSemanalActionPerformed

    private void botonMostrarFacturaMensualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMostrarFacturaMensualActionPerformed
        //Nos muestra una factura mensual
        /*
        FALTA
        LA CREACION DE LA FACTURA Y LA OBTENCION DE LOS DATOS
        */
    }//GEN-LAST:event_botonMostrarFacturaMensualActionPerformed

    private void botonCambioEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCambioEmpleadoActionPerformed
        //Cambia los datos del empleado actual al seleccionado
        /*
        FALTA LA OBTENCION DE LOS DATOS Y EL ORDEN DE ESTOS PARA COLOCARLOS
        EL CAMBIO DE UN EMPLEADO A OTRO
        LA ELECCION DEL EMPLEADO QUE SE QUIERA VER
        */
    }//GEN-LAST:event_botonCambioEmpleadoActionPerformed

    private void botonVipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVipActionPerformed
        //Crea o muestra los datos de un cliente vip y cuantas compras lleva
        /*
        FALTA LA CREACION DONDE SE DA A ESCOGER SI CREAR O MOSTRAR LOS DATOS DEL CLIENTE
        LA OBTENCION DE LOS DATOS DEL CLIENTE
        */
        
        
    }//GEN-LAST:event_botonVipActionPerformed

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
    private javax.swing.JButton botonCambioEmpleado;
    private javax.swing.JButton botonCambioPanelCreacion;
    private javax.swing.JButton botonCambioPanelEdicion;
    private javax.swing.JButton botonEditarCita;
    private javax.swing.JButton botonEliminarCita;
    private javax.swing.JButton botonMostrarFacturaMensual;
    private javax.swing.JButton botonMostrarFacturaSemanal;
    private javax.swing.JButton botonVip;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JButton nuevaCitaCambioPanel;
    private javax.swing.JPanel panelDomingo;
    private javax.swing.JPanel panelInicio;
    private javax.swing.JPanel panelJueves;
    private javax.swing.JPanel panelLunes;
    private javax.swing.JPanel panelMartes;
    private javax.swing.JPanel panelMiercoles;
    private javax.swing.JPanel panelNuevaCita;
    private javax.swing.JPanel panelSabado;
    private javax.swing.JPanel panelViernes;
    // End of variables declaration//GEN-END:variables
}
