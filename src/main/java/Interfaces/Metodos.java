
package Interfaces;

import Personas.Clientes;
import Personas.Tecnicos;
import java.util.List;

public interface Metodos {
    
    // METODO PARA REGISTRAR CLIENTE
    public void dar_alta(Clientes cliente);  // no hay llaves porque es abstracto!
    
    // METODO PARA REGISTRAR TECNICOS

    public void alta_tecnico(Tecnicos tecnico, List<String> especialidades);  // no hay llaves porque es abstracto!
    
    // METODO PARA MODIFICAR CLIENTE
    public void modificar(Clientes cliente);
    
    // METODO PARA MODIFICAR TECNICO
    public void modificar(Tecnicos tecnico);
    
    // METODO PARA ELIMINAR CLIENTE
    public void dar_baja(Clientes cliente);
    
    // METODO PARA ELIMINAR CLIENTE
    public void dar_baja(Tecnicos tecnico);
    
    // METODO PARA BUSCAR CLIENTE
    public void buscar(Clientes cliente);
    
    // METODO PARA BUSCAR TECNICOS
    public void buscar(Tecnicos tecnico);
    
    // METODO PARA CONSULTAR EL TECNICO CON MAYOR NUMERO DE INCIDENTES ASIGNADOS
    public void consultar(Tecnicos tecnico);
    
}

/*
CRUD de BD
registrar
eliminar
buscar
modificar
*/
