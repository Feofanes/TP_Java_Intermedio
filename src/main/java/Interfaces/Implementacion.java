
package Interfaces;

import Principal.Conexion;
import Personas.Clientes;
import Personas.Tecnicos;
import java.sql.Connection;
import java.sql.*;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import java.util.List;


public class Implementacion implements Metodos{
    
    Conexion conexion = Conexion.getInstance();
    
    @Override
    public void dar_alta(Clientes cliente) {
        
        try {
            
            Connection conectar = conexion.conectar(); //   abrimos la conexion

            // insert en (nombre de la tabla), hay tantos values ? como campos/columnas tenga la tabla 
            PreparedStatement insertar = conectar.prepareStatement("insert into Clientes(RazonSocial, CUIT) values(?,?)");
            
            insertar.setString(1, cliente.getRazon_social());
            insertar.setInt(2, cliente.getCuit());
            
            insertar.executeUpdate();
    
            conexion.desconectar();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        }
        
    }   // INSERTAR
    
    @Override
    public void alta_tecnico(Tecnicos tecnico, List<String> especialidades) {
    try {
        Connection conectar = conexion.conectar(); // abrimos la conexion

        // Insertar el técnico en la tabla Tecnicos
        String queryTecnicos = "INSERT INTO Tecnicos(Nombre) VALUES (?)";
        PreparedStatement insertarTecnicos = conectar.prepareStatement(queryTecnicos, Statement.RETURN_GENERATED_KEYS);
        insertarTecnicos.setString(1, tecnico.getNombre());
        insertarTecnicos.executeUpdate();

        // Obtener el ID generado para el técnico recién insertado
        ResultSet rs = insertarTecnicos.getGeneratedKeys();
        int idTecnico = -1;
        if (rs.next()) {
            idTecnico = rs.getInt(1);
        }

        // Insertar las especialidades en la tabla Especialidades y la relación en Tecnicos_especialidades
        String queryEspecialidades = "INSERT INTO Especialidades(Nombre_especialidad) VALUES (?)";
        String queryTecnicosEspecialidades = "INSERT INTO Tecnicos_especialidades(ID_Tecnico, ID_Especialidad) VALUES (?, ?)";

        for (String especialidad : especialidades) {
            // Insertar la especialidad en la tabla Especialidades
            PreparedStatement insertarEspecialidades = conectar.prepareStatement(queryEspecialidades, Statement.RETURN_GENERATED_KEYS);
            insertarEspecialidades.setString(1, especialidad);
            insertarEspecialidades.executeUpdate();

            // Obtener el ID generado para la especialidad recién insertada
            ResultSet rsEspecialidades = insertarEspecialidades.getGeneratedKeys();
            int idEspecialidad = -1;
            if (rsEspecialidades.next()) {
                idEspecialidad = rsEspecialidades.getInt(1);
            }

            // Insertar la relación en la tabla Tecnicos_especialidades
            PreparedStatement insertarTecnicosEspecialidades = conectar.prepareStatement(queryTecnicosEspecialidades);
            insertarTecnicosEspecialidades.setInt(1, idTecnico);
            insertarTecnicosEspecialidades.setInt(2, idEspecialidad);
            insertarTecnicosEspecialidades.executeUpdate();
        }

        conexion.desconectar();

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error: " + ex);
    }
}

    @Override
    public void modificar(Clientes cliente) {
        
        try {
            
            Connection conectar = conexion.conectar(); //   abrimos la conexion
        
            // modificamos en (nombre de la tabla: Clientes) el campo RazonSocial tomando de referencia el CUIT 
            PreparedStatement modificar = conectar.prepareStatement("update clientes set RazonSocial = ? where CUIT = ?");
            
            modificar.setString(1, cliente.getRazon_social()); // el numero del primero parametro corresponde al primer "?"
            modificar.setInt(2, cliente.getCuit());
            
            modificar.executeUpdate();  // para actualizar lo que se ha hecho
            
            conexion.desconectar();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        }
    }   // MODIFICAR

    //  Solo elimina buscando por el CUIT
    @Override
    public void dar_baja(Clientes cliente) {
        
        try {
            
            Connection conectar = conexion.conectar(); //   abrimos la conexion
        
            // eliminamos en (nombre de la tabla: Clientes) tomando de referencia el CUIT 
            PreparedStatement eliminar = conectar.prepareStatement("delete from Clientes where CUIT = ?");
            
            eliminar.setInt(1, cliente.getCuit());  
            
            eliminar.executeUpdate();  // para actualizar lo que se ha hecho
            
            conexion.desconectar();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        }
    }   // ELIMINAR

    @Override
    public void buscar(Clientes cliente) {
        
        try {
            
            Connection conectar = conexion.conectar(); //   abrimos la conexion
        
            // buscamos en (nombre de la tabla: Clientes) tomando de referencia el CUIT, de lo buscado seleccionamos todo (*) 
            PreparedStatement buscar = conectar.prepareStatement("select * from Clientes where CUIT = ?");
            
            buscar.setInt(1, cliente.getCuit());
            
            ResultSet consulta = buscar.executeQuery(); // consulta a la BD
            
            if(consulta.next()){
                cliente.setCuit(Integer.parseInt(consulta.getString("Cuit")));
                cliente.setRazon_social(consulta.getString("RazonSocial"));
                
            }else{
                
                
                
            }   // evalua si hay datos correspondiente a ese CUIT
            
            // NO VA EL UPDATE EN LOS METODOS DE BUSQUEDA!! TIRA ERROR
            
            conexion.desconectar();
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        }
        
    }   //  BUSCAR

    @Override
    public void buscar(Tecnicos tecnico) {
        
          try {
            
            Connection conectar = conexion.conectar(); //   abrimos la conexion
        
            // buscamos en (nombre de la tabla: Alumnos) tomando de referencia el ID, de lo buscado seleccionamos todo (*) 
            PreparedStatement buscar = conectar.prepareStatement("select * from Tecnicos where Especialidades = ?");
            
            ResultSet consulta = buscar.executeQuery(); // consulta a la BD
            
            if(consulta.next()){
                
                tecnico.setRazon_social(consulta.getString("RazonSocial"));
                
            }else{
                
            }   // evalua si hay datos correspondiente a ese CUIT
            
            // NO VA EL UPDATE EN LOS METODOS DE BUSQUEDA!! TIRA ERROR
            
            conexion.desconectar();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        }
        
    }

    @Override
    public void modificar(Tecnicos tecnico) {
        
    try {
        Connection conectar = conexion.conectar(); // Abrimos la conexión

        // Buscamos en la tabla Tecnicos tomando como referencia el ID
        PreparedStatement buscar = conectar.prepareStatement("SELECT * FROM Tecnicos WHERE ID_Tecnico = ?");
        buscar.setString(1, tecnico.getNombre());
        ResultSet consulta = buscar.executeQuery();

        if (consulta.next()) {
            tecnico.setNombre(consulta.getString("Nombre"));
        }

        // Modificamos en la tabla clientes el campo Incidentes_asignados tomando como referencia el ID_Tecnico
        PreparedStatement modificar = conectar.prepareStatement("UPDATE Tecnicos SET Incidentes_asignados = ? WHERE Nombre = ?");
        
        int historial_incidente = tecnico.getIncidentes_asignados();
        
        modificar.setInt(1, historial_incidente + 1);
        modificar.setString(2, tecnico.getNombre());

        modificar.executeUpdate(); // Para actualizar lo que se ha hecho
        conexion.desconectar();

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error: " + ex);
    }
}

    @Override
    public void dar_baja(Tecnicos tecnico) {
        
        try {
            
            Connection conectar = conexion.conectar(); //   abrimos la conexion
        
            // eliminamos en (nombre de la tabla: Tecnicos) tomando de referencia el NOMBRE 
            PreparedStatement eliminar = conectar.prepareStatement("delete from Tecnicos where Nombre = ?");
            
            eliminar.setString(1, tecnico.getNombre());  
            
            eliminar.executeUpdate();  // para actualizar lo que se ha hecho
            
            conexion.desconectar();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        }
        
        
        
    }

    @Override
    public void consultar(Tecnicos tecnico) {
        
    try {
        Connection conectar = conexion.conectar();  // Objeto Connection para conectarse a la BD

        // Consulta para obtener el máximo valor de Incidentes_asignados
        String consultaSQL = "SELECT MAX(Incidentes_asignados) AS max_valor FROM Tecnicos";

        try (PreparedStatement consulta = conectar.prepareStatement(consultaSQL);
             ResultSet resultado = consulta.executeQuery()) {

            if (resultado.next()) {
                int maxIncidentes = resultado.getInt("max_valor");

                // Ahora necesitas obtener el técnico con ese máximo valor
                String obtenerTecnicoSQL = "SELECT * FROM Tecnicos WHERE Incidentes_asignados = ?";
                try (PreparedStatement obtenerTecnico = conectar.prepareStatement(obtenerTecnicoSQL)) {
                    obtenerTecnico.setInt(1, maxIncidentes);

                    try (ResultSet tecnicoResultado = obtenerTecnico.executeQuery()) {
                        if (tecnicoResultado.next()) {
                            // Establece los valores en el objeto tecnicos
                            tecnico.setNombre(tecnicoResultado.getString("Nombre"));
                            tecnico.setIncidentes_asignados(tecnicoResultado.getInt("Incidentes_asignados"));
                        }
                    }
                }
            }
        }

        conexion.desconectar();

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error: " + ex);
    }
}

       
    }

   


   

   