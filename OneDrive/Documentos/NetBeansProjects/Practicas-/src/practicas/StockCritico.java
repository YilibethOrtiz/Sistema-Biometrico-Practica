
package practicas;

public class StockCritico {
    public static void main(String[] args){
        
  int[] producto= {15,3,20,4};
  int critico= 0;
  for(int i=0; i<producto.length; i++){
      if (producto[i]<5){
         critico++; 
      }
  }
    System.out.println("Esta es la cantidad que necesita reposicion:" +critico);    
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
