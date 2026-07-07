import javax.swing.JOptionPane;
public class Ejercicio08 {
    public static void main(String[] args){
        
   /**
    *Enunciado 2: El Despachador Automatizado de Encomiendas (Logística)
Objetivo: Implementar estructuras de decisión múltiple (switch), bucles de conteo exacto (for) y variables de control tipo contador.
Descripción del problema: Una agencia de entregas locales necesita procesar de forma automatizada un lote cerrado de 5 pedidos en cola. 
* Para optimizar la logística final, el sistema debe clasificar y contar cuántos paquetes se asignan a cada empresa de mensajería disponible:
* MRW, Zoom y Tealca.
* El programa debe inicializar tres contadores independientes en cero (uno para cada agencia).
* Se debe diseñar un bucle for que se ejecute exactamente 5 veces (simulando el paso secuencial de cada paquete).
* Dentro del bucle, mediante una estructura switch, se evaluará la cadena de texto con el nombre de la 
* empresa elegida para ese paquete específico e incrementará en 1 el contador que corresponda.
* Una vez procesada toda la cola de 5 paquetes (fuera del bucle), el programa imprimirá en la consola un reporte detallado 
* con los totales acumulados por cada una de las tres agencias.  
    */     
  

// 1. DECLARACIÓN DE VARIABLES (Tus cajas contadoras vacías)
// Creamos tres contadores que inician en cero para llevar el registro de cada agencia
   
   int contadorMRW = 0;
   int contadorZoom = 0;
   int contadorTealca = 0;
  // 2. BUCLE FOR (La cinta transportadora)
// Iniciamos en 0 y usamos 'i < 5' para que dé exactamente 5 vueltas (0, 1, 2, 3 y 4)
 
   for(int i=1; i<5; i++){
       
       // Capturamos el dato. Usamos (i + 1) para que el usuario lea "paquete 1" en vez de "paquete 0"
      String agencia= JOptionPane.showInputDialog("Ingrese la agencia para el paquete "+ i);
  // 3. ESTRUCTURA SWITCH (El clasificador inteligente)
      switch(agencia){
          // Si el usuario escribe en mayúsculas o minúsculas, cae en el mismo contador
       case "MRW":
           case"mrw":
           contadorMRW++;
           break;
       case "Zoom":
           case"zoom":
           contadorZoom++;
           break;
       case "Tealca":
           case"tealca":
           contadorTealca++;
           break;
    // Si escriben otra cosa, avisa que no es válida y no suma a ninguna pila       
       default:
           JOptionPane.showMessageDialog(null, "Agencia no valida");
   }   
     
       
   }
   
     // 4. REPORTE FINAL (Fuera del bucle)   
    JOptionPane.showMessageDialog(null, "--- REPORTE FINAL DE ENVÍOS ---\n" +
                                    "Total paquetes para MRW: " + contadorMRW + "\n" +
                                    "Total paquetes para Zoom: " + contadorZoom + "\n" +
                                    "Total paquetes para Tealca: " + contadorTealca);   
        
    
    }
    
}
