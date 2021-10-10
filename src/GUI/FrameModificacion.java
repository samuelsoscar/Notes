/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Funciones.Operaciones;
import com.sun.glass.events.KeyEvent;
import com.toedter.calendar.JTextFieldDateEditor;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class FrameModificacion extends javax.swing.JFrame {
    
 Operaciones operaciones = new Operaciones();
 
 
    public FrameModificacion() {
        initComponents();
         JTextFieldDateEditor editor = (JTextFieldDateEditor) txtCalendario.getDateEditor();
          txtCalendario.getDateEditor();
          editor.setEditable(false);
          txtMontoCancelado.setText("0");
    }
    public void limpiar (){
     txtNombre.setText(null);
     txtTelPrincipal.setText(null);
     txtOtroTelefono.setText(null);
     txtCedulaFisica.setText(null);
     txtCedulaJuridica.setText(null);
     txtCorreo.setText(null);
     txtTipoProducto.setText(null);
     txtCotizacion.setText(null);
     txtNotas.setText(null);
     txtDireccion.setText(null);
     estadoEfectivo.setSelectedItem("Sin Cancelar");
     txtestadoNota.setSelectedItem("Pendiente");
     txtExt1.setText(null);
     txtExt2.setText(null);
     txtMontoCancelado.setText(null);
}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        labelID = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCalendario = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        txtestadoNota = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtExt1 = new javax.swing.JFormattedTextField();
        txtTelPrincipal = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        txtExt2 = new javax.swing.JFormattedTextField();
        txtOtroTelefono = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCedulaFisica = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCedulaJuridica = new javax.swing.JFormattedTextField();
        txtCorreo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtTipoProducto = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCotizacion = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        estadoEfectivo = new javax.swing.JComboBox<>();
        txtMontoCancelado = new javax.swing.JFormattedTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtNotas = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtDireccion = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel4.setText("Modificación");

        jLabel16.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel16.setText("ID ");

        labelID.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel10.setText("Fecha");

        txtCalendario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel14.setText("Estado");

        txtestadoNota.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtestadoNota.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pendiente", "Procesado" }));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setText("Nombre");

        txtNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setText("Teléfono");

        txtExt1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtExt1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        try {
            txtTelPrincipal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#### ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelPrincipal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setText("Otro");

        txtExt2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtExt2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        try {
            txtOtroTelefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#### ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtOtroTelefono.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setText("Cedula Física");

        try {
            txtCedulaFisica.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("# #### ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCedulaFisica.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setText("Cedula Jurídica");

        try {
            txtCedulaJuridica.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("# ### ######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCedulaJuridica.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txtCorreo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel11.setText("Correo");

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel12.setText("Producto");

        txtTipoProducto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel13.setText("N. Cotización");

        txtCotizacion.setColumns(20);
        txtCotizacion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCotizacion.setLineWrap(true);
        txtCotizacion.setRows(5);
        jScrollPane1.setViewportView(txtCotizacion);

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel15.setText("Estado");

        estadoEfectivo.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        estadoEfectivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin Cancelar", "Adelanto", "Cancelado" }));
        estadoEfectivo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                estadoEfectivoItemStateChanged(evt);
            }
        });

        txtMontoCancelado.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtMontoCancelado.setEnabled(false);
        txtMontoCancelado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtMontoCancelado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMontoCanceladoMouseClicked(evt);
            }
        });

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel17.setText("Monto");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel8.setText("Notas");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel9.setText("Dirección");

        txtNotas.setColumns(20);
        txtNotas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtNotas.setLineWrap(true);
        txtNotas.setRows(5);
        txtNotas.setWrapStyleWord(true);
        jScrollPane2.setViewportView(txtNotas);

        txtDireccion.setColumns(20);
        txtDireccion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtDireccion.setLineWrap(true);
        txtDireccion.setRows(5);
        txtDireccion.setWrapStyleWord(true);
        jScrollPane3.setViewportView(txtDireccion);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/icons8_Save_as_30px_1.png"))); // NOI18N
        jButton1.setText("Guardar Modificaciones");
        jButton1.setContentAreaFilled(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setInheritsPopupMenu(true);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 981, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel14)
                        .addGap(63, 63, 63)
                        .addComponent(txtestadoNota, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel11)
                        .addGap(62, 62, 62)
                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel12)
                        .addGap(47, 47, 47)
                        .addComponent(txtTipoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel13)
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel15)
                        .addGap(60, 60, 60)
                        .addComponent(estadoEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel17)
                        .addGap(10, 10, 10)
                        .addComponent(txtMontoCancelado, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(397, 397, 397)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 872, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(55, 55, 55)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jLabel2)
                                .addGap(10, 10, 10)
                                .addComponent(txtExt1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtTelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(txtExt2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtOtroTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(115, 115, 115))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtCedulaFisica, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(jLabel7)
                                .addGap(17, 17, 17)
                                .addComponent(txtCedulaJuridica, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(381, 381, 381)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(252, 252, 252))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel4)
                .addGap(14, 14, 14)
                .addComponent(jLabel16)
                .addGap(10, 10, 10)
                .addComponent(labelID, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(11, 11, 11)
                .addComponent(txtCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel16)
                    .addComponent(labelID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(txtCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel14))
                    .addComponent(txtestadoNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1))
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtExt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel6))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtExt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtOtroTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel5))
                    .addComponent(txtCedulaFisica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtCedulaJuridica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel12))
                    .addComponent(txtTipoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel13))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(estadoEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMontoCancelado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel17))))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{ 
        int id = Integer.parseInt(labelID.getText());
         String nombreCliente = txtNombre.getText().toUpperCase();
         Date date = txtCalendario.getDate();
         SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
         String fecha=formatter.format(date); // obtiene fecha
         String estadoNota = String.valueOf(txtestadoNota.getSelectedItem());   
         String estado_efectivo = String.valueOf(estadoEfectivo.getSelectedItem());  
         String telefonoP = txtTelPrincipal.getText();
         String otroTelef = txtOtroTelefono.getText();
         String cedulaF = txtCedulaFisica.getText();
         String cedulaJ = txtCedulaJuridica.getText();
         String correo = txtCorreo.getText();
         String producto = txtTipoProducto.getText().toUpperCase();
         String numCoti = txtCotizacion.getText();
         String notas = txtNotas.getText().toUpperCase();
         String direccion = txtDireccion.getText().toUpperCase();
         String Ext1 = txtExt1.getText();
         String Ext2 = txtExt2.getText();
         double montoAd =0;
         montoAd = Double.parseDouble(txtMontoCancelado.getText());  
        
         operaciones.modificarCliente(id,nombreCliente,fecha,estadoNota,estado_efectivo,telefonoP,
                 otroTelef,cedulaF,cedulaJ,correo,producto,numCoti,notas,direccion,Ext1,Ext2,montoAd);
         limpiar();
        }
        catch(Exception e){
        e.printStackTrace();
        JOptionPane.showMessageDialog(null,"Aviso","El campo de monto no puede estar vacío",JOptionPane.WARNING_MESSAGE);
            
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
       IntClientes.btnModificar.setEnabled(true);
    }//GEN-LAST:event_formWindowClosed

    private void estadoEfectivoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_estadoEfectivoItemStateChanged
        if(estadoEfectivo.getSelectedItem()=="Sin Cancelar"){
            txtMontoCancelado.setEnabled(false);
            txtMontoCancelado.setText("0.0");
        }else{
            txtMontoCancelado.setEnabled(true);
        }
    }//GEN-LAST:event_estadoEfectivoItemStateChanged

    private void txtMontoCanceladoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMontoCanceladoMouseClicked
        if(txtMontoCancelado.isEnabled()){
           txtMontoCancelado.setText(null); 
        }
        
    }//GEN-LAST:event_txtMontoCanceladoMouseClicked

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
            java.util.logging.Logger.getLogger(FrameModificacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameModificacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameModificacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameModificacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameModificacion().setVisible(true);
            }
        });
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> estadoEfectivo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public static javax.swing.JLabel labelID;
    public static com.toedter.calendar.JDateChooser txtCalendario;
    public static javax.swing.JFormattedTextField txtCedulaFisica;
    public static javax.swing.JFormattedTextField txtCedulaJuridica;
    public static javax.swing.JTextField txtCorreo;
    public static javax.swing.JTextArea txtCotizacion;
    public static javax.swing.JTextArea txtDireccion;
    public static javax.swing.JFormattedTextField txtExt1;
    public static javax.swing.JFormattedTextField txtExt2;
    public static javax.swing.JFormattedTextField txtMontoCancelado;
    public static javax.swing.JTextField txtNombre;
    public static javax.swing.JTextArea txtNotas;
    public static javax.swing.JFormattedTextField txtOtroTelefono;
    public static javax.swing.JFormattedTextField txtTelPrincipal;
    public static javax.swing.JTextField txtTipoProducto;
    public static javax.swing.JComboBox<String> txtestadoNota;
    // End of variables declaration//GEN-END:variables
}
