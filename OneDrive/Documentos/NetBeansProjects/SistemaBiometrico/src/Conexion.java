
package sistemabiometrico;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
 private static final String URL = "jdbc:mysql://localhost:3306/SistemaBiometrico";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
public static Connection getConnection() {
        Connection link = null;
        try {
            link = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("¡Conexión exitosa a SistemaBiometrico!");
        } catch (SQLException e) {
            System.out.println("Error al conectar: " + e.getMessage());
        }
        return link;
    }
}
