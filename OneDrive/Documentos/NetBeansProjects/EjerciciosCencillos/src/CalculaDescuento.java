
public class CalculaDescuento {
    public static void main(String[] args){
        
        
  double precioPrenda = 120.00;
        double porcentajeDescuento = 0.15; // Representa el 15%
        
        // Calcular cuánto se va a restar
        double descuentoTotal = precioPrenda * porcentajeDescuento;
        double precioFinal = precioPrenda - descuentoTotal;
        
        System.out.println("--- EJERCICIO 4: DESCUENTO TEXTIL ---");
        System.out.println("Precio original de la prenda: $" + precioPrenda);
        System.out.println("Descuento del 15%: -$" + descuentoTotal);
        System.out.println("Precio final con descuento: $" + precioFinal);      
        
    
        
    }
}
