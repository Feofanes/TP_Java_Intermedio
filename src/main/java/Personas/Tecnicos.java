
package Personas;

import java.util.ArrayList;

public class Tecnicos extends Personas {
    
    private int ID;
    private String nombre;
    private ArrayList<String> especialidad;
    private int Incidentes_asignados;

    //  CONSTRUCTOR
    public Tecnicos(int ID, String nombre, ArrayList especialidad, int incidentes_resueltos) {
        this.ID = ID;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.Incidentes_asignados = Incidentes_asignados;
    }

    public Tecnicos() {
    }
    
    //  GETTERS AND SETTERS

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(ArrayList especialidad) {
        this.especialidad = especialidad;
    }

    public int getIncidentes_asignados() {
        return Incidentes_asignados;
    }

    public int setIncidentes_asignados(int Incidentes_asignados) {
        this.Incidentes_asignados = Incidentes_asignados;
        
        return Incidentes_asignados;
    }

    
    
    
    

    
    
    
    
}
