
package examen_2_mayo;

import javax.swing.JOptionPane;
public class Ejercicio01 {
    public static void main(String[] args){
        
   String v1= JOptionPane.showInputDialog("Ingrese el primer valor ");
   String v2= JOptionPane.showInputDialog("Ingrese el segundo valor");
   String v3= JOptionPane.showInputDialog("Ingrese el tercer valor  ");
   
   int valor1= Integer.parseInt(v1);
   int valor2= Integer.parseInt(v2);
   int valor3= Integer.parseInt(v3);
   
   System.out.println("Los valores son: \n"+valor1+ "\n"+valor2+ "\n"+valor3);
   if(valor1 > valor2 && valor2 > valor3 ){
        System.out.println("el primer valor es mayor");
    }else if(valor2 >valor1 && valor1> valor3){
        System.out.println("el segundo valor es mayor");
    }else{
        System.out.println("el tercer valor es mayor");
    }
     
  
           
        
        
        
        
        
    }
    
}
