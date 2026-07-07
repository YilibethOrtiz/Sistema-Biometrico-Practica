
package practicas;
import javax.swing.JOptionPane;
public class CensoDeEdades {
    public static void main(String[] args){
        
        int tam=Integer.parseInt(JOptionPane.showInputDialog("cual es la Edad: "));
        int edad[]= new int[tam];
        
        int mayores= 0;
        int menores= 0;
        
        for(int i=0; i<edad.length; i++){
            if(edad[i]>=18){
                mayores++;
            }else{
                menores++;
            }
        }
        JOptionPane.showMessageDialog(null,"Es mayor : "+mayores+ "\n Es menor:  " +menores);
        
        
        
    }
    
}
