
package Principal;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {
    
    
    private Conexion(){}    // constructor
    
    // En esta clase haremos los metodos de abrir y cerrar conexion
    
    // variable static porque pertenecera a toda la clase
    private static Connection conexion;
    
    private static Conexion instancia; 
    
    // creamos variables para poder conectarnos a la BD
    private static final String URL = "jdbc:mysql://localhost/BD_TP";   // guardara la direccion de la BD
    
    private static final String username = "root";
    
    private static final String password = "";
    
    
    public Connection conectar(){
        
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            conexion = DriverManager.getConnection(URL, username, password);    // obtenemos la conexion
            
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Error : " + e);
        }
        
        return conexion;
    }   // metodo para conectarnos a la BD
    
    public void desconectar() throws SQLException{
        
        try{
            
            conexion.close();
            
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null, "Error : " + e);
            conexion.close();
            
        }finally{
            
            conexion.close();
            
        }
        
    }   // metodo para cerrar la BD

    public static Conexion getInstance(){
        
        if(instancia == null){
            
            instancia = new Conexion();
             
        }   // si la instancia es nula crea una nueva!
        
        return instancia;
        
    }   // patron Singleton !
    
    
    
}

/*
En MAVEN para que conecte a la BD en MySQL hay que copiar en Project Files -> pom.xml ->
las dependencias que estan en la pagina oficial
*/

