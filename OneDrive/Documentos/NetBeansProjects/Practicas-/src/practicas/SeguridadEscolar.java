
package practicas;

public class SeguridadEscolar {
    public static void main(String[] args){
    
   int[] notaFinal= {19,8,20,14,};
   
   int reprobado= 0;
   
 for(int i=0; i<notaFinal.length; i++){
     if(notaFinal[i]>= 10){
         if(notaFinal[i]== 20){
             System.out.println("Atencion Nota perfecta" + i);
         }
         
     }
     else{
         reprobado++;
     }
 }
     System.out.println("Reprobados :"+reprobado);
        
    }
    
}
