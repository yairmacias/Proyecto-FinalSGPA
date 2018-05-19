
package mx.SGPA.vista;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import mx.SGPA.domain.Docente;


public class VRegistrarDocente implements Initializable {

    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String nombreUsuario;
    private String contraseñaUsuario;
    
    private Docente docenteDAO;
    @FXML
    private TextField textFieldNombre;
    @FXML
    private TextField textFieldApellidoPaterno;
    @FXML
    private TextField textFieldApellidoMaterno;
    @FXML
    private TextField textFieldNombreUsuario;
    @FXML
    private TextField textFieldContraseñaUsuario;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    
    
}
