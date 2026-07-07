
package examen_2_mayo;
import javax.swing.JOptionPane;
public class CalculoEdad {
    public static void main(String[] args){
        
     String nombre= JOptionPane.showInputDialog("cual es tu nombre");
    
        
     String v2= JOptionPane.showInputDialog("Cual es tu edad");
     int edad= Integer.parseInt(v2);
     
    String v3= JOptionPane.showInputDialog("Cuantos años le quires sumar la edad ");
    int edadMul= Integer.parseInt(v3); 
    
     String reporte= ""; 
    int edadM= 0;
    
    for(int i=1; i<=edadMul; i++){
       
   reporte += "En " + i + " año(s) tendras: " + (edad + i) + "\n";
         edadM= edad + edadMul;
    }    
        
        System.out.println("Tu nombre es : " + nombre+ 
                "\nTu edad es : " + edad+ 
                "\nSumado por :" + edadMul+ " años" + 
                 "\nSu edad en total es : " + edadM+ "\n"+reporte);
    }
    
}
