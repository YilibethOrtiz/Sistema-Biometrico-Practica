
package examen_2_mayo;
import javax.swing.JOptionPane;
public class ValidadordeEtapadevida {
    public static void main(String[] args){
        
 int edad= Integer.parseInt(JOptionPane.showInputDialog("Cual es tu edad"));
 
 if(edad < 18){
     System.out.println("Menor de edad");
     
 }else if(edad <= 60){
     System.out.println("Adulto Joven");
  
  }else{
     System.out.println("Adulto Mayor");
 }
 
        
    
        
    }
    
}
