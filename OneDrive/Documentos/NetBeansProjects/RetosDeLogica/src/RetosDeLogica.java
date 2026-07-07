import  javax.swing.JOptionPane;
public class RetosDeLogica {

    public static void main(String[] args) {
       
        
  int tam= Integer.parseInt(JOptionPane.showInputDialog("Cantidad de temperaturas a Ingresar"));
  double[] temperatura= new double[tam];
  
int diacontados= 0;
double suma= 0.00;

  
  for(int i=0; i<tam; i++){
      temperatura[i]= Double.parseDouble(JOptionPane.showInputDialog("Ingrese la temperatura del Dia : "+(i+1)));  
     suma = suma + temperatura[i]; 
   if(temperatura[i]>= 30){
       diacontados++;
   }
    System.out.println("Dia "+(i+1)+ ": "+ temperatura[i]+ "°C");  
  }
  double promedio= suma/tam;
  
  
  
  System.out.println("------------------------------");
  System.out.println("El promedio es : "+promedio+ "°C");
  System.out.println("Dias con calor mayor o igual a (30 C): "+diacontados);
        
  
        
        
    }
    
}
