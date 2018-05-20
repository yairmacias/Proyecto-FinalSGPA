
package mx.SGPA.domain;

/**
 *
 * @author Jasiel
 */
public class CalendarioEvaluacion {
    
    int unidad;
    int fechas;
    String cirterioEvaluacion;
    String instrumento;
    int porcentaje;
    int idPlanCurso;
    
    public CalendarioEvaluacion(int unidad, int fechas, String criteriosEvaluacion, String instrumento, int porcentaje, int idPlanCurso){
        
        this.unidad = unidad;
        this.fechas = fechas;
        this.cirterioEvaluacion = criteriosEvaluacion;
        this.instrumento = instrumento;
        this.porcentaje = porcentaje;
        this.idPlanCurso = idPlanCurso;
   }

    public int getUnidad() {
        return unidad;
    }

    public void setUnidad(int unidad) {
        this.unidad = unidad;
    }

    public int getFechas() {
        return fechas;
    }

    public void setFechas(int fechas) {
        this.fechas = fechas;
    }

    public String getCirterioEvaluacion() {
        return cirterioEvaluacion;
    }

    public void setCirterioEvaluacion(String cirterioEvaluacion) {
        this.cirterioEvaluacion = cirterioEvaluacion;
    }

    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public int getIdPlanCurso() {
        return idPlanCurso;
    }

    public void setIdPlanCurso(int idPlanCurso) {
        this.idPlanCurso = idPlanCurso;
    }
}
