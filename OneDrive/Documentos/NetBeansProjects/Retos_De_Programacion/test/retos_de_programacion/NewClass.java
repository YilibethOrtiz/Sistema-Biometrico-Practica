
package retos_de_programacion;

public class NewClass {
   public static void main(String[] args){
       
  

        
        // 1. SITIO WEB OFICIAL (Comentario de línea)
        // https://www.oracle.com/java/
        
        // 2. SINTAXIS DE COMENTARIOS 
        // Este es un comentario de una sola línea
        
        /*
          Este es un comentario
          de varias líneas o en bloque
         */
        
        /**
         * Este es un comentario de JavaDoc (Documentación oficial)
         * Sirve para explicar qué hace un método o una clase.
         */
        
        // 3. VARIABLES Y CONSTANTES
        
        // Una variable normal (cambia de valor)
        String miVariable = "Hola Mundo"; 
        miVariable = "Cambié de valor"; 
        
        // Una CONSTANTE 
        final double PI = 3.14159; 
        // PI = 5.0; // java no deja cambiar el valor de una constate final
        
        // 4. TIPOS DE DATOS PRIMITIVOS
        
        // Enteros 
        byte enteroByte = 127;          // Muy pequeño 
        short enteroShort = 32767;      // Pequeño 
        int enteroInt = 2147483647;     // El rey de los enteros,
        long enteroLong = 9223372036854775807L; // Ultra grande, lleva una 'L' al final 
        
        // Decimales 
        float decimalFloat = 3.14f;     // Precisión simple, lleva una 'f' al final (32 bits)
        double decimalDouble = 19.99;   // Precisión doble, el estándar para decimales
        
        // Carácter (Una sola letra o símbolo, va OBLIGATORIAMENTE con comilla simple)
        char unaLetra = 'A'; 
         
        // Booleano (Verdadero o Falso)
        boolean estoyLista = true;
        boolean tengoMiedo = false;
        
        
        // El 'String' NO es un tipo de dato primitivo en Java, es una Clase (un objeto). 
        // Por eso se escribe con 'S' Mayúscula. Pero representa las cadenas de texto:
        String miNombre = "Yilibet Ortiz";
        
        // 5. IMPRESIÓN POR TERMINAL
        System.out.println("¡Hola, Java!");
         
      
   } 
}
