
package Personas;

import Principal.Incidentes;

public class Clientes extends Personas{
    
    
    //  ATRIBUTOS
    private String razon_social;
    private int Cuit;
    private Incidentes incidente;
    
    
    
    // GETTERS Y SETTERS
    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public int getCuit() {
        return Cuit;
    }

    public void setCuit(int Cuit) {
        this.Cuit = Cuit;
    }

    public Incidentes getIncidente() {
        return incidente;
    }

    public void setIncidente(Incidentes incidente) {
        this.incidente = incidente;
    }
    
}
