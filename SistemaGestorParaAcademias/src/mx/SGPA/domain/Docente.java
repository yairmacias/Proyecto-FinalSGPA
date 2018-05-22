
package mx.SGPA.domain;


public class Docente {

    String apellidoPaterno;
    String apellidoMaterno;
    String nombre;
    private Usuario usuario;
    
    public Docente(String apellidoPaterno, String apellidoMaterno, String nombre, Usuario usuario){
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.usuario = usuario;
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
    
    public Usuario getUsuario(){
        return usuario;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombreD) {
        this.nombre = nombreD;

    }
    
    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
    }
}
