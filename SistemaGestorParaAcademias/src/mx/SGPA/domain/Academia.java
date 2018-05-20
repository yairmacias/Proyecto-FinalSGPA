
package mx.SGPA.domain;

/**
 *
 * @author Jasiel
 */
public class Academia {
    
    int idAcademia;
    String carrera;
    int nrc;
    int idDocente;
    int idCoordinadorA;
    
    public Academia(int idAcademia, String carrera, int nrc, int idDocente, int idCoordinadorA){
       
        this.idCoordinadorA = idAcademia;
        this.carrera = carrera;
        this.nrc = nrc;
        this.idDocente = idDocente;
        this.idCoordinadorA = idCoordinadorA;
    }

    public int getIdAcademia() {
        return idAcademia;
    }

    public void setIdAcademia(int idAcademia) {
        this.idAcademia = idAcademia;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getNrc() {
        return nrc;
    }

    public void setNrc(int nrc) {
        this.nrc = nrc;
    }

    public int getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(int idDocente) {
        this.idDocente = idDocente;
    }

    public int getIdCoordinadorA() {
        return idCoordinadorA;
    }

    public void setIdCoordinadorA(int idCoordinadorA) {
        this.idCoordinadorA = idCoordinadorA;
    }
    
    
}
