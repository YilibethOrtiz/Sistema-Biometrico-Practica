
package examen_2_mayo;
import javax.swing.JOptionPane;
public class Arreglo {
    public static void main(String[] args){
        
       
 String[] nombre= new String[5];
 System.out.println("---Arreglo #1. usando for--- ");
 
 nombre[0]= "Samuel";      
 nombre[1]= "Alisson";
 nombre[2]= "Yulieth";
 nombre[3]= "Robinson";      
 nombre[4]= "Yilibeth"; 
 
 for(int i=0; i<5; i++){
     System.out.println(i+ " "+nombre[i]);
 }
 
 System.out.println("--Colocar el arreglo #2 manual--");
 
 System.out.println(nombre[0]+"\n" +nombre[1]+ "\n" +nombre[2]+"\n"+nombre[3]+"\n"+nombre[4]);
 
 
 System.out.println("\n---Arreglo #3 manual 1 linea, usando for para imprimir todo--- ");

 String[] v= {"Juan", "pedro", "santiago", "alix", "yilibet", "samuel", "yulieth"};
 
 for(int i=0; i<v.length; i++){
     
     System.out.println(i+" "+v[i]);
 }    
 System.out.println("---Arreglo #4 pedido por ventana---");
 
   int tam= Integer.parseInt(JOptionPane.showInputDialog("ingrese el tamaño del arreglo"));
   String nombrep[]= new String[tam];
    
  for(int i=0; i<nombrep.length; i++){
      nombrep [i]= (JOptionPane.showInputDialog(null,"Ingrese su nombre "+(i+1)));
      System.out.println(i+". "+nombrep[i]);
  }  
 
 
 
 
    }
    
}
