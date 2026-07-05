import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*;
import sistemabiometrico.Conexion;
public class UsuarioDAO {
    public String validarUsuario(String usuario, String pass){
        String rol= null;
        String sql= "SELECT rol FROM usuarios WHERE nombre_usuario = ? AND password = ?";
        
        try(Connection con = new  Conexion().getConnection();
             PreparedStatement  ps = con.prepareStatement(sql)){
            
            ps.setString(1, usuario);
            ps.setString(2, pass);
            
        try(ResultSet rs = ps.executeQuery()){
            if(rs.next()){
                rol = rs.getString("rol");
            }
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error en Login: "+ e.getMessage());
        }
            return rol;
        
    }
}
