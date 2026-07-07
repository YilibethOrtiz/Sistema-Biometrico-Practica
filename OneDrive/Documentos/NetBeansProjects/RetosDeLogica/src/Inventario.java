import javax.swing.JOptionPane;
public class Inventario {
    public static void main(String[] args){
        
   /*Ejercicio 1: Desarrolle un programa en Java que solicite
    al usuario la cantidad de productos a registrar en un 
   inventario. A partir de ese dato,
  dimensione un arreglo de tipo texto. Posteriormente, 
 capture por teclado los nombres de cada uno de los productos 
y almacénelos en el arreglo. Al finalizar la captura, el sistema        
debe imprimir en consola la lista completa de los elementos 
registrados junto con su respectivo índice de posición     
        */     
    
 int tam = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de producto a ingresar"));
 String[] producto= new String[tam];
 

for(int i=0; i<tam; i++){
    producto[i]= JOptionPane.showInputDialog("Ingrese el producto "+(i+1));

   
} 
     System.out.println("-----REGISTROS DE PRODUCTOS----");  
     System.out.println("[Producto]----------------[Casilla]");        
 for(int i=0; i<tam; i++){ 
      System.out.println(producto[i]+"----------------------------["+i+"]");
 }       
        
    }
    
}
