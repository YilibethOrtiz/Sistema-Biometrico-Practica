
package practicas;
import javax.swing.JOptionPane;
public class ArryAnimadas {
    public static void main(String[] args){
        
    int tam=Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad a guardad"));
    int numero[]= new int[tam];
    
    String valores="";
    String pares= "";
    String impares= "";
    
    for(int i=0; i<numero.length; i++){
      numero[i]= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese valor "+(i+1) ));
      
        if(numero[i]%2==0){
            pares+= "\n"+numero[i];
        }else{
            impares+= "\n"+numero[i];
        }
        valores+= "\n"+numero[i];
     }
    JOptionPane.showMessageDialog(null,"Los numeros son: "+valores+ "\nLos pares son: "+pares+" \nlos Impares son: "+impares);
    
    
        
    }
    
}
