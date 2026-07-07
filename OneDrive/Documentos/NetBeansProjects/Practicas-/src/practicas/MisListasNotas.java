
package practicas;
import javax.swing.JOptionPane;
public class MisListasNotas {
   public static void main(String[] args){
       
       
  int tam= Integer.parseInt(JOptionPane.showInputDialog("cuantas notas desea cargar Hoy"));
  int[] nota= new int[tam];
       
 for(int i=0; i<nota.length; i++){
     nota[i]= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota "+(i+1)));
     if(nota[i] == 20){
         
         System.out.println("Excelente nota perfecta registrada en la prosicion "+ nota[i]);
     }else if(nota[i] < 20 || nota[i] > 12){
         System.out.println("Aprobaste");
     }
     if(nota[i] <10){
         System.out.println("Reprovaste");
     }
 }   
       
       
       
       
       
       
       
       
   } 
}
