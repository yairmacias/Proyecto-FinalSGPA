package mx.SGPA.domain;

public class Usuario {

    String nombreUsuario;
    String contraseñaUsuario;
    boolean rolUsuario;
    
    public Usuario(String nombreUsuario, String contraseñaUsuario, boolean rolUsuario){
        this.nombreUsuario = nombreUsuario;
        this.contraseñaUsuario = contraseñaUsuario;
        this.rolUsuario = rolUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseñaUsuario() {
        return contraseñaUsuario;
    }

    public void setContraseñaUsuario(String contraseñaUsuario) {
        this.contraseñaUsuario = contraseñaUsuario;
    }

    public boolean getRolUsuario() {
        return rolUsuario;
    }

    public void setRolUsuario(boolean rolUsuario) {
        this.rolUsuario = rolUsuario;
    }

}
