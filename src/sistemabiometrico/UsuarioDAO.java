package sistemabiometrico;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*;
import sistemabiometrico.Conexion;
import java.sql.SQLException;
import javax.swing.*;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
public class UsuarioDAO {
    
    
    //metodo que consulta si el usuario y contraseña son correctos 
    public String validarUsuario(String usuario, String pass){
        String rol= null;
        System.out.println("Intentando loguar con: " +usuario + " y " + pass);
        //SQL con signo ? para prevenir ataques de inyeccion SQL
        String sql= "SELECT rol FROM usuarios WHERE nombre_usuario = ? AND password = ?";
        System.out.println("SQL: " + sql); // Imprime la consulta
    System.out.println("Buscando: " + usuario + " con pass: " + pass);
        
        //try- with- resource para asegurar que la conexion se sierra solo a terminar 
        try(Connection con = new  Conexion().getConnection();
             PreparedStatement  ps = con.prepareStatement(sql)){
         //asignamos los valores de los campor de txto    
            ps.setString(1, usuario);
            ps.setString(2, pass);
         //ejecutamos la consulta y guardamos el resultado    
        try(ResultSet rs = ps.executeQuery()){
            //si rs.net es verdadero sipnifica que encontrol un usuario
            if(rs.next()){
                rol = rs.getString("rol");// Obtenemos el rol Admistrativo o portero
            }
        }
        }catch(Exception e){
            //mostramos un mensaje claro al usuario en caso de fallo
            JOptionPane.showMessageDialog(null,"Error en Login: "+ e.getMessage());
        }
            return rol;// devolvemos el rol encntotrado (o null si el login fallo
        
    }         
       
            
        /**
 * Método para registrar un nuevo usuario en la base de datos.
 * @param nombre El nombre obtenido del campo de texto.
 * @param id El identificador único obtenido del campo de texto.
 * @param categoria La categoría seleccionada en el ComboBox.
 * @return true si el registro fue exitoso, false si ocurrió un error.
 */
    public boolean registrarPersona(String nombre, String id, String categoria) {
    // La consulta SQL con '?' son parámetros que evitarn inyección de datos inseguros
    String sql = "INSERT INTO personas (nombre_apellido, identificacion, categoria) VALUES (?, ?, ?)";
    
    try (Connection con= new Conexion().getConnection();
    PreparedStatement ps= con.prepareStatement(sql)){
        
        // Asignamos los valores a los signos de interrogación según su orden
        ps.setString(1, nombre);    // Primer '?'
        ps.setString(2, id);        // Segundo '?'
        ps.setString(3, categoria); // Tercer '?'
        
       int filasAfectadas= ps.executeUpdate();
       

        // Si todo sale bien, devolvemos 'true'
        return filasAfectadas > 0; 
        
    } catch (SQLException e) {
        // Si algo falla (ej. conexión perdida o ID duplicado), capturamos el error
        JOptionPane.showMessageDialog(null,"Error al registrar usuario:" + e.getMessage());
        return false; // Devolvemos 'false' para avisar al usuario
    }
     
}
    public List<Personas> ListarPersona() {
        List<Personas> lista= new ArrayList<>();
        String sql= "SELECT nombre_apellido, identificacion, categoria FROM personas";
    
try (Connection con = new Conexion().getConnection();
         PreparedStatement ps = con.prepareStatement(sql);
         ResultSet rs = ps.executeQuery()) {
        
        while (rs.next()) {
            Personas p = new Personas(
                rs.getString("nombre_apellido"),
                rs.getString("identificacion"),
                rs.getString("categoria")
            );
            lista.add(p);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return lista;
}
    public boolean eliminarPersona(String identificacion) {
    String sql = "DELETE FROM personas WHERE identificacion = ?";
    try (Connection con = new Conexion().getConnection();
         PreparedStatement ps = con.prepareStatement(sql)) {
        ps.setString(1, identificacion);
        ps.executeUpdate();
        return true;
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}

public boolean actualizarPersona(String nombre, String identificacion, String categoria) {
    String sql = "UPDATE personas SET nombre_apellido = ?, categoria = ? WHERE identificacion = ?";
    try (Connection con = new Conexion().getConnection();
         PreparedStatement ps = con.prepareStatement(sql)) {
        ps.setString(1, nombre);
        ps.setString(2, categoria);
        ps.setString(3, identificacion);
        ps.executeUpdate();
        return true;
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}
}

  
            
       
 
