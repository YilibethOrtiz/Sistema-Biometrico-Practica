
package practicas;
import javax.swing.JOptionPane;
public class MisNotas {
    public static void main(String[] args){
        
   double[] notasSemestre= {20.0,19.0,17.0,19.0};
   
   double suma= 0.0;
        
  for(int i=0; i< notasSemestre.length; i++){
      
      suma= suma + notasSemestre[i];
      
    double promedio= suma / notasSemestre.length;  
      
     System.out.println("El promedio del primer semestre es : "+promedio);
  }      
        
        
        
        
        
        
        
    }
}
