
package mx.SGPA.domain;


public class ExperienciaEducativa {
    
    int idExperienciaEducativa;
    String nombre;
    int idDocente;
    
    public ExperienciaEducativa(int idExperienciaEducativa, String nombre, int idDocente){
        this.idExperienciaEducativa = idExperienciaEducativa;
        this.nombre = nombre;
        this.idDocente = idDocente;
    }
}
