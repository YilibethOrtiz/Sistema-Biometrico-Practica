
package juegosdinamicos;
import javax.swing.JOptionPane;
public class JuegosDinamicos {
    public static void main(String[] args) {
       
  String nombre= JOptionPane.showInputDialog("Hola Bienvenido al juego de Multiplicar\n ¿Como te llamas?");
        
  int puntos= 0;
  int totalPreguntas= 10;
  
  for( int i=1; i<= totalPreguntas; i++){
      
      int n1= (int)(Math.random() * 10)+ 1;
      int n2= (int)(Math.random() * 10)+ 1;
      int resultadoReal= n1 * n2;
      
int respuestasHijo= Integer.parseInt(JOptionPane.showInputDialog("Pregunta " + i + ":\n¿Cuánto es " + n1 + " x " + n2 + "?.  "));
      
 if( respuestasHijo == resultadoReal){
     puntos ++; 
     JOptionPane.showMessageDialog(null, "Exelente! " + nombre + "\nLlevas: " + puntos + ". Puntos");
 }else{
     JOptionPane.showMessageDialog(null,"Casi " + nombre + "\n El resultado era :" + resultadoReal + "\nNo te rindas"); 
 }     
  }      
      
        
  JOptionPane.showMessageDialog(null,"Eres un supercampeon de las Matematicas, " + nombre+ " \nTu Puntuacion Final es: "+puntos+ "/"+totalPreguntas);       
        
       
        
        
    }
    
}
