/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema3;


public class Principal extends javax.swing.JFrame {

  
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
        public String nombre;
        public  boolean primera;
        public boolean urgencia;
        public boolean medico;
        public boolean especialista;
        public double salario = 0;
        public double total = 0;
        public double recaudo = 0;
        public String mensaje = "";
        public String mensajeRecaudo = "";

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        chkPrimera = new javax.swing.JCheckBox();
        chkUrgencia = new javax.swing.JCheckBox();
        chkMedico = new javax.swing.JCheckBox();
        chkEspecialista = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        txtSalario = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtRecuados = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(450, 350));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONSULTAS EPS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, 450, 30));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Selecciones Datos"));

        chkPrimera.setText("Primera Vez");

        chkUrgencia.setText("Urgencias");

        chkMedico.setText("Medico General");
        chkMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkMedicoActionPerformed(evt);
            }
        });

        chkEspecialista.setText("Especialista");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkPrimera)
                    .addComponent(chkMedico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkUrgencia)
                    .addComponent(chkEspecialista))
                .addGap(41, 41, 41))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkPrimera)
                    .addComponent(chkUrgencia))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkMedico)
                    .addComponent(chkEspecialista))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 390, 110));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel4.setText("Ingrese Salario :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 66, -1, 20));

        txtSalario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtSalario.setForeground(new java.awt.Color(0, 0, 204));
        txtSalario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 200, 30));

        jButton1.setText("REACUDOS DIA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, -1, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel5.setText("Ingrese Nombre :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, 20));

        txtNombre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 0, 204));
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 200, 30));

        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        jScrollPane1.setViewportView(txtResultado);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 190, -1));

        txtRecuados.setColumns(20);
        txtRecuados.setRows(5);
        jScrollPane2.setViewportView(txtRecuados);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 180, -1));

        jButton2.setText("CALCULAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, -1, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkMedicoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        mensajeRecaudo = "TOTAL RECAUDOS : " + recaudo+"\n"+
                 "------------------------------- \n";
       
       this.txtRecuados.setText(mensajeRecaudo);
        
     
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
       nombre = this.txtNombre.getText(); 
       salario = Double.parseDouble(this.txtSalario.getText()); 
       primera = this.chkPrimera.isSelected();
       urgencia = this.chkUrgencia.isSelected();
       medico = this.chkMedico.isSelected();
       especialista = this.chkEspecialista.isSelected();
       
       
       EPS objEPS = new EPS();
       
       total = objEPS.TotalConsulta(salario, primera, urgencia, medico, especialista);
       recaudo += total;
       mensaje = "NOMBRE : " + nombre + "\n"+
                 "TOTAL CONSULTA : " + total+"\n"+
                 "------------------------------- \n";
       
       this.txtResultado.setText(mensaje);
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
    private javax.swing.JCheckBox chkEspecialista;
    private javax.swing.JCheckBox chkMedico;
    private javax.swing.JCheckBox chkPrimera;
    private javax.swing.JCheckBox chkUrgencia;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextArea txtRecuados;
    private javax.swing.JTextArea txtResultado;
    private javax.swing.JTextField txtSalario;
    // End of variables declaration//GEN-END:variables
}
