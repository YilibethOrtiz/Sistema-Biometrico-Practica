
package examen_2_mayo;

public class SensordeAsistencia {
    public static void main(String[] args){
        
boolean[] asistencia= {true,true,false,true,true};

int contadorAsis= 0;

for (int i=0; i<asistencia.length; i++){
  
   if(asistencia[i]==true){
       
  contadorAsis= contadorAsis +1;
       
   }
}
        
        
        
    System.out.println("Total de asistencias: " + contadorAsis);    
        
        
        
    }
    
}
