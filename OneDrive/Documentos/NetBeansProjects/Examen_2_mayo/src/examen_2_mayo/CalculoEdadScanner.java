
package examen_2_mayo;

import java.util.Scanner;
public class CalculoEdadScanner {
    public static void main(String[] args){
        
   Scanner teclado= new Scanner(System.in);

System.out.print("¿Cual es tu nombre?\n");
String nombre= teclado.nextLine();//lee texto

System.out.print("¿Cual es tu edad?\n");
int edad= teclado.nextInt();//lee numero

System.out.println("¿Cuantos años quieres sumar?\n");
 int añosAsumar= teclado.nextInt();       

int edadFinal= edad;

for(int i=1; i<= añosAsumar; i++){
    edadFinal= edad + i;
}
        
System.out.println("\n---RESULTADO---");
System.out.println("Nombre : " +nombre);
System.out.println("Edad Actual: " +edad);
System.out.println("En " +añosAsumar+ " años tendras " +edadFinal+ " años");
        
    }
    
}
