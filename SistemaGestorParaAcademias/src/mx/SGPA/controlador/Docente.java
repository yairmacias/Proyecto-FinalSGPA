
package mx.SGPA.controlador;


public class Docente {

    String apellidoPaterno;
    String apellidoMaterno;
    String nombre;
    
    public Docente(String nombre, String apellidoPaterno, String apellidoMaterno){
        
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        
    }

    public String getApellidoPaterno() {
        return apellidoMaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoMaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {

        return apellidoMaterno;
    }

    public void setapellidoM(String apellidoPaterno) {
        this.apellidoMaterno = apellidoPaterno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;

    }
}
