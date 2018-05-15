
package mx.SGPA.controlador;


public class CoordinadorAcademia {

    String apellidoPaterno;
    String apellidoMaterno;
    String nombre;
    
    public CoordinadorAcademia(String nombre,String apellidoPaterno , String apellidoMaterno){
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoP) {
        this.apellidoPaterno = apellidoP;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoM) {
        this.apellidoMaterno = apellidoM;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
