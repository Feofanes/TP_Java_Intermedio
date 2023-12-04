
package Principal;

import javax.swing.JFrame;

public class Inicio extends javax.swing.JFrame {
    
    Area_Comercial area_comercial;
    RRHH recursos_humanos;
    Mesa_Ayuda mesa_ayuda;
    
    //  CONSTRUCTOR
    public Inicio() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.setTitle("Soporte Operativo");
        this.area_comercial = new Area_Comercial(this);
        this.recursos_humanos = new RRHH(this);
        this.mesa_ayuda = new Mesa_Ayuda(this);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Boton_AreaC = new javax.swing.JButton();
        Boton_RRHH = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Boton_AreaC.setText("Area Comercial");
        Boton_AreaC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_AreaCActionPerformed(evt);
            }
        });

        Boton_RRHH.setText("Recursos Humanos");
        Boton_RRHH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_RRHHActionPerformed(evt);
            }
        });

        jButton1.setText("Mesa de Ayuda");
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
                .addGap(78, 78, 78)
                .addComponent(Boton_AreaC)
                .addGap(18, 18, 18)
                .addComponent(Boton_RRHH)
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(136, 136, 136))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boton_AreaC)
                    .addComponent(Boton_RRHH))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(129, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //  BOTON PARA PASAR A AREA COMERCIAL
    private void Boton_AreaCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_AreaCActionPerformed
        
        this.setVisible(false);
        
        area_comercial.setVisible(true);
        
        
        
    }//GEN-LAST:event_Boton_AreaCActionPerformed

    //  BOTON PARA PASAR A RRHH
    private void Boton_RRHHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_RRHHActionPerformed
        
        this.setVisible(false);
        
        recursos_humanos.setVisible(true);
        
        
    }//GEN-LAST:event_Boton_RRHHActionPerformed

    //  BOTON PARA PASAR A  LA MESA DE AYUDA
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        this.setVisible(false);
        
        mesa_ayuda.setVisible(true);
        
        
        
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
    private javax.swing.JButton Boton_AreaC;
    private javax.swing.JButton Boton_RRHH;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
