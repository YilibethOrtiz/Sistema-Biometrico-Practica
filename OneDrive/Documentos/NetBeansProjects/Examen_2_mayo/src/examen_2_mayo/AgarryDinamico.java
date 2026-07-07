
package examen_2_mayo;

public class AgarryDinamico {
    public static void main(String[] args){
        
    int [] notasDegrupo= {18,06,14,20,05};
    int aprobados= 0;
    
    for( int i=0; i< 5; i++){
        if( notasDegrupo[i]>10){
            aprobados = aprobados +1;
        }
        
        
    }
System.out.println("cantidad: "+aprobados);
        
    }
    
}
