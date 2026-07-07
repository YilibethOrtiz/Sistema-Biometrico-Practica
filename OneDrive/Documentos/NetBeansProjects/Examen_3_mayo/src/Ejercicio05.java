
public class Ejercicio05 {
    public static void main(String[] args){
    //ejercicio 5: desarrolle un algoritmo que sume el sueldo de un trabajado 
    // que trabaja de luenes a sabado y cuya cantidad fueron: lunes =500, 
    // martes=300, miercoles=700, jueves=100, viernes= 250, sabado=600, 
    // el algoritmo debe sumar el total del sueldo, restar mates y viernes, multiplicar miercoles y sabado y calcular el promedio total del sueldo
    
 double[] dia= new double[5];
 
 dia[0]= 500;
 dia[1]= 300;
 dia[2]= 700;
 dia[3]= 100;
 dia[4]= 250;
 dia[5]= 600;
 
String[] st= new String[5];

st[0]= "lunes";
st[1]= "martes";
st[2]= "miercoles";
st[3]= "jueves";
st[4]= "viernes";
st[5]= "sabado";

double suma= dia[0]+dia[1]+dia[2]+dia[3]+dia[4]+dia[5];

double resta= suma-dia[1]-dia[4];
double multi= dia[2]* dia[5];
   
for(int i=0; i<=5; i++){
    
   System.out.println("dia : "+st[i]+ "= "+dia[i]);
   
   
}    
  
  System.out.println("total "+suma);  
    
    
}
}