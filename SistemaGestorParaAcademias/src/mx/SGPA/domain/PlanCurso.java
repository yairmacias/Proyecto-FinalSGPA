package mx.SGPA.domain;

public class PlanCurso {

    int idPlanCurso;
    String programaEducativo;
    int bloque;
    int seccion;
    String academico;
    int periodo;
    String objetivoGeneral;
    private Planeacion planeacion;
    private Bibliografia bibliografia;
    private CalendarioEvaluacion calendarioEvaluacion;

    public PlanCurso(int idPlanCurso, String programaEducativo, int bloque, int seccion, String academico, int periodo,
            String objetivoGeneral, Planeacion planeacion, Bibliografia bibliografia, CalendarioEvaluacion calendarioEvaluacion) {

        this.idPlanCurso = idPlanCurso;
        this.programaEducativo = programaEducativo;
        this.bloque = bloque;
        this.seccion = seccion;
        this.academico = academico;
        this.periodo = periodo;
        this.objetivoGeneral = objetivoGeneral;
        this.planeacion = planeacion;
        this.bibliografia = bibliografia;
        this.calendarioEvaluacion = calendarioEvaluacion;

    }

    public int getIdPlanCurso() {
        return idPlanCurso;
    }

    public void setIdPlanCurso(int idPlanCurso) {
        this.idPlanCurso = idPlanCurso;
    }

    public String getProgramaEducativo() {
        return programaEducativo;
    }

    public void setProgramaEducativo(String programaEducativo) {
        this.programaEducativo = programaEducativo;
    }

    public int getBloque() {
        return bloque;
    }

    public void setBloque(int bloque) {
        this.bloque = bloque;
    }

    public void setPlaneacion(Planeacion planeacion) {
        this.planeacion = planeacion;
    }

    public Planeacion getPlaneacion() {
        return planeacion;
    }

    public int getSeccion() {
        return seccion;
    }

    public void setSeccion(int seccion) {
        this.seccion = seccion;
    }

    public String getAcademico() {
        return academico;
    }

    public void setAcademico(String academico) {
        this.academico = academico;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public String getObjetivoGeneral() {
        return objetivoGeneral;
    }

    public void setObjetivoGeneral(String objetivoGeneral) {
        this.objetivoGeneral = objetivoGeneral;
    }

    public void setBibliografia(Bibliografia bibliografia) {
        this.bibliografia = bibliografia;
    }

    public Bibliografia getBibliografia() {
        return bibliografia;
    }

    public void setCalendarioEvlaucion(CalendarioEvaluacion calendarioEvaluacion) {
        this.calendarioEvaluacion = calendarioEvaluacion;
    }

    public CalendarioEvaluacion getCalendarioEvaluacion() {
        return calendarioEvaluacion;
    }

}
