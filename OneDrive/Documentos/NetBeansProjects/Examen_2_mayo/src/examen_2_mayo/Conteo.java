
package examen_2_mayo;
import javax.swing.JOptionPane;
public class Conteo {
    public static void main(String[] args){
        
 String entrada= JOptionPane.showInputDialog("Introduce tu nota final:");
 int nota= Integer.parseInt(entrada);
 
 if(nota>=10){
   if(nota>=19){
       JOptionPane.showMessageDialog(null,"Felicidades Tienes una beca");
       
   }  else{
       JOptionPane.showMessageDialog(null,"aprobaste la materia.");
   }
 }else{
     if(nota>=8){
         JOptionPane.showMessageDialog(null,"vas a examen de recuperacion");
     }else{
         JOptionPane.showMessageDialog(null,"Reprobaste.");
     }
 }
       
    }
    
}
