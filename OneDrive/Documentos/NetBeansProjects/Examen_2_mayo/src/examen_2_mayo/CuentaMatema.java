
package examen_2_mayo;

public class CuentaMatema {
    public static void main(String[] args){
        
        
 int total = 0;
 
 /*
 Vuelta 1:i arranca valiendo 2.¿Es 2 <= 6?
 ¡Sí! Entonces entra al bloque.total = total + i $\rightarrow$ 0 + 2 = 2.
 Ahora total vale 2.Vuelta 2:i se incrementa dando el salto:
 2 + 2, así que ahora i vale 4.¿Es 4 <= 6? ¡Sí! Entra de nuevo.total =
 total + i $\rightarrow$ 2 + 4 = 6. Ahora total vale 6.Vuelta 3:i vuelve a saltar: 4 + 2, así que i vale 6.¿Es 6 <= 6? ¡Sí! (Porque dice menor o igual). Entra por última vez.total = total + i $\rightarrow$ 6 + 6 = 12. Ahora total vale 12.El final:i sube a 8. ¿Es 8 <= 6? ¡No! El ciclo se rompe, la computadora
 se sale del bucle e imprime el valor final de la cajita: 12.
 
 */
 
 
 for(int i=2; i<=6; i=i + 2){
     total= total + i;
 }
        
   System.out.println("El total es : "+total);     
        
        
        
    }
    
}
