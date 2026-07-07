

import javax.swing.JOptionPane;
public class Ejercicio01 {
    public static void main(String[] args){
        
   //Ejercicio1: desarrolle un algoritmo mostrar nombres y apellidos
   //que seran almacenado en un arreglo, ingrese a travez de ventana 
  // la cantidad de valores que se va a registrar o aregistrar 
  //      
  
 int tam= Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas personas vas a ingresar?"));
String[] nombreApe= new String[tam];


for(int i=0; i<tam; i++){
     nombreApe[i]= JOptionPane.showInputDialog("Ingrese Nombre y Apellido"+(i+1));
     
     System.out.println("Registrado:"+ nombreApe[i]);
     
}
 
  System.out.println("----------------------------------------");
  System.out.println("Cantidad de personas Registradas "+tam);
  

        
    }
    
}
