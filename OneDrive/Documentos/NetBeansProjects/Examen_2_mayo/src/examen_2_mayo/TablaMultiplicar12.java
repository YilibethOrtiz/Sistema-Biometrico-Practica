
package examen_2_mayo;
import javax.swing.JOptionPane;
public class TablaMultiplicar12 {
  public static void main(String[] args){
      
    int v1= Integer.parseInt(JOptionPane.showInputDialog("Intruduce un numero para su tabla"));
    
    System.out.println("---Tabla del " + v1 + "---");
      
 for(int i=1; i<= 12; i++){
     int resultado= v1 * i;
     System.out.println(v1+ " x " +i+ "="+resultado);
 }     
        
  }  
}
