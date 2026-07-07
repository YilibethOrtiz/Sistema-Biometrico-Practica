
package examen_2_mayo;

public class Enunciado5 {
public static void main(String[] args){
    
 int[] valores = {5, 12, 18};
int conteo = 0;
for (int i = 0; i < valores.length; i++) {
    if (valores[i] > 10) {
        if (valores[i] == 18) {
            conteo = conteo + 5;
        } else {
            conteo = conteo + 2;
        }
    }
}
System.out.println(conteo);   
    
    
    
    
    
    
}    
}
