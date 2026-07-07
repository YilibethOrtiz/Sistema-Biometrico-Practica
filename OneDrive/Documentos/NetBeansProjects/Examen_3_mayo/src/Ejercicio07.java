import javax.swing.JOptionPane;
public class Ejercicio07 {
    public static void main(String[] args){
        
   /*  Enunciado 1: El Validador de Acceso Seguro (Sistema de Control)
Objetivo: Aplicar lógica condicional compuesta (if-else) y control de flujos repetitivos 
 (while o do-while) para simular la seguridad de una interfaz de usuario.
Descripción del problema: Se requiere un programa en Java que simule el bloqueo 
de seguridad de un sistema de acceso. El programa debe definir una clave correcta oculta y
permitirle al usuario un máximo de 3 intentos para adivinarla.
El sistema debe ejecutar un ciclo que evalúe en cada vuelta si la clave ingresada coincide con la almacenada.
Si la clave es correcta, el sistema debe interrumpir el ciclo inmediatamente (break) y mostrar el mensaje:
        "¡Acceso Concedido! Bienvenido al sistema."
Si la clave es incorrecta, el programa debe incrementar el contador de intentos erróneos,
mostrar cuántos intentos van y permitirle probar de nuevo.
Si el contador de intentos llega a 3 sin éxito, el ciclo debe terminar y el programa mostrará una alerta restrictiva fija: 
"¡Alerta! Cuenta Bloqueada por motivos de seguridad."          
     */   
     

// 1. declaramos las variables de control 
//clave de seguridad oculta en el sistema
   int claveCorrecta= 2905;
   //creamos un contador para llevar el registro de oportunidades fallidas
   int intentos= 0;
   
 //2. Control repetitiva(BUCLE)
 //se ejecutara mientras el usuario tengo menos de tres intentos 
 while(intentos < 3){
     //capturamos la clave en un ventana flotante, mostrando dinamicamente el numero de intentos
     //convertimos el texto en numero entero usando Integer.parseInt(...
       int claveIngresada = Integer.parseInt(JOptionPane.showInputDialog("Escribe tu clave (Intentos " + (intentos + 1)+ "):"));
     
       //3. evaluamos la logica Condicional conpuesto
       if(claveIngresada == claveCorrecta){
           //si la clave es correcta mostramos exito 
         JOptionPane.showMessageDialog(null, "¡Acceso Concedido!");
         //... y usamos break´para romper el bucle  
         break;
         
       }else{
           //si la clave es incorrecta notificamos al usuario 
           JOptionPane.showMessageDialog(null,"Clave Incorrecta");
           // e ingrementamos el contador de intentos en 1 para limitar sus opciones
           intentos ++;
       }
       
 } //fin del blucle while

//4. validacion de seguridad final (fuera del blucle)
// se evalua si el ciclo termino por que el usuario agoto los tres intentos se le notifica como cuenta bloqueada
  if(intentos == 3){
      
         JOptionPane.showMessageDialog(null, "¡Cuenta Bloqueada por motivo de seguridad!");
     }         
        
    }
    
}
