/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema4;

public class Principal extends javax.swing.JFrame {

   
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public double Nota1 = 0;
    public double Nota2 = 0;
    public double Nota3 = 0;
    public double Nota4 = 0;
    public double Nota5 = 0;
    Notas obj = new Notas();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNota1 = new javax.swing.JTextField();
        txtNota2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNota3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNota4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNota5 = new javax.swing.JTextField();
        btnCalcular7 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtResultado1 = new javax.swing.JTextField();
        txtResultado2 = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        txtResultado3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(520, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CALCULO DE ESTADISTICAS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, 470, 30));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Informacion de Notas"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Nota # 1 :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, 30));

        txtNota1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtNota1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtNota1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 160, 30));

        txtNota2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtNota2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNota2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNota2ActionPerformed(evt);
            }
        });
        jPanel1.add(txtNota2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 160, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Nota # 2 :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Nota # 3 :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, 30));

        txtNota3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtNota3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNota3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNota3ActionPerformed(evt);
            }
        });
        jPanel1.add(txtNota3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 160, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Nota # 4 :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, 30));

        txtNota4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtNota4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtNota4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 160, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Nota # 5 :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, 30));

        txtNota5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtNota5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtNota5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 160, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 280, 200));

        btnCalcular7.setText("CALCULAR");
        btnCalcular7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcular7ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, 120, 30));

        jLabel7.setText("Estudiantes aprobaron todos los exámenes :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        jLabel8.setText("Estudiantes que aprobaron A, B, C o D y Reprobaron E : ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        jLabel10.setText("Estudiantes que aprobaron A, B, C y Reporbaron D, E :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        txtResultado1.setEditable(false);
        txtResultado1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtResultado1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtResultado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 50, 30));

        txtResultado2.setEditable(false);
        txtResultado2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtResultado2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtResultado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 50, 30));

        btnIngresar.setText("INGRESAR NOTAS");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 130, 30));

        txtResultado3.setEditable(false);
        txtResultado3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtResultado3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtResultado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, 50, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNota2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNota2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNota2ActionPerformed

    private void txtNota3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNota3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNota3ActionPerformed

    private void btnCalcular7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcular7ActionPerformed

     
     this.txtResultado1.setText(""+obj.getContadorTodos());
     this.txtResultado2.setText(""+obj.getContadorABC());
     this.txtResultado3.setText(""+obj.getContadorABCD());
        
                               
    }//GEN-LAST:event_btnCalcular7ActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        
        Nota1 = Double.parseDouble(txtNota1.getText());
        Nota2 = Double.parseDouble(txtNota2.getText());
        Nota3 = Double.parseDouble(txtNota3.getText());
        Nota4 = Double.parseDouble(txtNota4.getText());
        Nota5 = Double.parseDouble(txtNota5.getText());
                
        obj.NotaFinal(Nota1, Nota2, Nota3, Nota4, Nota5);
        
        txtNota1.setText("");
        txtNota2.setText("");
        txtNota3.setText("");
        txtNota4.setText("");
        txtNota5.setText("");
        
    }//GEN-LAST:event_btnIngresarActionPerformed

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
    private javax.swing.JButton btnCalcular7;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtNota1;
    private javax.swing.JTextField txtNota2;
    private javax.swing.JTextField txtNota3;
    private javax.swing.JTextField txtNota4;
    private javax.swing.JTextField txtNota5;
    private javax.swing.JTextField txtResultado1;
    private javax.swing.JTextField txtResultado2;
    private javax.swing.JTextField txtResultado3;
    // End of variables declaration//GEN-END:variables
}
