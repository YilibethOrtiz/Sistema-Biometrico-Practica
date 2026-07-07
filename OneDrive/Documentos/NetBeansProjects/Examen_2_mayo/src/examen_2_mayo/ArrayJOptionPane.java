
package examen_2_mayo;

import javax.swing.JOptionPane;
public class ArrayJOptionPane {
    public static void main(String[] args){
        
     String tam= JOptionPane.showInputDialog("¿Cuantas notas va a registrar? ");
    int tamaño= Integer.parseInt(tam);
    
    int[] notas= new int[tamaño];
    
    for(int i= 0; i<tamaño; i++){
        String notaTex= JOptionPane.showInputDialog("Ingrese las notas del estudiante");
        notas[i] = Integer.parseInt(notaTex);
    }
    
  JOptionPane.showMessageDialog(null,"perfecto ya guarde las "+ tamaño + " notas.");
        
        
        
        
    }
    
}
