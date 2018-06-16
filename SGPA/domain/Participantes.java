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
public class Participantes {
    
    String nombre;
    int idMinuta;
    
    public Participantes(String nombre, int idMinuta){
        
        this.nombre = nombre;
        this.idMinuta = idMinuta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdMinuta() {
        return idMinuta;
    }

    public void setIdMinuta(int idMinuta) {
        this.idMinuta = idMinuta;
    }
    
    
}
