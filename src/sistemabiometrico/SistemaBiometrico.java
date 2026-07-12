
package sistemabiometrico;

public class SistemaBiometrico {

    
    public static void main(String[] args) {
       
        Conexion.getConnection();
        Conexion miConexion= new Conexion();
        
        if(miConexion.getConnection() != null){
            System.out.println("El sistema esta lsito para operar.");
        }else {
            System.out.println("el sistema no pudo concetar");
        }
        
        
        
    }
    
}
