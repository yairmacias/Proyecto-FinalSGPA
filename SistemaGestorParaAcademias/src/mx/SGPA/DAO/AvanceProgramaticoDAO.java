
package mx.SGPA.DAO;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import mx.SGPA.domain.Minuta;
import mx.SGPA.basededatos.ConexionBaseDeDatos;
import mx.SGPA.domain.AvanceProgramatico;


public class AvanceProgramaticoDAO {
    
    private Connection conexionBD;
    private String consultaSQL;
    private PreparedStatement sentenciaSQL;
    
     public boolean guardarDatosAvanceProgramatico(AvanceProgramatico avanceP) throws SQLException {
        boolean guardadoRealizado = true;
        consultaSQL = "INSERT INTO avanceP(Bloque, ExperienciaeEducativa, ObjetivoGeneral, IdAvanceProgramatico, Nrc, Periodo, Seccion) values (?,?,?,?,?,?,7)";
        conexionBD = ConexionBaseDeDatos.getConexionBaseDeDatos();
        try{
            sentenciaSQL = conexionBD.prepareStatement(consultaSQL);
            sentenciaSQL.setInt(1, avanceP.getBloque());
            sentenciaSQL.setString(2, avanceP.getExperienciaEducativa());
            sentenciaSQL.setString(3, avanceP.getObjetivoGeneral());
            sentenciaSQL.setInt(4, avanceP.getIdAvanceProgramatico());
            sentenciaSQL.setInt(5, avanceP.getNrc());
            sentenciaSQL.setInt(6, avanceP.getPeriodo());
            sentenciaSQL.setInt(7, avanceP.getSeccion());
            sentenciaSQL.execute();
        } catch (SQLException ex){
            guardadoRealizado = false;
            Logger.getLogger(AvanceProgramaticoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            
        }
        return guardadoRealizado;
     }
}
