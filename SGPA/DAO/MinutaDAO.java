
package mx.SGPA.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
        consultaSQL = "INSERT INTO cliente (Nombre_Usuario ,Contraseña_Usuario, Nombre, Apellido_Paterno ,Apellido_Materno, Num_Telefonico , Email, Codigo_Postal,  Pais, Ciudad, Tipo_Tarjeta, Numero_Tarjeta) values (?,?,?,?,?,?,?,?,?,?,?,?)";
        conexionBD = ConexionBaseDeDatos.getConexionBaseDeDatos();
        try {
            sentenciaSQL = conexionBD.prepareStatement(consultaSQL);
            sentenciaSQL.setString(1, minuta.getNombreUsuario());
            sentenciaSQL.setString(2, minuta.getContraseñaUsuario());
            sentenciaSQL.setString(3, minuta.getNombre());
            sentenciaSQL.setString(4, minuta.getApellidoPaterno());
            sentenciaSQL.setString(5, minuta.getApellidoMaterno());
            sentenciaSQL.setLong(6, minuta.getNumeroTelefonico());
            sentenciaSQL.setString(7, minuta.getEmail());
            sentenciaSQL.setInt(8, minuta.getCodigoPostal());
            sentenciaSQL.setString(9, minuta.getPais());
            sentenciaSQL.setString(10, minuta.getCiudad());
            sentenciaSQL.setString(11, minuta.getMetodoDePago().getTipoTarjeta());
            sentenciaSQL.setLong(12, minuta.getMetodoDePago().getNumeroTarjeta());
            sentenciaSQL.execute();
        } catch (SQLException ex) {
            guardadoRealizado = false;
            Logger.getLogger(CasaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DataBase.closeConnection();
        }
        return guardadoRealizado;
    }
    
}
