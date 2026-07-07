
public class ValidacionDeUsuario {
    public static void main(String[] args){
        
   int edadPersona = 16;
        int limiteEdad = 18;
        
        // Evaluamos si la edad es mayor o igual al límite (devuelve true o false)
        boolean esMayorDeEdad = edadPersona >= limiteEdad;
        
        System.out.println("--- EJERCICIO 3: EVALUACION LOGICA ---");
        System.out.println("Edad de la persona evaluada: " + edadPersona + " anos.");
        System.out.println("¿Tiene permitido el acceso?: " + esMayorDeEdad);     
         
        
    }
    
}
