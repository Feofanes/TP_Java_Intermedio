
package Principal;

import Interfaces.Implementacion;
import Personas.Clientes;
import Personas.Tecnicos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class Mesa_Ayuda extends javax.swing.JFrame {
    
       
    Incidentes incidente = new Incidentes();
    Clientes cliente = new Clientes();
    
    Conexion conexion = Conexion.getInstance();
    
    private Inicio inicio;
    
    //  CONSTRUCTOR
    public Mesa_Ayuda(Inicio inicio) {
        
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Mesa de Ayuda");
        this.inicio = inicio;
        
    }
    
    //  METODOS
    public void volverInicio(){
        
        this.setVisible(false);
        
        inicio.setVisible(true);
        
    };
    public void limpiar(){
        
        campo_cuit_mesa.setText("");
        
    };

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombre_cliente1 = new javax.swing.JLabel();
        campo_cuit = new javax.swing.JTextField();
        de_mesa_a_menu = new javax.swing.JButton();
        cuit_cliente = new javax.swing.JLabel();
        campo_cuit_mesa = new javax.swing.JTextField();
        boton_comprobar = new javax.swing.JButton();
        cliente_comprobado = new javax.swing.JLabel();
        combo_incidentes = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton_confirmar_reporte = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane_descripcion = new javax.swing.JTextPane();
        jComboBox_tecnicos = new javax.swing.JComboBox<>();
        jLabel_tecnicoAsignado = new javax.swing.JLabel();
        jButton_asignar = new javax.swing.JButton();

        nombre_cliente1.setText("CUIT");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        de_mesa_a_menu.setText("ir atras");
        de_mesa_a_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                de_mesa_a_menuActionPerformed(evt);
            }
        });

        cuit_cliente.setText("CUIT");

        boton_comprobar.setText("Comprobar");
        boton_comprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_comprobarActionPerformed(evt);
            }
        });

        combo_incidentes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SAP", "Tango", "Windows", "MacOS", "Linux" }));
        combo_incidentes.setEnabled(false);
        combo_incidentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_incidentesActionPerformed(evt);
            }
        });

        jLabel1.setText("Reportar incidente:");

        jButton_confirmar_reporte.setText("Confirmar reporte");
        jButton_confirmar_reporte.setEnabled(false);
        jButton_confirmar_reporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_confirmar_reporteActionPerformed(evt);
            }
        });

        jTextPane_descripcion.setContentType("Introduzca una breve descripcion del incidente a reportar"); // NOI18N
        jTextPane_descripcion.setEnabled(false);
        jScrollPane2.setViewportView(jTextPane_descripcion);

        jComboBox_tecnicos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tecnicos" }));
        jComboBox_tecnicos.setEnabled(false);
        jComboBox_tecnicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_tecnicosActionPerformed(evt);
            }
        });

        jButton_asignar.setText("Asignar");
        jButton_asignar.setEnabled(false);
        jButton_asignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_asignarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cuit_cliente)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_asignar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jComboBox_tecnicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_confirmar_reporte))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(combo_incidentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cliente_comprobado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(campo_cuit_mesa, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(boton_comprobar))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel_tecnicoAsignado)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(de_mesa_a_menu))))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cuit_cliente)
                    .addComponent(campo_cuit_mesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_comprobar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cliente_comprobado, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(combo_incidentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_confirmar_reporte)
                    .addComponent(jComboBox_tecnicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_asignar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jLabel_tecnicoAsignado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(de_mesa_a_menu)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //  BOTON DE VOLVER A MENU
    private void de_mesa_a_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_de_mesa_a_menuActionPerformed

        volverInicio();

    }//GEN-LAST:event_de_mesa_a_menuActionPerformed

    //  BOTON COMPROBAR SI ES CLIENTE
    private void boton_comprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_comprobarActionPerformed

        Implementacion metodo = new Implementacion();   // instancio Obj de la clase de implementacion   
        Clientes cliente = new Clientes();     // instancio Obj de la clase de clientes
        
        String entrada = campo_cuit_mesa.getText();

        if (entrada.equals("")) {     // si no hay entrada no busca!

            JOptionPane.showMessageDialog(null, "Ingrese el CUIT a buscar");
            
        }else{

            int cuit = Integer.parseInt(campo_cuit_mesa.getText()); // capturamos la entrada, para empzar la busqueda

            cliente.setCuit(cuit);   // seteamos el objeto

            metodo.buscar(cliente);  // le aplicamos el metodo

            // mostramos los resultados de la busqueda
            
            if(cliente.getRazon_social() == null){
                
                cliente_comprobado.setText("El cliente no se encuentra registrado");
             
            }else{
            
            cliente_comprobado.setText("El cliente es: " + cliente.getRazon_social());
            
            // HABILITACION PARA REPORTAR INCIDENTES
            combo_incidentes.setEnabled(true);
            
            jTextPane_descripcion.setEnabled(true);
            jButton_confirmar_reporte.setEnabled(true);
            
            }   // este if constata que exista el cliente
        }
        
        // este metodo da un error a la hora de confirmar el reporte del incidente
        //limpiar();
        
    }//GEN-LAST:event_boton_comprobarActionPerformed

    //  BOTON COMBO PARA SELECCIONAR EL TIPO DE PROBLEMA
    private void combo_incidentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_incidentesActionPerformed
        
        incidente.setTipo_incidente(combo_incidentes.getSelectedItem().toString());
        
    }//GEN-LAST:event_combo_incidentesActionPerformed

    
    //  BONTON CONFIRMACION DE REPORTE DE INCIDENTE
    private void jButton_confirmar_reporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_confirmar_reporteActionPerformed
        
    try {
        // Establecer la conexión
        try (Connection conectar = conexion.conectar()) {
            // Preparar la sentencia SQL para insertar el incidente
            try (PreparedStatement cargar_incidente = conectar.prepareStatement(
                    "UPDATE Clientes SET Incidentes = ? WHERE CUIT = ?")) {

                // Asignar valores a los parámetros de la sentencia
                cargar_incidente.setString(1, incidente.getTipo_incidente());
                cargar_incidente.setInt(2, cliente.getCuit());

                // Ejecutar la sentencia SQL
                cargar_incidente.executeUpdate();

                // Imprimir mensaje de éxito en la consola
                System.out.println("Incidente registrado con éxito para el cliente con CUIT: " + cliente.getCuit());

                // Armo el combobox de los técnicos
                try (PreparedStatement buscar = conectar.prepareStatement("SELECT t.Nombre FROM Tecnicos t " +
                        "INNER JOIN Tecnicos_Especialidades te ON t.ID_Tecnico = te.ID_Tecnico " +
                        "INNER JOIN Especialidades e ON te.ID_Especialidad = e.ID_Especialidad " +
                        "WHERE e.Nombre_especialidad LIKE ?")) {
                    buscar.setString(1, "%" + incidente.getTipo_incidente() + "%");

                    try (ResultSet consulta = buscar.executeQuery()) {
                        jComboBox_tecnicos.removeAllItems();
                        while (consulta.next()) {
                            jComboBox_tecnicos.addItem(consulta.getString("Nombre"));
                        }
                    }
                }

                // Habilito el combo para elegir técnico
                jComboBox_tecnicos.setEnabled(true);
                jButton_asignar.setEnabled(true);
            } // La sentencia preparada se cerrará automáticamente aquí
        } // La conexión se cerrará automáticamente aquí

    } catch (SQLException ex) {
        // Manejar errores de SQL
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al actualizar la base de datos: " + ex.getMessage());
    }

    }//GEN-LAST:event_jButton_confirmar_reporteActionPerformed

    //  COMBO CON LOS TECNICOS DISPONIBLES Y CUYA ESPECIALIDAD COINCIDE CON EL REPORTE DE INCIDETENTE
    private void jComboBox_tecnicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_tecnicosActionPerformed
        
        
    }//GEN-LAST:event_jComboBox_tecnicosActionPerformed

    //  BOTON PARA INCREMENTAR EL REGISTRO DE INCIDENTES ASIGNADOS
    private void jButton_asignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_asignarActionPerformed
        
    jLabel_tecnicoAsignado.setText("Incidente asignado al Tecnico: " + jComboBox_tecnicos.getSelectedItem());
    
        Implementacion implementandoMetodo = new Implementacion();  // instanciamos para usar sus metodos
        Tecnicos tecnico = new Tecnicos();

        String infoNombre = jComboBox_tecnicos.getSelectedItem().toString();
        //int infoCuit = Integer.parseInt(campo_cuit.getText());

        tecnico.setNombre(infoNombre);
        //cliente.setCuit(infoCuit);

        implementandoMetodo.modificar(tecnico);
        
    }//GEN-LAST:event_jButton_asignarActionPerformed

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
            java.util.logging.Logger.getLogger(Mesa_Ayuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mesa_Ayuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mesa_Ayuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mesa_Ayuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Mesa_Ayuda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_comprobar;
    private javax.swing.JTextField campo_cuit;
    private javax.swing.JTextField campo_cuit_mesa;
    private javax.swing.JLabel cliente_comprobado;
    private javax.swing.JComboBox<String> combo_incidentes;
    private javax.swing.JLabel cuit_cliente;
    private javax.swing.JButton de_mesa_a_menu;
    private javax.swing.JButton jButton_asignar;
    private javax.swing.JButton jButton_confirmar_reporte;
    private javax.swing.JComboBox<String> jComboBox_tecnicos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_tecnicoAsignado;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane_descripcion;
    private javax.swing.JLabel nombre_cliente1;
    // End of variables declaration//GEN-END:variables


}



