
package mx.SGPA.domain;

/**
 *
 * @author Jasiel
 */
public class AspectoAgenda {
    
    String nombreParticipante;
    String asunto;
    int idMinuta;

    
    public AspectoAgenda(String nombreParticipante, String asunto, int idMinuta){
        
        this.nombreParticipante = nombreParticipante;
        this.asunto = asunto;
        this.idMinuta = idMinuta;
    }
    
    public String getNombreParticipante() {
        return nombreParticipante;
    }

    public void setNombreParticipante(String nombreParticipante) {
        this.nombreParticipante = nombreParticipante;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public int getIdMinuta() {
        return idMinuta;
    }

    public void setIdMinuta(int idMinuta) {
        this.idMinuta = idMinuta;
    }
}
