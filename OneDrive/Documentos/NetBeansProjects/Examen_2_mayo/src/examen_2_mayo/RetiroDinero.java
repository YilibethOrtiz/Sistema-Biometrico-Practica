
package examen_2_mayo;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class RetiroDinero {
    public static void main(String[] args){
        
/*Crear una variable con un "saldo inicial". Pedirle al usuario con Scanner cuánto dinero desea retirar.
Usar un if-else para verificar si tiene dinero suficiente. Si tiene, restarlo y
mostrar el nuevo saldo; si no, mostrar un mensaje de error.
  */     
       
    double dinero= 500.0;
double retiro= 0;

Scanner s= new Scanner(System.in);

System.out.print("Cuanto Dinero Desea Retirar :\n");
retiro=s.nextDouble();
        
if (dinero >= retiro){
   dinero-=retiro;
    
    System.out.println("Su saldo Es : "+dinero+ "\nRetiro : " +retiro);
}else{
    JOptionPane.showMessageDialog(null, "Su saldo es insuficiente");
}        
        
    }
    
}
