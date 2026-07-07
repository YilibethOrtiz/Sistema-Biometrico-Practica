import javax.swing.JOptionPane;
public class Ejercicio04 {
    public static void main(String[] args){
    //ejercicio 4: desarrolle un algoritmo que registre 20 valores numericos 
//mostrar los pares, impares, mostar los numero mayores a 20 y los menores a 20


    int tam=Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad a guardad"));
    int numero[]= new int[tam];
    
  
    String pares= " ";
    String impares= " ";
    String mayor= "";
    String menor= "";
    
    for(int i=0; i<numero.length; i++){
      numero[i]= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese valor "+(i+1) ));
        if(numero[i]%2==0){
            pares+= "\n"+numero[i]+ "- ";
        }else{
            impares+= "\n"+numero[i]+ "- ";
        }
        if(numero[i]>20){
          mayor += numero[i]+ "- ";  
     }else{
         menor+= numero[i]+ "- ";
    }
    }
    
   System.out.println("Los numero Par son :"+ pares);
   System.out.println("Los numero Impares son :"+ impares);
   System.out.println("-----------------------------------");
   
   System.out.println("Los numero Mayor a 20 son: "+ mayor);
   System.out.println("Los numero Menor a 20 son: "+ menor);
        
    
    
}











}
