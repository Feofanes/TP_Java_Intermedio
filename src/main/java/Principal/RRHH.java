
package Principal;

import Interfaces.Implementacion;
import Personas.Clientes;
import Personas.Tecnicos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.List;


import java.util.ArrayList;
import javax.swing.JOptionPane;

public class RRHH extends javax.swing.JFrame {
    
    private Inicio inicio;
    Tecnicos operario = new Tecnicos();

    //  CONSTRUCTOR
    public RRHH(Inicio inicio) {
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.setTitle("Recursos Humanos");
        this.inicio = inicio;
        
        
    }
    
    
    
    //  METODO PARA LIMPIAR LOS CAMPOS
    public void limpiar(){
        
        jTextField_nombre_tecnico.setText("");
        jCheckBox_SAP.setSelected(false);
        jCheckBox_Tango.setSelected(false);
        jCheckBox_Windows.setSelected(false);
        jCheckBox_MacOS.setSelected(false);
        jCheckBox_Linux.setSelected(false);
    }
    
    public void volverInicio(){
        
        this.setVisible(false);
        
        inicio.setVisible(true);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox5 = new javax.swing.JCheckBox();
        de_RRHH_a_menu = new javax.swing.JButton();
        jTextField_nombre_tecnico = new javax.swing.JTextField();
        jLabel_nombre_tecnico = new javax.swing.JLabel();
        jLabel_especialidad = new javax.swing.JLabel();
        jCheckBox_Windows = new javax.swing.JCheckBox();
        jCheckBox_Tango = new javax.swing.JCheckBox();
        jCheckBox_SAP = new javax.swing.JCheckBox();
        jCheckBox_MacOS = new javax.swing.JCheckBox();
        jCheckBox_Linux = new javax.swing.JCheckBox();
        jButton_alta_tecnico = new javax.swing.JButton();
        jButton_baja_tecnico = new javax.swing.JButton();
        jButton_consultar_tecnico = new javax.swing.JButton();
        jLabel_RRH = new javax.swing.JLabel();

        jCheckBox5.setText("MacOS");
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        de_RRHH_a_menu.setText("ir atras");
        de_RRHH_a_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                de_RRHH_a_menuActionPerformed(evt);
            }
        });

        jTextField_nombre_tecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_nombre_tecnicoActionPerformed(evt);
            }
        });

        jLabel_nombre_tecnico.setText("Nombre");

        jLabel_especialidad.setText("Especialidad");

        jCheckBox_Windows.setText("Windows");
        jCheckBox_Windows.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_WindowsActionPerformed(evt);
            }
        });

        jCheckBox_Tango.setText("Tango");

        jCheckBox_SAP.setText("SAP");

        jCheckBox_MacOS.setText("MacOS");
        jCheckBox_MacOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_MacOSActionPerformed(evt);
            }
        });

        jCheckBox_Linux.setText("Linux");
        jCheckBox_Linux.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_LinuxActionPerformed(evt);
            }
        });

        jButton_alta_tecnico.setText("Dar alta");
        jButton_alta_tecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_alta_tecnicoActionPerformed(evt);
            }
        });

        jButton_baja_tecnico.setText("Dar baja");
        jButton_baja_tecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_baja_tecnicoActionPerformed(evt);
            }
        });

        jButton_consultar_tecnico.setText("Consultar");
        jButton_consultar_tecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_consultar_tecnicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_RRH, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(de_RRHH_a_menu)))
                        .addGap(14, 14, 14))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton_alta_tecnico)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton_baja_tecnico)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton_consultar_tecnico))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_nombre_tecnico)
                                    .addComponent(jLabel_especialidad))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jCheckBox_SAP)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox_Tango)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox_Windows)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox_MacOS)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox_Linux))
                                    .addComponent(jTextField_nombre_tecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_nombre_tecnico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_nombre_tecnico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox_SAP)
                    .addComponent(jLabel_especialidad)
                    .addComponent(jCheckBox_Tango)
                    .addComponent(jCheckBox_Windows)
                    .addComponent(jCheckBox_MacOS)
                    .addComponent(jCheckBox_Linux))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_alta_tecnico)
                    .addComponent(jButton_baja_tecnico)
                    .addComponent(jButton_consultar_tecnico))
                .addGap(18, 18, 18)
                .addComponent(jLabel_RRH, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(de_RRHH_a_menu)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //  BOTON PARA VOLVER A MENU
    private void de_RRHH_a_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_de_RRHH_a_menuActionPerformed

        volverInicio();

    }//GEN-LAST:event_de_RRHH_a_menuActionPerformed

    private void jCheckBox_WindowsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_WindowsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_WindowsActionPerformed

    private void jCheckBox_MacOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_MacOSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_MacOSActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jCheckBox_LinuxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_LinuxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_LinuxActionPerformed

    private void jTextField_nombre_tecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_nombre_tecnicoActionPerformed
        
    }//GEN-LAST:event_jTextField_nombre_tecnicoActionPerformed

    private void jButton_alta_tecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_alta_tecnicoActionPerformed
                                                       
    operario.setNombre(jTextField_nombre_tecnico.getText());

    List<String> especialidad_declarada = new ArrayList<>();

    if(jCheckBox_SAP.isSelected()){
        especialidad_declarada.add("SAP");
    }

    if(jCheckBox_Tango.isSelected()){
        especialidad_declarada.add("Tango");
    }

    if(jCheckBox_Windows.isSelected()){
        especialidad_declarada.add("Windows");
    }

    if(jCheckBox_MacOS.isSelected()){
        especialidad_declarada.add("MacOS");
    }

    if(jCheckBox_Linux.isSelected()){
        especialidad_declarada.add("Linux");
    }

    Implementacion implementandoMetodo = new Implementacion();
    Tecnicos tecnico = new Tecnicos();

    String nombreTecnico = jTextField_nombre_tecnico.getText();
    tecnico.setNombre(nombreTecnico);

    // Llama al método con la lista de especialidades
    implementandoMetodo.alta_tecnico(tecnico, especialidad_declarada);

    limpiar();


        
    }//GEN-LAST:event_jButton_alta_tecnicoActionPerformed

    private void jButton_baja_tecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_baja_tecnicoActionPerformed
        
        Implementacion implementandoMetodo = new Implementacion();  // instanciamos para usar sus metodos
        Tecnicos tecnico = new Tecnicos();
        
        String infoNombre = jTextField_nombre_tecnico.getText();
        
        tecnico.setNombre(infoNombre);
       
        implementandoMetodo.dar_baja(tecnico);
        
        limpiar();
        
        jLabel_RRH.setText("Se ha dado de baja a " + infoNombre);
        
        
        
        
        
        
    }//GEN-LAST:event_jButton_baja_tecnicoActionPerformed

    private void jButton_consultar_tecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_consultar_tecnicoActionPerformed
        
        Implementacion implementandoMetodo = new Implementacion();
        Tecnicos tecnico = new Tecnicos();
        
        // Llama al método con la lista de especialidades
        implementandoMetodo.consultar(tecnico);

        jLabel_RRH.setText("El tecnico con mas incidentes asignados es " + tecnico.getNombre() + " con " + tecnico.getIncidentes_asignados() + " asignados");
        
        
    }//GEN-LAST:event_jButton_consultar_tecnicoActionPerformed

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
            java.util.logging.Logger.getLogger(RRHH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RRHH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RRHH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RRHH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton de_RRHH_a_menu;
    private javax.swing.JButton jButton_alta_tecnico;
    private javax.swing.JButton jButton_baja_tecnico;
    private javax.swing.JButton jButton_consultar_tecnico;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox_Linux;
    private javax.swing.JCheckBox jCheckBox_MacOS;
    private javax.swing.JCheckBox jCheckBox_SAP;
    private javax.swing.JCheckBox jCheckBox_Tango;
    private javax.swing.JCheckBox jCheckBox_Windows;
    private javax.swing.JLabel jLabel_RRH;
    private javax.swing.JLabel jLabel_especialidad;
    private javax.swing.JLabel jLabel_nombre_tecnico;
    private javax.swing.JTextField jTextField_nombre_tecnico;
    // End of variables declaration//GEN-END:variables
}
