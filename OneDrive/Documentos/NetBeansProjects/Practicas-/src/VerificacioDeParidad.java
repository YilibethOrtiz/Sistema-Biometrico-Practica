import javax.swing.JOptionPane;
public class VerificacioDeParidad {
    public static void main(String[] args){
        
  int  numero= Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numeroEntero"));
  
  String resultado="el numero "+numero+ "\n";
  
  if(numero%2==0){
      resultado= resultado+"-Es un numero PAR.\n";
        
  }else{
      resultado= resultado+"-Es un numero IMPAR.\n";
      
  }
      if(numero %5==0){
          resultado= resultado+"-Es un divicible entre 5. \n";
      }  else{
          resultado= resultado+"-No es divicible entre 5.\n";
      }
      JOptionPane.showConfirmDialog(null, resultado);
      
    }
    
}
