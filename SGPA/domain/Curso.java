
package mx.SGPA.domain;

/**
 *
 * @author Jasiel
 */
public class Curso {
    
    int idCurso;
    int periodo;
    int bloque;
    
    public Curso(int idCurso, int periodo, int bloque){
        
        this.idCurso = idCurso;
        this.periodo = periodo;
        this.bloque = bloque;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public int getBloque() {
        return bloque;
    }

    public void setBloque(int bloque) {
        this.bloque = bloque;
    }
    
    
}