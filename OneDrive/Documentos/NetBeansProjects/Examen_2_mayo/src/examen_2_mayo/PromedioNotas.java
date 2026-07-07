
package examen_2_mayo;
import javax.swing.JOptionPane;
public class PromedioNotas {
    public static void main(String[] args){
        
    double n1= Double.parseDouble(JOptionPane.showInputDialog("nota1"));
    double n2= Double.parseDouble(JOptionPane.showInputDialog("nota2"));
   double n3= Double.parseDouble(JOptionPane.showInputDialog("nota3"));
    
   double promedio = (n1 + n2 + n3)/ 3;
   
   if(promedio >= 19){
       JOptionPane.showMessageDialog(null,"Excelente");
   }
   if( promedio >= 10 && promedio < 19 ){
        
       JOptionPane.showMessageDialog(null, "Aprobado");
   }
   if(promedio < 10 ){
       JOptionPane.showMessageDialog(null,"Reprobado");
   }
    }        
}