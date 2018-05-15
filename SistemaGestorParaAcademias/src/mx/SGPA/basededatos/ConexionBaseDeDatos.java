
package mx.SGPA.basededatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConexionBaseDeDatos {

    private static Connection connection;

    private static void makeConnection() {
        try {
            String url = "jdbc:mysql://localhost/";
            String databaseName = "SGPA";
            String userName = "LlaveMaestra";
            String password = "batmanelmejordetodos";

            connection = (Connection) DriverManager.getConnection(url + databaseName, userName, password);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(ConexionBaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Connection getDataBaseConnection() {
        makeConnection();
        return ConexionBaseDeDatos.connection;

    }

    public static void closeConnection() {
        if (connection != null) {
            try {
                if (!connection.isClosed()) {
                    connection.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(ConexionBaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
