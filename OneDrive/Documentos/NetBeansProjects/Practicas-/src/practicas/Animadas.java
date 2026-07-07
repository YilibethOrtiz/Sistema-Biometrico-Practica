
package practicas;
import javax.swing.JOptionPane;
public class Animadas {
    public static void main(String[] args){
        
        int tam= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese cantidad"));
        
        String nombre[]= new String[tam];
        
        for(int i=0; i<nombre.length; i++){
            nombre[i]= (JOptionPane.showInputDialog(null, "ingrese su numero"+(i+1)));
            System.out.println(nombre[i]);
        }
    }
}
