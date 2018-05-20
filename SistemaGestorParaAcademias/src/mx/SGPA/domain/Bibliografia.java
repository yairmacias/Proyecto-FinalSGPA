
package mx.SGPA.domain;

/**
 *
 * @author Jasiel
 */
public class Bibliografia {
    
    String autorApellidoNombre;
    String titulo;
    String editorial;
    int año;
    int idPlanCurso;
    
    public Bibliografia(String autorApellidoNombre, String titulo, String editorial, int año, int idPlanCurso){
        
        this.autorApellidoNombre = autorApellidoNombre;
        this.titulo = titulo;
        this.editorial = editorial;
        this.año = año;
        this.idPlanCurso = idPlanCurso;
    }

    public String getAutorApellidoNombre() {
        return autorApellidoNombre;
    }

    public void setAutorApellidoNombre(String autorApellidoNombre) {
        this.autorApellidoNombre = autorApellidoNombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getIdPlanCurso() {
        return idPlanCurso;
    }

    public void setIdPlanCurso(int idPlanCurso) {
        this.idPlanCurso = idPlanCurso;
    }
    
    
}
