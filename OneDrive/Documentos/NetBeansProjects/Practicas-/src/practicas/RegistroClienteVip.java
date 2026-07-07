
package practicas;

import javax.swing.JOptionPane;
public class RegistroClienteVip {
    public static void main(String[] args){
        
        
 int tam= Integer.parseInt(JOptionPane.showInputDialog("Cuantos clientes desea registrar"));
 String[] cliente= new String[tam];
        
        
for(int i=0; i<cliente.length; i++){
    cliente[i]= JOptionPane.showInputDialog("Nombre del cliente "+(i+1));
    
}        
        
 System.out.println("El primer cliente en registrarse fue: "+cliente[0]);
 System.out.println("El ultimo cliente en registrarse fue: "+cliente[cliente.length - 1]);
        
        
        
        
        
        
    }
}
