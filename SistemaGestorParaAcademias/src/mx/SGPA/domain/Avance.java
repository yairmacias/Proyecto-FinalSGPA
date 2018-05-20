
package mx.SGPA.domain;

/**
 *
 * @author Jasiel
 */
public class Avance {
    
    int unbidad;
    int porcentajeAvance;
    String observaciones;
    int idAvanceProgramatico;
    
    public Avance(int unidad, int porcentajeAvance, String observaciones, int idAvanceProgramatico){
         
        this.unbidad = unidad;
        this.porcentajeAvance = porcentajeAvance;
        this.observaciones = observaciones;
        this.idAvanceProgramatico = idAvanceProgramatico;
    }
    
    public int getUnbidad() {
        return unbidad;
    }

    public void setUnbidad(int unbidad) {
        this.unbidad = unbidad;
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
