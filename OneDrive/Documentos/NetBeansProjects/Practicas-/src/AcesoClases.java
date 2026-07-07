import java.util.Scanner;
import javax.swing.JOptionPane;
public class AcesoClases{
    
    public static void main(String[] args){

   //en el terminal de paajeros, una unidad solo puede
      //llevar 4 maletas, pedir dueño, peso, contador, acumulador, 
     //si el pesp es mayor  20kg la maleta se considera "pesada" y debe 
     //pagar un impuesto de 10.50. si pesa menos o igual el impuesto es 0
     //un contado maletas, acumulador, impuestos.
        
     //1. El oido
        Scanner teclado= new Scanner(System.in);
     //2. LA ESTANTERIA.
      String[] duenos=new String[4];
      double[] pesos=new double[4];
     //3. LOS CONTADORES Y ACOMULADORES
     int contadorPesadas= 0;
     double totalImpuesto= 0;
     //4. el ciclo.
     for(int i=0; i<4; i++){
         // Si no es la primera maleta, limpiamos el rastro de la anterior
    if (i > 0) { 
        teclado.nextLine(); 
    }
         System.out.println("\n---Registro de Maleta #" + (i+1) +"---");
         //seguarda el nombre en el estante
         System.out.print("Nombre del Dueno: ");
         duenos[i]=teclado.nextLine();
         //se guarda el peso de la maleta en el estante
         System.out.print("Peso de la maleta (kg) :");
         pesos[i]= teclado.nextDouble();
         
         //limpieza necesaria del scanner
         teclado.nextLine();
         
    //5. logica de decision
    if(pesos[i]>20.0){
     //si pesa mas de 20kg usamos ventana para avisar
    
  JOptionPane.showMessageDialog(null, "¡Atencion "+duenos[i]+ "!\nMaletas pesadas detectada.Impuesto: 10.50");
  contadorPesadas++;//sumamos 1 al contador
  totalImpuesto=totalImpuesto + 10.50; //sumamos el acumulador
    }else{
        System.out.println("Peso normal. Sin cargos extra.");
    }
     }
    //6. resultado final fuera del ciclo usamos un ventana con el resumen
    JOptionPane.showMessageDialog(null,"---RESUMEN FINAL DEL VUELO---\n"+
            "Total Maletas Pesadas: "+contadorPesadas+ "\n" +
            "Total Impuestos recaudados: "+totalImpuesto+ "USD");
        
     //cerramos el scanner   
      teclado.close();  
        
        
        
        
        
  
        
        
    }
}
