
package examen_2_mayo;

import javax.swing.JOptionPane;
public class MenuOpciones {
    public static void main(String[] args){
        
      
        String v1= JOptionPane.showInputDialog("Ingrese una sola letra ('A' Alumnos 'N' Cargar Notas  'S' Salir del Sistema");
        char menu= v1.charAt(0);
       
if(menu== 'A' || menu =='a'){
    System.out.println("Entrando: Ver Alumnos");
}else if(menu=='N' || menu== 'n'){
    System.out.println("Entrando: Cargar Notas");
}else if(menu == 'S'|| menu== 's'){
    System.out.println("Saliendo del sistema...Adios");
    
}else{
    System.out.println("Opcion invalida");
}
     
        
    }
    
}
