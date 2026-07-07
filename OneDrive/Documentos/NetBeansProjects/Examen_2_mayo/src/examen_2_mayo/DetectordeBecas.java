
package examen_2_mayo;
import javax.swing.JOptionPane;
public class DetectordeBecas {
    public static void main(String[] args){
        
    double promedio= 18.5;
boolean tieneFaltas= false;    
  boolean becaAprobada= true;
  
  
  
  if(promedio >= 16 ){
    if(tieneFaltas==false){
     becaAprobada= true;
     System.out.println("Beca aprobada");
    } else{
        System.out.println("No califica por tener faltas");
    }
     
    }else{
      System.out.println("No califica por primedio bajo.");
  }
    
    
  }
        
}    
        
        
    
    

