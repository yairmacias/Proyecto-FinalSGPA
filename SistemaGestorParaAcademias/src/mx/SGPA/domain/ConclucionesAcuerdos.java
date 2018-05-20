
package mx.SGPA.domain;

/**
 *
 * @author Jasiel
 */
public class ConclucionesAcuerdos {
    
    String conclionesAcuerdos;
    int idMinuta;
    
    public ConclucionesAcuerdos(String conclucionesAcuerdos, int idMinuta){
        
        this.conclionesAcuerdos = conclucionesAcuerdos;
        this.idMinuta = idMinuta;
    }

    public String getConclionesAcuerdos() {
        return conclionesAcuerdos;
    }

    public void setConclionesAcuerdos(String conclionesAcuerdos) {
        this.conclionesAcuerdos = conclionesAcuerdos;
    }

    public int getIdMinuta() {
        return idMinuta;
    }

    public void setIdMinuta(int idMinuta) {
        this.idMinuta = idMinuta;
    }
    
    
}
