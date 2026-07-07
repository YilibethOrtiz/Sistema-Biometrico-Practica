
package practicas;
import javax.swing.JOptionPane;
public class PreciosDeComercio {
    public static void main(String[] args){
      
int v1=Integer.parseInt(JOptionPane.showInputDialog("Cuantos precios desea registrar"));
 double[] precio= new double[v1];
 for(int i=0; i<precio.length; i++){
     precio[i]= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio "+(i+1)));
     if(precio[i]>= 100){
         System.out.println("Precio de categoria VIP, Puesto:  "+ i);
     }
     
 }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
