
package practicas;

import javax.swing.JOptionPane; // Importamos la herramienta para usar ventanas emergentes

public class Arreglo05 {
    public static void main(String[] args) {
        
        // 1. Creamos un arreglo (un contenedor) para guardar 4 notas con decimales (double)
        double[] nota = new double[4];
        
        // Mensajes iniciales en la consola para el usuario
        System.out.println("Para calcular la nota media necesito saber la ");
        System.out.println("nota de cada uno de tus examenes.");
        
        // 2. Primer bucle 'for': Sirve para pedirle las 4 notas al usuario una por una
        for (int i = 0; i < 4; i++) {
            // Muestra en la consola cuál examen se está pidiendo (Examen N1, N2, etc.)
            System.out.print("Nota del examen N" + (i + 1) + ": \n");
            
            // Abre una ventana emergente para escribir la nota, la convierte a número y la guarda en el arreglo
            nota[i] = Double.parseDouble(JOptionPane.showInputDialog("Cual es tu nota: "));
        } 
        
        // 3. Mostramos los resultados finales
        System.out.println("Tus notas son: ");
        double suma = 0; // Variable acumuladora para sumar todas las notas
        
        // Segundo bucle 'for': Recorre el arreglo para mostrar las notas guardadas y sumarlas
        for (int i = 0; i < 4; i++) {
            System.out.print(nota[i] + " "); // Imprime la nota actual en la consola
            suma += nota[i];                 // Suma la nota actual al total acumulado
        }
        
        // 4. Calcula el promedio dividiendo la suma total entre las 4 notas y lo muestra
        System.out.println("\nTu promedio es: " + suma / 4);
        
    }
}
