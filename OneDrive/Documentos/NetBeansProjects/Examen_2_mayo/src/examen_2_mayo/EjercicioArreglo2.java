
package examen_2_mayo;

import javax.swing.JOptionPane;
public class EjercicioArreglo2 {
    public static void main(String[] args){
        
        
    int tam =Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de articulos"));
    int[] precios= new int[tam];
    
    for(int i=0; i<precios.length; i++){
        precios[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio de producto "+(i+1)));
    System.out.println("producto "+(i +1)+ "guardado con precio : "+ precios[0]);
    }    
        
    int doble = precios[0]*2;    
        
    System.out.println("--------------------------------"); 
    System.out.println("El primer precio ingresado fue :"+precios[0]);
    System.out.println("El doble de ese primer precio es : "+ doble);
        
        
        
        
    }
    
}
