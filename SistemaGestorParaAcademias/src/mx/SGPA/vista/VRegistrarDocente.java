
package mx.SGPA.vista;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import mx.SGPA.DAO.DocenteDAO;
import mx.SGPA.domain.Docente;
import mx.SGPA.domain.Usuario;


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
        textFieldNombreUsuario.getText();
        textFieldContraseñaUsuario.getText();
        
    }    
    
    public void mostrarMensajeFaltanCampos() {
        Alert mensajeFaltanCampos = new Alert(Alert.AlertType.ERROR);
        mensajeFaltanCampos.setTitle("Datos faltantes");
        mensajeFaltanCampos.setHeaderText(null);
        mensajeFaltanCampos.setContentText("Por favor ingrese los campos faltantes");

        mensajeFaltanCampos.showAndWait();
    }
    
    public boolean validarCampos() {
        boolean todosValidos = true;
        if (textFieldNombre.getText().equals("")) {
            mostrarMensajeFaltanCampos();
            textFieldNombre.requestFocus();
            todosValidos = false;
        } else if (textFieldApellidoPaterno.getText().equals("")) {
            mostrarMensajeFaltanCampos();
            textFieldApellidoPaterno.requestFocus();
            todosValidos = false;
        } else if (textFieldApellidoMaterno.getText().equals("")) {
            mostrarMensajeFaltanCampos();
            textFieldApellidoMaterno.requestFocus();
            todosValidos = false;
        } else if (textFieldNombreUsuario.getText().equals("")) {
            mostrarMensajeFaltanCampos();
            textFieldNombreUsuario.requestFocus();
            todosValidos = false;
        } 
        return todosValidos;
    }
    
}
