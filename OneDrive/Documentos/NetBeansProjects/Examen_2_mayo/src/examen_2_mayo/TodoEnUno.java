
package examen_2_mayo;

import javax.swing.JOptionPane;
public class TodoEnUno {
    public static void main(String[] args){
        
    int tamaño= Integer.parseInt(JOptionPane.showInputDialog("¿cuantos articulos vas a Ingresar"));
    int[] precios= new int[tamaño];
    int caros= 0;
    
    for(int i=0; i< tamaño; i++ ){
        
        precios[i]= Integer.parseInt(JOptionPane.showInputDialog("Precio del articulo"+ (i+1)));
        
        if (precios[i]>50){
            if(precios[i]>100){
                caros = caros +1;
            }else{
                System.out.println("precio moderado: "+ precios[i]);
            }
        }
        
    }
        
    System.out.println("Articulo de lujo : "+caros);
        
        
    }
}
