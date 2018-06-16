
package mx.SGPA.domain;


public class Avance {
    
    int unidad;
    int porcentajeAvance;
    String observaciones;
    int idAvanceProgramatico;
    
    public Avance(int unidad, int porcentajeAvance, String observaciones, int idAvanceProgramatico){
         
        this.unidad = unidad;
        this.porcentajeAvance = porcentajeAvance;
        this.observaciones = observaciones;
        this.idAvanceProgramatico = idAvanceProgramatico;
    }
    
    public int getUnbidad() {
        return unidad;
    }

    public void setUnbidad(int unbidad) {
        this.unidad = unbidad;
    }

    public int getPorcentajeAvance() {
        return porcentajeAvance;
    }

    public void setPorcentajeAvance(int porcentajeAvance) {
        this.porcentajeAvance = porcentajeAvance;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public int getIdAvanceProgramatico() {
        return idAvanceProgramatico;
    }

    public void setIdAvanceProgramatico(int idAvanceProgramatico) {
        this.idAvanceProgramatico = idAvanceProgramatico;
    }
}
