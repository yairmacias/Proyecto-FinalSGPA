
package mx.SGPA.domain;


public class TemasTratar {
   
    String temasTratar;
    int idMinuta;
    
    public TemasTratar(String temasTratar, int idMinuta){
        
        this.temasTratar = temasTratar;
        this.idMinuta = idMinuta;
    }

    public String getTemasTratar() {
        return temasTratar;
    }

    public void setTemasTratar(String temasTratar) {
        this.temasTratar = temasTratar;
    }

    public int getIdMinuta() {
        return idMinuta;
    }

    public void setIdMinuta(int idMinuta) {
        this.idMinuta = idMinuta;
    }
    
    
}
