
package sistemabiometrico;

public class Personas {
    
    private String nombre;
    private String identificacion;
    private String categoria;
    
public Personas(String nombre, String identificacion, String categoria){
    this.nombre = nombre;
    this.identificacion = identificacion;
    this.categoria = categoria;
}
  public String getNombre() { return nombre; }
  public String getIdentificacion() { return identificacion; }
  public String getCategoria() { return categoria; } 
}
