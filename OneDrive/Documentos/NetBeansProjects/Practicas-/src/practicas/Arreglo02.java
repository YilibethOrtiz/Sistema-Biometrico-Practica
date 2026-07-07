
package practicas;
import javax.swing.JOptionPane;
public class Arreglo02 {
    public static void main(String[] args){
        
      int[] x = new int[5];
x[0] = 8;
x[1] = 33;
x[2] = 200;
x[3] = 150;
x[4] = 11;
System.out.println("El array x tiene 5 elementos cual de ellos quiere ver");
System.out.print("Introduzca un numero del 0 al 4: ");
int indice = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero del 0 al 4: "));
System.out.print("El elemento que se encuentra en la posicion \n" + indice);
System.out.println(" es el " + x[indice]);  
        
        
        
        
    }
    
}
