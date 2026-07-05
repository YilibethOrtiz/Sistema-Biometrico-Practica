import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*;
import sistemabiometrico.Conexion;
public class UsuarioDAO {
    
    
    //metodo que consulta si el usuario y contraseña son correctos 
    public String validarUsuario(String usuario, String pass){
        String rol= null;
        System.out.println("Intentando loguar con: " +usuario + "y" + pass);
        //SQL con signo ? para prevenir ataques de inyeccion SQL
        String sql= "SELECT rol FROM usuarios WHERE nombre_usuario = ? AND password = ?";
        
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
}
