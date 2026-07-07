
public class ControlDeEnvio {
  public static void main(String[] args){
      
    double montoCompra = 85.99;
        double montoMinimoEnvioGratis = 75.00;
        
        // Si el monto de compra es mayor o igual al mínimo, da true
        boolean calificaEnvioGratis = montoCompra >= montoMinimoEnvioGratis;
        
        System.out.println("--- EJERCICIO 7: LOGÍSTICA DE ENVÍOS ---");
        System.out.println("Total de la orden del cliente: $" + montoCompra);
        System.out.println("¿Supera el mínimo de $" + montoMinimoEnvioGratis + "?: " + calificaEnvioGratis);  
       
      
  }  
}
