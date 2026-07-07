
package examen_2_mayo;

public class acomuladorCiclo {
    public static void main(String[] args){
        
        
     int producto[]= {40,15,80,5,22,};
     int suma = 0;
    
     for(int i=0; i<producto.length; i++){
       suma= suma + producto[i];
       
      System.out.println("los productos son: "+producto[i]);
     }
     
     
     
        
     System.out.println("La suma total es de productos es :"+suma);   
        
     
        
    }
}
