
package sistemabiometrico;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    //credenciales para acceder a nuestra base de datos 
 private static final String URL = "jdbc:mysql://localhost:3306/SistemaBiometrico";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
    //establecer conexion fisica con el servidor MySQL
public static Connection getConnection() {
        Connection link = null;
        try {
            //conexion con el driver JDBC
            link = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("¡Conexión exitosa a SistemaBiometrico!");
        } catch (SQLException e) {
            //si algo sale mal dira error al conectar
            System.out.println("Error al conectar: " + e.getMessage());
        }
        return link;//retornamos el enlace para ser usado por otra clases
    }

    }

