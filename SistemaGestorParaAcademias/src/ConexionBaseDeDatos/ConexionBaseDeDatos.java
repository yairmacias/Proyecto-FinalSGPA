/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionBaseDeDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Kevin
 */
public class ConexionBaseDeDatos {

    Connection conexionBaseDeDatos = null;
    final String direccionBaseDeDatos = "jdbc:mysql://localhost:3306/";
    final String nombreBaseDeDatos = "SGPA";
    final String controladorBaseDeDatos = "com.mysql.jdbc.Driver";
    final String nombreUsuario = "LlaveMaestra";
    final String contraseñaBaseDeDatos = "batmanelmejordetodos";

    public void conexionABaseDeDatos() {

        try {
            Class.forName(controladorBaseDeDatos).newInstance();
            conexionBaseDeDatos = DriverManager.getConnection(direccionBaseDeDatos + nombreBaseDeDatos, nombreUsuario,
                    contraseñaBaseDeDatos);
            if (!conexionBaseDeDatos.isClosed()) {
                System.out.println("Conexion realizada");
            }

        } catch (Exception e) {
            System.err.println(e);
        }

    }

    public void eliminarDatos() throws SQLException {
        conexionABaseDeDatos();
        PreparedStatement stmt = conexionBaseDeDatos.prepareStatement("DELETE FROM `sgpa`.`docente`\n" + "WHERE ID_Docente = 1");
        int rs = stmt.executeUpdate();
        stmt.close();
        conexionBaseDeDatos.close();

    }

    public void extraccionDeDatos() throws SQLException {
        conexionABaseDeDatos();
        PreparedStatement stmt = conexionBaseDeDatos.prepareStatement("SELECT * FROM Docente where ID_Docente = ? and Nombre = ?;");
        int rs = stmt.executeUpdate();
        stmt.close();
        conexionBaseDeDatos.close();

    }

    public void actualizacionDeDatos() throws SQLException {
        conexionABaseDeDatos();
        PreparedStatement stmt = conexionBaseDeDatos.prepareStatement("UPDATE * ;");
        int rs = stmt.executeUpdate();
        stmt.close();
        conexionBaseDeDatos.close();
    }
    
    public void consultarDatos() throws SQLException {
        conexionABaseDeDatos();
        PreparedStatement stmt = conexionBaseDeDatos.prepareStatement(";");
        int rs = stmt.executeUpdate();
        stmt.close();
        conexionBaseDeDatos.close();
    }
}
