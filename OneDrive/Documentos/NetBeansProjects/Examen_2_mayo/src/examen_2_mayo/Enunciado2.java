
package examen_2_mayo;
import javax.swing.JOptionPane;
public class Enunciado2 {
    public static void main(String[] args){
        
 /*
   Enunciado 2 (Nivel Intermedio): Solicita al usuario mediante 
        una ventana JOptionPane su temperatura corporal actual.
        Si la temperatura es mayor o igual a 38,
        muestra un mensaje que diga 'Tienes fiebre'; de lo contrario, 
        muestra 'Tu temperatura es normal'. 
        
        
        */       
        
   int temp= Integer.parseInt(JOptionPane.showInputDialog("Ingrese su temperatura"));
 
   if(temp>= 38){
       JOptionPane.showMessageDialog(null,"tienes fiebre");
   }else{
       JOptionPane.showMessageDialog(null,"tu temperatura es normal");
   }
   
        
        
    }
    
}
