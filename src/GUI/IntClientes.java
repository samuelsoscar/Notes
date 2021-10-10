/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Funciones.Operaciones;
import com.toedter.calendar.JTextFieldDateEditor;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Oskr
 */
public class IntClientes extends javax.swing.JInternalFrame {
   
     Operaciones operaciones = new Operaciones();
     
    public IntClientes() {
        initComponents();  
          tabla.setDefaultEditor(Object.class, null); // EVITA LA EDICION DE LA TABLA
          String [] encabezados ={"ID_CLIENTE","FECHA","NOMBRE CLIENTE","PRODUCTO","ESTADO NOTA",};
          DefaultTableModel modelo = new DefaultTableModel(encabezados,0);
          tabla.setModel(modelo);
          
          operaciones.consultarClientes(modelo); //Llena la tabla
          
          JTextFieldDateEditor editor = (JTextFieldDateEditor) CalendarioC.getDateEditor();
          CalendarioC.getDateEditor();
          editor.setEditable(false); // Hace el calendario no editable
          
          ((DefaultTableCellRenderer)tabla.getTableHeader().getDefaultRenderer())
          .setHorizontalAlignment(JLabel.RIGHT);  
          
//          DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
//          dtcr.setHorizontalTextPosition(DefaultTableCellRenderer.CENTER); 
      
        for(int i=0;i<5;i++){
        TableColumn col = tabla.getColumnModel().getColumn(i); 
        DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();  
        dtcr.setHorizontalAlignment(SwingConstants.CENTER);
        col.setCellRenderer(dtcr);
        }
        

        tabla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tabla.getColumnModel().getColumn(0).setPreferredWidth(75);
        tabla.getColumnModel().getColumn(1).setPreferredWidth(130); 
        tabla.getColumnModel().getColumn(2).setPreferredWidth(450); 
        tabla.getColumnModel().getColumn(3).setPreferredWidth(250); 
        tabla.getColumnModel().getColumn(4).setPreferredWidth(110); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        tab = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        txtBusqueda = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        selector = new javax.swing.JCheckBox();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombreC = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtNotasC = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtDireccionC = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        txtCorreoC = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtCotizacionC = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        txtTipoProductoC = new javax.swing.JTextField();
        estadoEfectivox = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtMontoCancelado = new javax.swing.JFormattedTextField();
        txtOtroTelefonoC = new javax.swing.JTextField();
        txtTelPrincipalC = new javax.swing.JTextField();
        txtCedulaFisicaC = new javax.swing.JTextField();
        txtExtt1 = new javax.swing.JTextField();
        txtCedulaJuridicaC = new javax.swing.JTextField();
        txtExtt2 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        CalendarioC = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();

        jPanel4.setBackground(new java.awt.Color(51, 0, 51));
        jPanel4.setForeground(new java.awt.Color(153, 0, 204));

        jButton2.setText("jButton2");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(369, 369, 369)
                .addComponent(jButton2)
                .addContainerGap(479, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(jButton2)
                .addContainerGap(258, Short.MAX_VALUE))
        );

        setClosable(true);
        setIconifiable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        tab.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        txtBusqueda.setBackground(new java.awt.Color(236, 236, 236));
        txtBusqueda.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtBusqueda.setBorder(null);
        txtBusqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtBusquedaMouseEntered(evt);
            }
        });
        txtBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBusquedaKeyTyped(evt);
            }
        });

        tabla.setAutoCreateRowSorter(true);
        tabla.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabla.setDragEnabled(true);
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/icons8_Search_25px_1.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);

        btnEliminar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/icons8_Delete_User_Male_30px_1.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorderPainted(false);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/icons8_Edit_Account_30px_1.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setBorderPainted(false);
        btnModificar.setContentAreaFilled(false);
        btnModificar.setEnabled(false);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnActualizar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/icons8_Available_Updates_30px_1.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.setBorderPainted(false);
        btnActualizar.setContentAreaFilled(false);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        selector.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        selector.setText("Pendiente");
        selector.setContentAreaFilled(false);
        selector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(selector)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                            .addComponent(jSeparator3))
                        .addGap(76, 76, 76)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(btnActualizar)
                        .addGap(0, 326, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(selector)
                            .addComponent(btnModificar)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnActualizar))))
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab.addTab("Notas", jPanel1);

        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setText("Nombre");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setText("Teléfono");

        txtNombreC.setEditable(false);
        txtNombreC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtNombreC.setCaretColor(new java.awt.Color(0, 255, 0));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setText("Cedula Física");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setText("Otro");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel8.setText("Cedula Jurídica");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel9.setText("Notas");

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel10.setText("Dirección");

        txtNotasC.setEditable(false);
        txtNotasC.setColumns(20);
        txtNotasC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtNotasC.setLineWrap(true);
        txtNotasC.setRows(5);
        txtNotasC.setWrapStyleWord(true);
        jScrollPane2.setViewportView(txtNotasC);

        txtDireccionC.setEditable(false);
        txtDireccionC.setColumns(20);
        txtDireccionC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtDireccionC.setLineWrap(true);
        txtDireccionC.setRows(5);
        txtDireccionC.setWrapStyleWord(true);
        jScrollPane3.setViewportView(txtDireccionC);

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel12.setText("Correo");

        txtCorreoC.setEditable(false);
        txtCorreoC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel13.setText("N. Cotización");

        txtCotizacionC.setEditable(false);
        txtCotizacionC.setColumns(20);
        txtCotizacionC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCotizacionC.setLineWrap(true);
        txtCotizacionC.setRows(5);
        jScrollPane4.setViewportView(txtCotizacionC);

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel14.setText("Producto");

        txtTipoProductoC.setEditable(false);
        txtTipoProductoC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        estadoEfectivox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        estadoEfectivox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin Cancelar", "Adelanto", "Cancelado" }));
        estadoEfectivox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoEfectivoxActionPerformed(evt);
            }
        });

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel15.setText("Estado");

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel16.setText("Monto");

        txtMontoCancelado.setEditable(false);
        txtMontoCancelado.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtMontoCancelado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txtOtroTelefonoC.setEditable(false);
        txtOtroTelefonoC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txtTelPrincipalC.setEditable(false);
        txtTelPrincipalC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txtCedulaFisicaC.setEditable(false);
        txtCedulaFisicaC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txtExtt1.setEditable(false);
        txtExtt1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txtCedulaJuridicaC.setEditable(false);
        txtCedulaJuridicaC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txtExtt2.setEditable(false);
        txtExtt2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1)
                        .addGap(50, 50, 50)
                        .addComponent(txtNombreC, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtExtt1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelPrincipalC, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtExtt2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtOtroTelefonoC, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6)
                        .addGap(10, 10, 10)
                        .addComponent(txtCedulaFisicaC, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCedulaJuridicaC, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel12)
                        .addGap(55, 55, 55)
                        .addComponent(txtCorreoC, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel15)
                        .addGap(195, 195, 195)
                        .addComponent(jLabel16)
                        .addGap(10, 10, 10)
                        .addComponent(txtMontoCancelado, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 848, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel9)
                        .addGap(420, 420, 420)
                        .addComponent(jLabel10))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(txtTipoProductoC, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(estadoEfectivox, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(10, 149, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTelPrincipalC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtExtt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel7)
                        .addComponent(txtExtt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtOtroTelefonoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNombreC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCedulaFisicaC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtCedulaJuridicaC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtCorreoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(5, 5, 5))
                    .addComponent(txtTipoProductoC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel13))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMontoCancelado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel16)
                                .addComponent(estadoEfectivox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(15, 15, 15)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(2, 2, 2))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
        );

        tab.addTab("Información", jPanel3);

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel4.setText("Clientes");

        CalendarioC.setForeground(new java.awt.Color(102, 255, 0));
        CalendarioC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel11.setText("Fecha");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(CalendarioC, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tab))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CalendarioC, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tab)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void estadoEfectivoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadoEfectivoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estadoEfectivoxActionPerformed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
         Principal.btnClient.setEnabled(true);
    }//GEN-LAST:event_formInternalFrameClosed

    private void selectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectorActionPerformed
        if(selector.isSelected()){
            operaciones.consultarClientes((DefaultTableModel)tabla.getModel(), "PENDIENTE");
        }
        else{
            operaciones.consultarClientes((DefaultTableModel)tabla.getModel());
        }
    }//GEN-LAST:event_selectorActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        operaciones.consultarClientes((DefaultTableModel) tabla.getModel());
        if(selector.isSelected()){
            operaciones.consultarClientes((DefaultTableModel)tabla.getModel(), "PENDIENTE");
        }

    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        ArrayList <String>datosModificacion = new ArrayList<String>();
        FrameModificacion fm = new FrameModificacion() ;
        fm.setVisible(true);
        fm.setLocationRelativeTo(null);

        int id_cliente = 0; //obtiene el id cliente de la tabla
        int fila = tabla.getSelectedRow();
        id_cliente = (int)tabla.getValueAt(fila,0);
        datosModificacion = operaciones.consultaNota(id_cliente);
        FrameModificacion.labelID.setText(String.valueOf(id_cliente));

        FrameModificacion.txtNombre.setText(datosModificacion.get(1));
        try {
            String fecha = datosModificacion.get(2);
            Date format = new SimpleDateFormat("dd/MM/yyyy").parse(fecha);
            FrameModificacion.txtCalendario.setDate(format);
        } catch (ParseException ex) {
            Logger.getLogger(IntClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        FrameModificacion.txtestadoNota.setSelectedItem(datosModificacion.get(3));
        FrameModificacion.estadoEfectivo.setSelectedItem(datosModificacion.get(4));
        FrameModificacion.txtTelPrincipal.setText(datosModificacion.get(5));
        FrameModificacion.txtOtroTelefono.setText(datosModificacion.get(6));
        FrameModificacion.txtCedulaFisica.setText(datosModificacion.get(7));
        FrameModificacion.txtCedulaJuridica.setText(datosModificacion.get(8));
        FrameModificacion.txtCorreo.setText(datosModificacion.get(9));
        FrameModificacion.txtTipoProducto.setText(datosModificacion.get(10));
        FrameModificacion.txtCotizacion.setText(datosModificacion.get(11));
        FrameModificacion.txtNotas.setText(datosModificacion.get(12));
        FrameModificacion.txtDireccion.setText(datosModificacion.get(13));
        FrameModificacion.txtExt1.setText(datosModificacion.get(14));
        FrameModificacion.txtExt2.setText(datosModificacion.get(15));
        FrameModificacion.txtMontoCancelado.setText(datosModificacion.get(16));
        // btnModificar.setEnabled(false);
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null,"Desea realmente eliminar el usuario ?");
        if (opcion==0) {
            int id_cliente = 0;
            int fila = tabla.getSelectedRow();
            id_cliente = (int)tabla.getValueAt(fila,0);
            operaciones.eliminarCliente(id_cliente);
        }
        if(selector.isSelected()){
            operaciones.consultarClientes((DefaultTableModel)tabla.getModel(), "PENDIENTE");
        }
        else{
            operaciones.consultarClientes((DefaultTableModel)tabla.getModel());
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        btnModificar.setEnabled(true);
        limpiar();
        ArrayList <String>datos = new ArrayList<String>();
        if(evt.getClickCount() ==2)
        {
            int id_cliente = 0;
            int fila = tabla.getSelectedRow();
            id_cliente = (int)tabla.getValueAt(fila,0);
            datos = operaciones.consultaNota(id_cliente);

            txtNombreC.setText(datos.get(1));
            try {
                String fecha = datos.get(2);
                Date format = new SimpleDateFormat("dd/MM/yyyy").parse(fecha);
                CalendarioC.setDate(format);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            tab.setSelectedIndex(1);

            estadoEfectivox.setSelectedItem(datos.get(4));
            txtTelPrincipalC.setText(datos.get(5));
            txtOtroTelefonoC.setText(datos.get(6));
            System.out.println(datos.get(5));
            System.out.println(datos.get(6));
            txtCedulaFisicaC.setText(datos.get(7));
            txtCedulaJuridicaC.setText(datos.get(8));
            txtCorreoC.setText(datos.get(9));
            txtTipoProductoC.setText(datos.get(10));
            txtCotizacionC.setText(datos.get(11));
            txtNotasC.setText(datos.get(12));
            txtDireccionC.setText(datos.get(13));
            txtExtt1.setText(datos.get(14));
            txtExtt2.setText(datos.get(15));
            txtMontoCancelado.setText(datos.get(16));

        }
    }//GEN-LAST:event_tablaMouseClicked

    private void txtBusquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyTyped
        operaciones.consultarClientes((DefaultTableModel)tabla.getModel(), txtBusqueda.getText());
        selector.setSelected(false);
    }//GEN-LAST:event_txtBusquedaKeyTyped

    private void txtBusquedaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBusquedaMouseEntered
        txtBusqueda.requestFocus();
    }//GEN-LAST:event_txtBusquedaMouseEntered
    public void limpiar(){
       txtOtroTelefonoC.setText(null);
       txtOtroTelefonoC.setText(null);
       txtCedulaFisicaC.setText(null);
       txtCedulaJuridicaC.setText(null);
       txtCorreoC.setText(null);
       txtTipoProductoC.setText(null);
       txtCotizacionC.setText(null);
       txtNotasC.setText(null);
       txtDireccionC.setText(null);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser CalendarioC;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    public static javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> estadoEfectivox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JCheckBox selector;
    private javax.swing.JTabbedPane tab;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JTextField txtCedulaFisicaC;
    private javax.swing.JTextField txtCedulaJuridicaC;
    private javax.swing.JTextField txtCorreoC;
    private javax.swing.JTextArea txtCotizacionC;
    private javax.swing.JTextArea txtDireccionC;
    private javax.swing.JTextField txtExtt1;
    private javax.swing.JTextField txtExtt2;
    private javax.swing.JFormattedTextField txtMontoCancelado;
    private javax.swing.JTextField txtNombreC;
    private javax.swing.JTextArea txtNotasC;
    private javax.swing.JTextField txtOtroTelefonoC;
    private javax.swing.JTextField txtTelPrincipalC;
    private javax.swing.JTextField txtTipoProductoC;
    // End of variables declaration//GEN-END:variables
}
