import javax.swing.JOptionPane;
public class BuscadorDeInventario {
    public static void main(String[] args){
        
   String[] productos= {"Arroz","Harina","Aceite","Cafe","Azucar","Pasta"};     
        
   String busqueda= JOptionPane.showInputDialog("Que producto desea");
   
   
      for(int i=0; i<productos.length; i++){
          
          if(productos[i].equals(busqueda)){
              System.out.println("El producto "+ productos[i] + " Si esta en la  casilla "+ i);
          }
      }
        
    }
    
}
