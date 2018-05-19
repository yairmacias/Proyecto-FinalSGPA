package mx.SGPA.domain;

public class Docente {

    String apellidoPaterno;
    String apellidoMaterno;
    String nombre;
    private Usuario usuario;

    public Docente(String nombre, String apellidoPaterno, String apellidoMaterno, Usuario usuario) {

        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.usuario = usuario;

    }
    
    public Docente(){
        
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
