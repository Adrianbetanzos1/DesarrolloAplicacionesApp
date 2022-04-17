
package conexion;
import java.sql.*;
import javax.swing.*;


public class ConexionSql {

    Connection conectar = null;
    //String driverName = "com.mysql.jdbc.Driver";
    String url = "jdbc:mysql://localhost/tiendatenis"; // ruta de la base de datos
    String usuario = "root";
    String contraseña = "Ambetanzos1";

    public Connection conexion() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = (Connection) DriverManager.getConnection(url, usuario, contraseña);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de Conexión " + e.getMessage());
        }

        return conectar;


    }

}
