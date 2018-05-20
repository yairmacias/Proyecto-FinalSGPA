/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.SGPA.domain;

/**
 *
 * @author Jasiel
 */
public class PlanCurso {
    
    int idPlanCurso;
    String programaEducativo;
    int bloque;
    int seccion;
    String academico;
    int periodo;
    String objetivoGeneral; 
    
    public PlanCurso(int idPlanCurso, String programaEducativo, int bloque, int seccion, String academico, int periodo, String objetivoGeneral){
        
        this.idPlanCurso = idPlanCurso;
        this.programaEducativo = programaEducativo;
        this.bloque = bloque;
        this.seccion = seccion;
        this.academico = academico;
        this.periodo = periodo;
        this.objetivoGeneral = objetivoGeneral;
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
    
    
}
