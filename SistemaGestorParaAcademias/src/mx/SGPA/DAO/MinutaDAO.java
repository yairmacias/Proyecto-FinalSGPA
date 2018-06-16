
package mx.SGPA.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import mx.SGPA.domain.Minuta;
import mx.SGPA.basededatos.ConexionBaseDeDatos;


public class MinutaDAO {
    
    private Connection conexionBD;
    private String consultaSQL;
    private PreparedStatement sentenciaSQL;
    
     public boolean guardarDatosMinuta(Minuta minuta) {
        boolean guardadoRealizado = true;
        consultaSQL = "INSERT INTO minuta (IdMinuta, Carrera, Academia, Hora, Perioda, Fecha, Lugar,) values (?,?,?,?,?,?,?)";
        conexionBD = ConexionBaseDeDatos.getConexionBaseDeDatos();
        try {
            sentenciaSQL = conexionBD.prepareStatement(consultaSQL);
            sentenciaSQL.setInt(1,minuta.getIdMinuta());
            sentenciaSQL.setString(2,minuta.getCarrea());
            sentenciaSQL.setString(3,minuta.getAcademia());
            sentenciaSQL.setInt(4,minuta.getHora());
            sentenciaSQL.setInt(5,minuta.getPeriodo());
            sentenciaSQL.setInt(6,minuta.getFecha());
            sentenciaSQL.setString(7,minuta.getLugar());
            sentenciaSQL.execute();
        } catch (SQLException ex) {
            guardadoRealizado = false;
            Logger.getLogger(MinutaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            
        }
        return guardadoRealizado;
    }
    
}
