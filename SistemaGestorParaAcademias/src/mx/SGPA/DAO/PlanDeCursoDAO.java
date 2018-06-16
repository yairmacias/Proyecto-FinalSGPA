
package mx.SGPA.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import mx.SGPA.domain.PlanCurso;
import mx.SGPA.basededatos.ConexionBaseDeDatos;


public class PlanDeCursoDAO {
    
  private Connection conexionBD;
    private String consultaSQL;
    private PreparedStatement sentenciaSQL;
    private String PlanCursoDAO;
    
     public boolean guardarDatosMinuta(PlanCurso planC) throws SQLException {
        boolean guardadoRealizado = true;
        consultaSQL = "INSERT INTO PlanCurso (Academico, ObjetivoGeneral, ProgramaEducativo, Bloque, IdPlanCurso, Periodo, Seccion) values (?,?,?,?,?,?,?)";
        conexionBD = ConexionBaseDeDatos.getConexionBaseDeDatos();
        try  {
            sentenciaSQL = conexionBD.prepareStatement(consultaSQL);
            sentenciaSQL.setString(1, planC.getAcademico());
            sentenciaSQL.setString(2, planC.getObjetivoGeneral());
            sentenciaSQL.setString(3, planC.getProgramaEducativo());
            sentenciaSQL.setInt(4, planC.getBloque());
            sentenciaSQL.setInt(5, planC.getIdPlanCurso());
            sentenciaSQL.setInt(6, planC.getPeriodo());
            sentenciaSQL.setInt(7, planC.getSeccion());
            
        } catch (SQLException ex) {
            guardadoRealizado = false;
            Logger.getLogger(PlanCurso.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            
        }
        return guardadoRealizado;
    
    }
}