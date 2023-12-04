
package Principal;

import Interfaces.Implementacion;
import Personas.Clientes;

public class Area_Comercial extends javax.swing.JFrame {
    
    private Inicio inicio;

    //  CONSTRUCTOR
    public Area_Comercial(Inicio inicio) {
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.setTitle("Area Comercial");
        this.inicio = inicio;
    }
    
    //  METODO PARA LIMPIAR LOS CAMPOS
    public void limpiar(){
        
        campo_cliente.setText("");
        campo_cuit.setText("");
        
    }
    
    public void volverInicio(){
        
        this.setVisible(false);
        
        inicio.setVisible(true);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombre_cliente = new javax.swing.JLabel();
        campo_cliente = new javax.swing.JTextField();
        nombre_cliente1 = new javax.swing.JLabel();
        campo_cuit = new javax.swing.JTextField();
        boton_alta = new javax.swing.JButton();
        boton_baja = new javax.swing.JButton();
        boton_modificacionCliente = new javax.swing.JButton();
        aviso_comercial = new javax.swing.JLabel();
        de_comercial_a_menu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nombre_cliente.setText("Nombre");

        nombre_cliente1.setText("CUIT");

        boton_alta.setText("Dar de alta");
        boton_alta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_altaActionPerformed(evt);
            }
        });

        boton_baja.setText("Dar de baja");
        boton_baja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_bajaActionPerformed(evt);
            }
        });

        boton_modificacionCliente.setText("Modificar");
        boton_modificacionCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_modificacionClienteActionPerformed(evt);
            }
        });

        de_comercial_a_menu.setText("ir atras");
        de_comercial_a_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                de_comercial_a_menuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nombre_cliente)
                            .addComponent(nombre_cliente1))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campo_cuit, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boton_alta)
                        .addGap(18, 18, 18)
                        .addComponent(boton_baja)
                        .addGap(18, 18, 18)
                        .addComponent(boton_modificacionCliente))
                    .addComponent(aviso_comercial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(de_comercial_a_menu)
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre_cliente)
                    .addComponent(campo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre_cliente1)
                    .addComponent(campo_cuit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_alta)
                    .addComponent(boton_baja)
                    .addComponent(boton_modificacionCliente))
                .addGap(26, 26, 26)
                .addComponent(aviso_comercial, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(de_comercial_a_menu)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //  BOTON PARA DAR ALTA CLIENTES CAPTURANDO LA INFO DE LOS CAMPOS
    private void boton_altaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_altaActionPerformed
        
        Implementacion implementandoMetodo = new Implementacion();  // instanciamos para usar sus metodos
        Clientes cliente = new Clientes();
        
        String infoNombre = campo_cliente.getText();
        int infoCuit = Integer.parseInt(campo_cuit.getText());
        
        cliente.setRazon_social(infoNombre);
        cliente.setCuit(infoCuit);
        
        implementandoMetodo.dar_alta(cliente);
        
        aviso_comercial.setText("Se ha dado de alta a " + infoNombre + ", CUIT: " + infoCuit);
        
        limpiar();
        
    }//GEN-LAST:event_boton_altaActionPerformed
    //  BOTON PARA DAR DE BAJA CLIENTES
    private void boton_bajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_bajaActionPerformed
        
        Implementacion implementandoMetodo = new Implementacion();  // instanciamos para usar sus metodos
        Clientes cliente = new Clientes();
        
        String infoNombre = campo_cliente.getText();
        int infoCuit = Integer.parseInt(campo_cuit.getText());
        
        cliente.setRazon_social(infoNombre);
        cliente.setCuit(infoCuit);
        
        implementandoMetodo.dar_baja(cliente);
        
        limpiar();
        
        aviso_comercial.setText("Se ha dado de baja a " + infoNombre + ", CUIT: " + infoCuit);
        
        
    }//GEN-LAST:event_boton_bajaActionPerformed
    //  BOTON DE MODIFICACION DE DATOS DE CLIENTES
    private void boton_modificacionClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_modificacionClienteActionPerformed
        
        Implementacion implementandoMetodo = new Implementacion();  // instanciamos para usar sus metodos
        Clientes cliente = new Clientes();
        
        String infoNombre = campo_cliente.getText();
        int infoCuit = Integer.parseInt(campo_cuit.getText());
        
        cliente.setRazon_social(infoNombre);
        cliente.setCuit(infoCuit);
        
        implementandoMetodo.modificar(cliente);
        
        limpiar();
        
        aviso_comercial.setText("Se ha modificado el nombre de CUIT: " + infoCuit + " a: " + infoNombre);
        
        
        
        
    }//GEN-LAST:event_boton_modificacionClienteActionPerformed
    
    //  BOTON PARA VOLVER DE AREA COMERCIAL A MENU PRINCIPAL
    private void de_comercial_a_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_de_comercial_a_menuActionPerformed
        
        volverInicio();
        
    }//GEN-LAST:event_de_comercial_a_menuActionPerformed

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
            java.util.logging.Logger.getLogger(Area_Comercial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Area_Comercial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Area_Comercial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Area_Comercial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aviso_comercial;
    private javax.swing.JButton boton_alta;
    private javax.swing.JButton boton_baja;
    private javax.swing.JButton boton_modificacionCliente;
    private javax.swing.JTextField campo_cliente;
    private javax.swing.JTextField campo_cuit;
    private javax.swing.JButton de_comercial_a_menu;
    private javax.swing.JLabel nombre_cliente;
    private javax.swing.JLabel nombre_cliente1;
    // End of variables declaration//GEN-END:variables
}
