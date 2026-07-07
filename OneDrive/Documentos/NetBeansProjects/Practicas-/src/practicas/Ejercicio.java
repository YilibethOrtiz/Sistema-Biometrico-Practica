
package practicas;
import javax.swing.JOptionPane;
public class Ejercicio {
    public static void main(String[] args){
        
 //  Una tienda de videojuegos tiene una promoción especial: si un cliente compra 3 o más videojuegos,
// se le aplica un 15% de descuento sobre el total de su compra. Si compra menos de 3, paga el precio completo sin ninguna rebaja. 
//Cada videojuego tiene un precio fijo de $50.

//Tu objetivo es armar un programa que realice lo siguiente:

//Solicite al usuario ingresar cuántos videojuegos va a comprar.

//Calcule el subtotal de la compra (cantidad de juegos por $50).

//Evalúe si la cantidad de juegos cumple con el requisito para el descuento.

//Si aplica el descuento, reste ese 15% al subtotal. Si no aplica, el total se queda igual que el subtotal.

//Muestre en pantalla el mensaje correspondiente (si obtuvo descuento o no) y el monto final neto que debe pagar el cliente.     
        
    
int tam= Integer.parseInt(JOptionPane.showInputDialog("Ingrese El valor "));
int valor[]= new int[tam];

String valores= " ";
String par= " ";
String impar= " ";

for(int i=0; i<valor.length; i++){
    
    valor[i]= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor "+(i+1)));
    
    if(valor[i] %2==0){
        par+= "\n" +valor[i];
    }else{
        impar+= "\n" +valor[i];   
    }
    valores+= "\n" +valor[i];
}
JOptionPane.showMessageDialog(null,"Los valores son : "+valores+ "\nlos pares son "+par+ "\nLos impares son: "+impar);








        
        
        
        
        
        
        
        
    }
    
}
