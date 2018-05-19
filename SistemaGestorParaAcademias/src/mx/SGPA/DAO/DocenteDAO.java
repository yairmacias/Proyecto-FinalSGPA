
package mx.SGPA.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import mx.SGPA.domain.Docente;
import mx.SGPA.basededatos.ConexionBaseDeDatos;

public class DocenteDAO {
    
    private Connection conexionDB;
    private String consultaSQL;
    private PreparedStatement sentenciaSQL;
    
       public boolean guardarDatosDocente(Docente docente) {
        boolean guardadoRealizado = true;
        consultaSQL = "INSERT INTO cliente () values (?,?,?,?,?,?)";
        conexionDB = ConexionBaseDeDatos.getDataBaseConnection();
        try {
            sentenciaSQL = conexionDB.prepareStatement(consultaSQL);
            sentenciaSQL.setString(1, docente.getNombre());
            sentenciaSQL.setString(2, docente.getApellidoPaterno());
            sentenciaSQL.setString(3, docente.getApellidoMaterno());
            sentenciaSQL.setString(4, docente.getUsuario().getNombreUsuario());
            sentenciaSQL.setString(5, docente.getUsuario().getContraseñaUsuario());
            sentenciaSQL.setBoolean(6, docente.getUsuario().getRolUsuario());
            sentenciaSQL.execute();
        } catch (SQLException ex) {
            guardadoRealizado = false;
            Logger.getLogger(DocenteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexionBaseDeDatos.closeConnection();
        }
        return guardadoRealizado;
    }

}
    
    
    
    

