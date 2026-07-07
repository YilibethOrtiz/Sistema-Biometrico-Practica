
package examen_2_mayo;

import javax.swing.JOptionPane;


public class EvaluadorDeClima {
    public static void main(String[] args){
        
 String v1= JOptionPane.showInputDialog("Cual es la temperatura actual");
double temperatura= Double.parseDouble(v1);
        
        
  if(temperatura < 10){
      
      JOptionPane.showMessageDialog(null,"Hace Mucho Frio");
  }else if(temperatura <= 20){
      JOptionPane.showMessageDialog(null,"Clima Fresco");
  }else if(temperatura <= 30){
      JOptionPane.showMessageDialog(null,"Clima Templado");
  }else{
      JOptionPane.showMessageDialog(null,"Hace Mucha Calor");
  }
        
       
        
        
        
        
    }
    
}
