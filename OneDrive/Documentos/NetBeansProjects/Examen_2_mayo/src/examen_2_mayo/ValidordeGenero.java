
package examen_2_mayo;

import javax.swing.JOptionPane;


public class ValidordeGenero {
    public static void main(String[] args){
        
String entrada=JOptionPane.showInputDialog("Ingrese su una letra de su genero('M' para maculino, 'F' para femenino");
     
 char genero= entrada.charAt(0);
 
 if(genero=='M' || genero=='m'){
        JOptionPane.showMessageDialog(null,"Registrado: Masculino");
    }else if(genero=='F' || genero=='f'){
        JOptionPane.showMessageDialog(null,"Registrado: Femenino");
    }else{
        JOptionPane.showMessageDialog(null,"Genero no valido");
    }
        
        
        
        
    }
    
}
