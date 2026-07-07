
package practicas;
import javax.swing.JOptionPane;
public class AlmecenDeAlimento {
    public static void main(String[] args){
        
   // 1. Pides el tamaño 'tam'
// OJO: El arreglo es double porque el peso lleva decimales
int tam= Integer.parseInt(JOptionPane.showInputDialog("cual es el tamano"));
double peso[] = new double[tam]; 

// Variables para el análisis
double sumaPeso = 0; // Acumulador numérico (empieza en 0.0)
int cajasIncompletas = 0; // Contador de cajas de menos de 15kg

// 2. Primer bucle for: Llenar el arreglo
for (int i = 0; i < peso.length; i++) {
    // ¡Ojo al convertir! Usamos Double.parseDouble
    peso[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese peso de la caja " + (i + 1)));
}

// 3. Segundo bucle for: Recorrer y procesar
for (int i = 0; i < peso.length; i++) {
    
    // Acción 1: Sumar SIEMPRE el peso de la caja al total general
    sumaPeso = sumaPeso + peso[i]; 
    
    // Acción 2: Verificar si esta caja específica está incompleta (MENOS de 15 kg)
    if (peso[i] < 15) {
        cajasIncompletas++; // Si pesa menos de 15, contamos una caja incompleta
    }
    
} // Cierre del for

// 4. Muestras en el JOptionPane el 'sumaPeso' y las 'cajasIncompletas'     
        
        
     JOptionPane.showMessageDialog(null, "La suma del peso es : "+sumaPeso+ "\nCajas incompletas son : "+cajasIncompletas);
        
        
        
        
    }
}
