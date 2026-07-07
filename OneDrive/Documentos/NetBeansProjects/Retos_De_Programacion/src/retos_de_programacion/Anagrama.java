
package retos_de_programacion;

public class Anagrama {
   public static boolean esAnagrama(String palabra1, String palabra2){
       
       palabra1= palabra1.toLowerCase();
       palabra2= palabra2.toLowerCase();
       
       if(palabra1.equals(palabra2)){
           return false;
       }
       if(palabra1.length() != palabra2.length()){
           return false;
       }
       
       char[] letra1= palabra1.toCharArray();
       char[] letra2= palabra2.toCharArray();
       
       java.util.Arrays.sort(letra1);
       java.util.Arrays.sort(letra2);
       
       return java.util.Arrays.equals(letra1, letra2);
       
   
       
       
   } 
}
