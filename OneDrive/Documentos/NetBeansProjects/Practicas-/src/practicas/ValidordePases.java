
package practicas;

import javax.swing.JOptionPane;
public class ValidordePases {
   public static void main(String[] args){
       
   String[] autorizado= {"Samuel","Yulieth","Robinson","Yilibeth"};    
      boolean encontrado= false; 
   String v1= JOptionPane.showInputDialog("Ingrese su nombre");
   
  for(int i=0; i<autorizado.length; i++){
      
      if(autorizado[i].equals(v1)){
        encontrado= true;  
      }
  }     
  if(encontrado == true){
      System.out.println("Acceso Permitido. Bienvenido(a)");
  }  else{
      System.out.println("Acceso Denegado");
  }
  
   } 
}
