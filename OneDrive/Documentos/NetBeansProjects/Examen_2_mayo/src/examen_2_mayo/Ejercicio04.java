
package examen_2_mayo;

import javax.swing.JOptionPane;

public class Ejercicio04 {
    public static void main(String[] args){
        
     int tam= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad"));
     String frutas[]= new String[tam];
     
     for(int i=0; i<frutas.length; i++){
         frutas[i]= (JOptionPane.showInputDialog(null,"Ingrese la fruta "+(i+1)));
       System.out.println(frutas[i]);  
     }
        
        
        
        
        
        
        
    }
    
}
