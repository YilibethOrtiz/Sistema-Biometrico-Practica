
package examen_2_mayo;
import javax.swing.JOptionPane;
public class Ejercicio05 {
    public static void main(String[] args){
        
        int tam = Integer.parseInt(JOptionPane.showInputDialog("Registe sus valores"));
        int numero[]= new int[tam];
        
        String valores= " ";
        String par= " ";
        String impar= " ";
        
        for(int i=0; i<numero.length; i++){
            
            numero[i]= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor"+(i+1)));
          if(numero[i]%2==0){
              par+= "\n"+numero[i];
          }else{
              impar+= "\n"+numero[i];
          }
          valores+= "\n"+numero[i];
        }
        
        System.out.println("Valor ingresado: "+valores+ "\nEstos son par: "+par+ "\nestos son impar"+impar);
        
    }
    
}
