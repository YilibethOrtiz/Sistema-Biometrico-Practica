
package examen_2_mayo;

public class Enunciado3 {
    public static void main(String[] args){
/*
 Enunciado 3 (Nivel Avanzado - Ciclos): Un comerciante de Maracaibo 
        quiere sumar los precios de sus productos. Tienes el arreglo 
        int[] precios = {10, 50, 100};. Necesitas un ciclo for que 
        recorra el arreglo usando de forma estricta la propiedad 
        .length para acumular la suma total en una variable.
    
        */

int[] precios= {10,50,100};
int sumar= 0;

for(int i=0; i<precios.length; i++){
    
    sumar = sumar + precios[i];
}

System.out.println(sumar);
    }
    
}
