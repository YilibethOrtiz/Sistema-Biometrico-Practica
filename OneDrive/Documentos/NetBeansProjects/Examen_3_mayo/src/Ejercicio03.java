import javax.swing.JOptionPane;
public class Ejercicio03 {
    public static void main(String[] args){
        
        
   //ejercicio 3: 
    //desarrolle un algoritmo que almacene atravez de ventanas y muestre por consola
    //10 estados de venezuela en un arreglo      
        
  int v1=Integer.parseInt( JOptionPane.showInputDialog("Ingrese cuantos estados"));
   String[] almace= new String[v1];
   
//   String[] estados= {"Cojedes","Tachira","Falcon","Merida","Bolivar","Amazonas","Apure","Portuguesa","Barinas","Trujillo"};
        
  for(int i=0; i<almace.length; i++){
      almace[i]= JOptionPane.showInputDialog("Ingrese los estados");
   System.out.println(almace[i]);
 
  }
 
       
    }
    
}
