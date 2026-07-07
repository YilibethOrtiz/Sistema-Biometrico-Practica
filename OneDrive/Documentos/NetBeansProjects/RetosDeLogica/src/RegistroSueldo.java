import javax.swing.JOptionPane;
public class RegistroSueldo {
    public static void main(String[] args){
        
  /*jercicio 2 (El de las dos cajas de sueldos):
Dado un arreglo que ya contiene los sueldos de 5 empleados [300, 550, 400, 600, 250],
        diseñe un programa que revise cada sueldo mediante un ciclo. Si el sueldo es mayor a 400,
        debe acumularlo en una variable de texto llamada sueldosAltos. Si el sueldo es menor o igual a 400, 
        debe acumularlo en otra variable de texto llamada sueldosBajos. Al final, cuando el ciclo termine, 
        muestre ambos reportes en la pantalla usando ventanas de mensaje (JOptionPane). Cada sueldo en el reporte 
        debe quedar separado por un guion (-).  
        
        pasos1: arreglo sueldoActual,
        paso2:  variable textos, sueldoAltos y sueldoBajos 
        paso3: ciclo para revisar los sueldos actuales.
        paso3: una condicion para sueldos altos si es mayor a 400,
        paso4: if fuera del anterior para usar una condicion si el sueldo es bajo osea manor o igual a 400,
        paso5: fuera del ciclo mostrar reportes usando una ventana de mensaje cada sueldo separado por un guion
      
        */      
        
double[] sueldo= {300, 550, 400, 600, 250};

    String sueldoAlto= " ";
    String sueldoBajo= " ";
    
   for(int i=0; i<5; i++){
       if (sueldo[i]> 400){
           sueldoAlto+=  sueldo + "- ";
       }
       if(sueldo[i]<=400){
           sueldoBajo++;
       }
    
   }
        
    JOptionPane.showMessageDialog(null,"-SUELDOS ALTOS A $400--\n $"+sueldoAlto+ "\n-SUELDOS BAJOS A $400--\n $" +sueldoBajo);
        
    }
    
}
