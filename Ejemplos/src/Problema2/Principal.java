
package Problema2;


public class Principal extends javax.swing.JFrame {

    
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

  public static String mensaje = "";
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCodigoProducto = new javax.swing.JTextField();
        btnCalcularFactura = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResutaldosProductos = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtResutaldosFactura = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        txtCantidadProducto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cmbListaProductos = new javax.swing.JComboBox();
        btnAgregarProducto = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FACTURACION EMPRESA XYZ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, 450, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel3.setText("Ingrese Codigo del Producto :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 66, -1, 20));

        txtCodigoProducto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtCodigoProducto.setForeground(new java.awt.Color(0, 0, 204));
        txtCodigoProducto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtCodigoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 70, 30));

        btnCalcularFactura.setText("Calcular");
        btnCalcularFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularFacturaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcularFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, 80, 30));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        txtResutaldosProductos.setEditable(false);
        txtResutaldosProductos.setColumns(20);
        txtResutaldosProductos.setRows(5);
        jScrollPane1.setViewportView(txtResutaldosProductos);

        txtResutaldosFactura.setEditable(false);
        txtResutaldosFactura.setColumns(20);
        txtResutaldosFactura.setRows(5);
        jScrollPane2.setViewportView(txtResutaldosFactura);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 410, 220));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel4.setText("Selecciona el producto :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 150, 20));

        txtCantidadProducto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtCantidadProducto.setForeground(new java.awt.Color(0, 0, 204));
        txtCantidadProducto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtCantidadProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 70, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel5.setText("Ingrese Cantidad :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 100, 110, 30));

        cmbListaProductos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "Trapeadores", "Escobas" }));
        getContentPane().add(cmbListaProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 120, 20));

        btnAgregarProducto.setBackground(new java.awt.Color(51, 51, 255));
        btnAgregarProducto.setText("Agregar ");
        btnAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProductoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, -1, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularFacturaActionPerformed

        

    }//GEN-LAST:event_btnCalcularFacturaActionPerformed

    private void btnAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProductoActionPerformed
      
        int valorProducto = 0;

        Productos objFactura = new Productos();

        int numero = Integer.parseInt(this.txtCodigoProducto.getText());
        int cantidad = Integer.parseInt(this.txtCantidadProducto.getText());
        int producto = (int)cmbListaProductos.getSelectedIndex();
        String seleccion=(String)cmbListaProductos.getSelectedItem();
        
        valorProducto = objFactura.TotalProducto(cantidad,producto);
       // valorIVA = objFactura.TotalIva(valorProducto, producto);
        mensaje += "CODIGO : " + numero +"\n"+
                   "PRODUCTO : " + seleccion +"\n"+
                   "CANTIDAD : " + cantidad +"\n"+
                   "TOTAL : " + valorProducto+"\n"+
                   "----------------------------- \n";
        
        this.txtResutaldosProductos.setText(mensaje);
        
        
    }//GEN-LAST:event_btnAgregarProductoActionPerformed

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
    private javax.swing.JButton btnAgregarProducto;
    private javax.swing.JButton btnCalcularFactura;
    private javax.swing.JComboBox cmbListaProductos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtCantidadProducto;
    private javax.swing.JTextField txtCodigoProducto;
    private javax.swing.JTextArea txtResutaldosFactura;
    private javax.swing.JTextArea txtResutaldosProductos;
    // End of variables declaration//GEN-END:variables
}
