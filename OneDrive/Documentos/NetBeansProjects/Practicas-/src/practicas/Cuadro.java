
package practicas;
import javax.swing.JOptionPane;
public class Cuadro {
    public static void main(String[] args){

      String v1= JOptionPane.showInputDialog("Adivina que numero estoy pensando\n indique un numero del 1 al 30:  ");
  
      int c1= Integer.parseInt(v1);
      
     if ((c1 < 1) || (c1 > 30)){
         JOptionPane.showInputDialog("El numero debe estar en el intervalo 1 - 100\n Tienes otra oportunidad");
         c1= Integer.parseInt(v1);
     }
      if (c1 == 24){
          JOptionPane.showMessageDialog(null,"Enhorabuena, has acertado :)");
      }else{
         System.out.println("Lo siento, ese no es el numero que estoy pensado :(");
      }
      
        
        
        
        
        
        
        
    }
    
}
