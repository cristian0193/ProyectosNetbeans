package Problema1;

import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCantidadTrabajadores = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResutaldos = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CAJA DE COMPENSACION FAMILIAR");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, 450, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel3.setText("Ingrese Cantidad Trabajadores :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        txtCantidadTrabajadores.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtCantidadTrabajadores.setForeground(new java.awt.Color(0, 0, 204));
        txtCantidadTrabajadores.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtCantidadTrabajadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 70, 40));

        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 80, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        txtResutaldos.setColumns(20);
        txtResutaldos.setRows(5);
        jScrollPane1.setViewportView(txtResutaldos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 410, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        int edadesHijos = 0;
        int sumas = 0;
        int total = 0;
        String mensaje = "";
        CajaCompensacion objCaja = new CajaCompensacion();
        
        int numero = Integer.parseInt(this.txtCantidadTrabajadores.getText());
        
        for (int i = 1; i <= numero; i++) {
             int codigoTrabajador = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Codigo de Trabajador # " +i));
             int cantidadHijos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Numero de Hijos del Trabajador # " +i));
             
           for (int j = 1; j <= cantidadHijos; j++) {
                edadesHijos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Edad del Hijo # : " + j));
                sumas+=edadesHijos;
           }
            System.out.println(""+sumas);
            total = objCaja.valorPagar(sumas);
            mensaje +="CODIGO TRABAJADOR : " + codigoTrabajador +"\n"
                     +"NUMERO DE HIJOS : " + cantidadHijos +"\n"
                     +"SUMA DE EDADES : " + sumas +"\n"
                     +"TOTAL A PAGAR : " + total +"\n"
                     +"-------------------------------------- \n";
            sumas = 0;
        }
        this.txtResutaldos.setText(mensaje);
       
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCantidadTrabajadores;
    private javax.swing.JTextArea txtResutaldos;
    // End of variables declaration//GEN-END:variables
}
