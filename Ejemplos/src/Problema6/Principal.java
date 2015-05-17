
package Problema6;


public class Principal extends javax.swing.JFrame {

   
    public Principal() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cmbBus = new javax.swing.JComboBox();
        cmbRuta = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMantenimiento = new javax.swing.JTextField();
        txtSalario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtResultadoMantenimineto = new javax.swing.JTextField();
        txtResutadoSalario = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CALCULO DE ESTADISTICAS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, 320, 30));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de Bus")));

        cmbBus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "Corriente", "Ejecutivo" }));

        cmbRuta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "1", "2", "3" }));

        jLabel2.setText("Bus :");

        jLabel3.setText("Ruta :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(cmbBus, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmbBus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(20, 20, 20))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 270, 120));

        jLabel4.setText("Manteniminento :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 90, 20));

        jLabel5.setText("Salario :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 50, 20));

        txtMantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMantenimientoActionPerformed(evt);
            }
        });
        getContentPane().add(txtMantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 170, 30));
        getContentPane().add(txtSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 170, 30));

        jLabel6.setText("Manteniminento :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 90, 20));

        jLabel7.setText("Salario :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 50, 20));

        txtResultadoMantenimineto.setEditable(false);
        txtResultadoMantenimineto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultadoManteniminetoActionPerformed(evt);
            }
        });
        getContentPane().add(txtResultadoMantenimineto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 170, -1));

        txtResutadoSalario.setEditable(false);
        getContentPane().add(txtResutadoSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 170, 20));

        btnCalcular.setText("CALCULAR");
        getContentPane().add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, -1, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMantenimientoActionPerformed
        
        double salario = Double.parseDouble(this.txtSalario.getText());
        double mantenimient = Double.parseDouble(this.txtMantenimiento.getText());
        int opcionBus = (int)this.cmbBus.getSelectedIndex();
        int opcionRuta = (int)this.cmbRuta.getSelectedIndex(); 
        
        Buses obj = new Buses();
        
        obj.CalculoSalarioMantenimiento(opcionBus,opcionRuta,salario,mantenimient);
        
        this.txtResutadoSalario.setText(""+obj.getSalario());
        this.txtResultadoMantenimineto.setText(""+obj.getMantenimiento());
        
    }//GEN-LAST:event_txtMantenimientoActionPerformed

    private void txtResultadoManteniminetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultadoManteniminetoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultadoManteniminetoActionPerformed

    
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JComboBox cmbBus;
    private javax.swing.JComboBox cmbRuta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtMantenimiento;
    private javax.swing.JTextField txtResultadoMantenimineto;
    private javax.swing.JTextField txtResutadoSalario;
    private javax.swing.JTextField txtSalario;
    // End of variables declaration//GEN-END:variables
}
