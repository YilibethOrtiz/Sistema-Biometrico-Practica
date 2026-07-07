
package practicas;

public class InventarioCalzado {
    public static void main(String[] args){
        
        
    int[] tallas= {37,42,38,42,39,42};    
    int contador= 0;
    
      for(int i=0; i<tallas.length; i++){
          
       if(tallas[i]==42){
           contador++;
       }
     
      }  
        
        System.out.println("Hay un total de "+contador+ " calzados con la talla 42"); 
        
        
        
        
        
        
        
        
        
    }
    
}
