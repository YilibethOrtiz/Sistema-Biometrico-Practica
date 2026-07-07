
package examen_2_mayo;

public class FizzBuzz {
    public static void main(String[] args){
        
   /*Enuciado: Escribe un programa que muestre por consola los numeros 1 al 100
   ambos incluidos en un salto de linea entre cada impresion sustituyendo los siguientes 
        -Multiplos de 3 por la palabra "Fizz"
        -Multiplo de 3 y de 5 a la vez por la palabra fizzBuzz 
        
     */   
    for(int i=1; i<=100; i++){
        boolean divisibleByThree = (i % 3 ==0);
        boolean divisibleByFive= (i % 5 ==0);
        
        if(divisibleByThree && divisibleByFive){
            System.out.println("fizzBuzz");
        }else if(divisibleByThree){
            System.out.println("Fizz");
        }else if(divisibleByFive){
            System.out.println("buzz");
        }else{
            System.out.println(i);
        }
    }
        
     
        
    }
    
}
