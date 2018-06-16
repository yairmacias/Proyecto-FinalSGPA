
package mx.SGPA.domain;


public class Planeacion {
    
    int unidad;
    String temas;
    int fechas;
    String tareasPracticas;
    String tecnicaDidactica;
    int idPlanCurso;
    
    public Planeacion(int unidad, String temas, int fechas, String tareasPracticas, String tecnicasDidacticas, int idPlanCurso ){
        
        this.unidad = unidad;
        this.temas = temas;
        this.fechas = fechas;
        this.tareasPracticas = tareasPracticas;
        this.tecnicaDidactica = tecnicasDidacticas;
        this.idPlanCurso = idPlanCurso;
    }

    public int getUnidad() {
        return unidad;
    }

    public void setUnidad(int unidad) {
        this.unidad = unidad;
    }

    public String getTemas() {
        return temas;
    }

    public void setTemas(String temas) {
        this.temas = temas;
    }

    public int getFechas() {
        return fechas;
    }

    public void setFechas(int fechas) {
        this.fechas = fechas;
    }

    public String getTareasPracticas() {
        return tareasPracticas;
    }

    public void setTareasPracticas(String tareasPracticas) {
        this.tareasPracticas = tareasPracticas;
    }

    public String getTecnicaDidactica() {
        return tecnicaDidactica;
    }

    public void setTecnicaDidactica(String tecnicaDidactica) {
        this.tecnicaDidactica = tecnicaDidactica;
    }

    public int getIdPlanCurso() {
        return idPlanCurso;
    }

    public void setIdPlanCurso(int idPlanCurso) {
        this.idPlanCurso = idPlanCurso;
    }
    
    
}
