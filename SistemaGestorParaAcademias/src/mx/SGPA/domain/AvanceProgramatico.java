package mx.SGPA.domain;

public class AvanceProgramatico {

    private int idAvanceProgramatico;
    private int nrc;
    private String experienciaEducativa;
    private int bloque;
    private int seccion;
    private int periodo;
    private String objetivoGeneral;

    public AvanceProgramatico(int idAvanceProgramatico, int nrc, String experienciaEducativa, int bloque, int seccion, int periodo, String objetivoGeneral) {

        this.idAvanceProgramatico = idAvanceProgramatico;
        this.nrc = nrc;
        this.experienciaEducativa = experienciaEducativa;
        this.bloque = bloque;
        this.seccion = seccion;
        this.periodo = periodo;
        this.objetivoGeneral = objetivoGeneral;
    }

    public int getIdAvanceProgramatico() {
        return idAvanceProgramatico;
    }

    public int getNrc() {
        return nrc;
    }

    public String getExperienciaEducativa() {
        return experienciaEducativa;
    }

    public int getBloque() {
        return bloque;
    }

    public int getSeccion() {
        return seccion;
    }

    public int getPeriodo() {
        return periodo;
    }

    public String getObjetivoGeneral() {
        return objetivoGeneral;
    }

    public void setIdAvanceProgramatico(int idAvanceProgramatico) {
        this.idAvanceProgramatico = idAvanceProgramatico;
    }

    public void setNrc(int nrc) {
        this.nrc = nrc;
    }

    public void setExperienciaEducativa(String experienciaEducativa) {
        this.experienciaEducativa = experienciaEducativa;
    }

    public void setBloqeu(int bloque) {
        this.bloque = bloque;
    }

    public void setSeccion(int seccion) {
        this.seccion = seccion;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public void setObjetivoGeneral(String objetivoGeneral) {
        this.objetivoGeneral = objetivoGeneral;
    }

}
