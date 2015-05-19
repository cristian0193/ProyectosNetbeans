
package Problema9;

import Problema8.*;

public class Principal extends javax.swing.JFrame {

   
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        cmElectrodomestico = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        txtTrasporte = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtIVA = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtTotalsinIVA = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VENTA DE ELETRODOMESTICOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 30));

        jLabel5.setText("Seleccione el Electrodomestico :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 170, 30));

        txtCantidad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtCantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 70, 30));

        cmElectrodomestico.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "Nevera", "Lavadora", "Calentador", "Aire Acondicionado", "Estufa" }));
        cmElectrodomestico.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmElectrodomesticoItemStateChanged(evt);
            }
        });
        getContentPane().add(cmElectrodomestico, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 60, 130, 29));

        jLabel6.setText("Trasporte :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 60, 30));

        txtTrasporte.setEditable(false);
        getContentPane().add(txtTrasporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 126, 30));

        jLabel7.setText("Cantidad :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 60, 30));

        jLabel8.setText("IVA 20% :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 60, 30));

        txtIVA.setEditable(false);
        getContentPane().add(txtIVA, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 126, 30));

        jLabel9.setText("Total Pagar:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 70, 30));

        txtTotal.setEditable(false);
        getContentPane().add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 126, 30));

        jButton1.setText("CALCULAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, -1, 30));

        jLabel10.setText("Total sin IVA:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 80, 30));

        txtTotalsinIVA.setEditable(false);
        txtTotalsinIVA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalsinIVAActionPerformed(evt);
            }
        });
        getContentPane().add(txtTotalsinIVA, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 126, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmElectrodomesticoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmElectrodomesticoItemStateChanged
        
    }//GEN-LAST:event_cmElectrodomesticoItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
        int cantidad = Integer.parseInt(this.txtCantidad.getText());
        int opcion = (int)this.cmElectrodomestico.getSelectedIndex();
        
        Electrodomesticos obj = new Electrodomesticos();  
        
        obj.CalculoTotal(cantidad, opcion);
        
        this.txtTotalsinIVA.setText(""+obj.getValorTotal());
        this.txtIVA.setText(""+obj.getValorIVA());
        this.txtTotal.setText(""+obj.getValorPagar());
        this.txtTrasporte.setText(""+obj.getTrasporte());
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtTotalsinIVAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalsinIVAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalsinIVAActionPerformed


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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmElectrodomestico;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtIVA;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtTotalsinIVA;
    private javax.swing.JTextField txtTrasporte;
    // End of variables declaration//GEN-END:variables
}
