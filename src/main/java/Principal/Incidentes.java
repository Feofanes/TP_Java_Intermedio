
package Principal;

public class Incidentes {
    
    private String tipo_incidente;
    private String descripcion;
    private int tiempo_reparacion;

    //  CONSTRUCTORES
    public Incidentes(){}
    public Incidentes(String tipo_incidente) {
        this.tipo_incidente = tipo_incidente;
    }
    public Incidentes(String tipo_incidente, String descripcion) {
        this.tipo_incidente = tipo_incidente;
        this.descripcion = descripcion;
    }
    public Incidentes(String tipo_incidente, String descripcion, int tiempo_reparacion) {
        this.tipo_incidente = tipo_incidente;
        this.descripcion = descripcion;
        this.tiempo_reparacion = tiempo_reparacion;
    }
    
    //  GETTERS AND SETTERSSS

    public String getTipo_incidente() {
        return tipo_incidente;
    }

    public void setTipo_incidente(String tipo_incidente) {
        this.tipo_incidente = tipo_incidente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getTiempo_reparacion() {
        return tiempo_reparacion;
    }

    public void setTiempo_reparacion(int tiempo_reparacion) {
        this.tiempo_reparacion = tiempo_reparacion;
    }
    
    
    
    
    
    
}
