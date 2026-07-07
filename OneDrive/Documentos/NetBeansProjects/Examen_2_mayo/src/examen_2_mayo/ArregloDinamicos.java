
package examen_2_mayo;
import javax.swing.JOptionPane;
public class ArregloDinamicos {
    public static void main(String[] args){
        
        
  int tam=Integer.parseInt(JOptionPane.showInputDialog("Cuatos lotes se procesaron en el dia "));
   int lote[]= new int [tam];
   
   int contadorPares= 0;
   int sumatotal= 0;
   int maxi= 0;
   String lista= " ";
   
       for (int i=0; i<lote.length; i++){
       lote[i]= Integer.parseInt(JOptionPane.showInputDialog("Produccion de lote  " +(i+1)));
           sumatotal += lote[i];
           if (lote[i] %2==0){
               contadorPares++;
           }
           if(lote[i] > maxi){
             maxi = lote[i];  
           }
           lista+= " lote " +(i+1) + ": " +lote[i] + " piezas\n";
           }
       double promedio= (double) sumatotal / tam;
       
       String reporteFinal= "---REPORTE DE PRODUCCION DIARIA---\n"+
               lista+
               "\nProduccion Total: "+sumatotal+
                        "\nPromedio por Lote: "+promedio+
                        "\nLote con Produccion par: "+contadorPares+
                        "\nProducion Maxima registrada: "+maxi;
       
      JOptionPane.showMessageDialog(null, reporteFinal);  
        
    }
    
}
/*Explicación de los bloques clave (según las fuentes):
La estructura for: Se utiliza para recorrer el arreglo desde el índice 0 hasta que sea menor que su longitud (produccion.length), incrementando de uno en uno (i++)
.
Acumuladores: La variable sumaTotal va "pegando" 
valores numéricos (sumaTotal += valor), mientras que listaLotes va "pegando" cadenas de texto para formar un solo mensaje largo al final
.
Casteo y tipos: Es vital usar Integer.parseInt() porque JOptionPane siempre entrega texto, y para hacer operaciones matemáticas (como la suma o el promedio) necesitamos 
que el dato sea de tipo int o double
.
Operador de Residuo %: Se usa para determinar si un número es divisible por otro; en este caso, al dividir por 2 y obtener residuo 0, confirmamos que el lote es pa
*/