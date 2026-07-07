
package practicas;
import javax.swing.JOptionPane;
public class Arreglo03 {
    public static void main(String[] args){
        
    int tam= Integer.parseInt(JOptionPane.showInputDialog("Cuantos arreglos son:"));
   int[] n;
   n=new int[tam];
   
for(int i=0; i<n.length; i++){   
    System.out.println("Tiene arreglos");
  n[i]  =Integer.parseInt(JOptionPane.showInputDialog(null, "cual arreglo de ellos quiere ver: "));

  int suma= n[i] + n[i];
  System.out.println("la suma del los arreglo es : "+suma);
  
}
      
        
        
        
        
        
    }
}
