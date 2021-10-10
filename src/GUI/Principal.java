package GUI;

import Funciones.Conexion;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
 

public class Principal extends javax.swing.JFrame {
 
   
    public Principal() {
        initComponents();
       
        Conexion conectar = new Conexion();
        conectar.conexion();
        setLocationRelativeTo(null);
        this.setVisible(true);
        this.setExtendedState(MAXIMIZED_BOTH);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize(); 
        this.setSize(d.width, d.height-30);//<---take 30 off the height 
        Rectangle r = new Rectangle(0,0,d.width, d.height-30);
        this.setMaximizedBounds(r);
         
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        escritorio = new javax.swing.JDesktopPane();
        jLabel7 = new javax.swing.JLabel();
        btnNuevaNota = new javax.swing.JButton();
        btnClient = new javax.swing.JButton();
        btnCalc = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        btnAbout = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        btnCalc1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        escritorio.setDoubleBuffered(true);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1162, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jLabel7.setBackground(new java.awt.Color(0, 255, 0));
        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel7.setText("Notas");

        btnNuevaNota.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnNuevaNota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/icons8_Note_30px_2.png"))); // NOI18N
        btnNuevaNota.setText("    Nueva Nota");
        btnNuevaNota.setToolTipText("");
        btnNuevaNota.setContentAreaFilled(false);
        btnNuevaNota.setHideActionText(true);
        btnNuevaNota.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNuevaNota.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnNuevaNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaNotaActionPerformed(evt);
            }
        });

        btnClient.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/icons8_Group_30px_1.png"))); // NOI18N
        btnClient.setText("     Clientes");
        btnClient.setContentAreaFilled(false);
        btnClient.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnClient.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientActionPerformed(evt);
            }
        });

        btnCalc.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnCalc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/icons8_Math_30px_1.png"))); // NOI18N
        btnCalc.setText("    Calculadoras");
        btnCalc.setContentAreaFilled(false);
        btnCalc.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcActionPerformed(evt);
            }
        });

        btnAbout.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/icons8_Info_30px_1.png"))); // NOI18N
        btnAbout.setText("Acerca de");
        btnAbout.setContentAreaFilled(false);
        btnAbout.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutActionPerformed(evt);
            }
        });

        btnCalc1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnCalc1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/icons8_Shutdown_30px_1.png"))); // NOI18N
        btnCalc1.setText("    Salir");
        btnCalc1.setContentAreaFilled(false);
        btnCalc1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCalc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalc1ActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnCalc1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAbout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                            .addComponent(btnClient, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnNuevaNota, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btnNuevaNota, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnClient, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnCalc1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(116, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
       Conexion con = new Conexion();
       con.cerrarConexion();
    }//GEN-LAST:event_formWindowClosed

    private void btnCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcActionPerformed
        IntCalculadoras nn = new IntCalculadoras();;
        escritorio.add(nn);
        nn.setVisible(true);
        btnCalc.setEnabled(false);
    }//GEN-LAST:event_btnCalcActionPerformed

    private void btnClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientActionPerformed
        IntClientes clientes = new IntClientes();;
        escritorio.add(clientes);
        clientes.setVisible(true);
        btnClient.setEnabled(false);
    }//GEN-LAST:event_btnClientActionPerformed

    private void btnNuevaNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaNotaActionPerformed
        IntCrearNota intCrearNota = new IntCrearNota();
        escritorio.add(intCrearNota);
        intCrearNota.setVisible(true);
        btnNuevaNota.setEnabled(false);
    }//GEN-LAST:event_btnNuevaNotaActionPerformed

    private void btnCalc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalc1ActionPerformed
        
       int opcion = JOptionPane.showConfirmDialog(null, "Realmente Deseas Salir ?");
       if(opcion ==0){
           dispose();
       }
    }//GEN-LAST:event_btnCalc1ActionPerformed

    private void btnAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutActionPerformed
        // TODO add your handling code here:
        IntAbout about = new IntAbout();
        escritorio.add(about);
        about.setVisible(true);
        btnAbout.setEnabled(false);
        
    }//GEN-LAST:event_btnAboutActionPerformed

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
         /*for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                   javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    
                }
            }*/
             //UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
             //UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
              //UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");
               //UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
               // UIManager.setLookAndFeel("com.jtattoo.plaf.luna.LunaLookAndFeel");
               //UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
                //UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
                // UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
                  UIManager.setLookAndFeel("com.jtattoo.plaf.aero.AeroLookAndFeel");
              //SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.BusinessBlackSteelSkin");
             //UIManager.setLookAndFeel(new SyntheticaBlackEyeLookAndFeel());
                
           
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error grafico");
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnAbout;
    public static javax.swing.JButton btnCalc;
    public static javax.swing.JButton btnCalc1;
    public static javax.swing.JButton btnClient;
    public static javax.swing.JButton btnNuevaNota;
    public static javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    // End of variables declaration//GEN-END:variables
}
