
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Main {
    public static int SUMAdeArreglo(Ejer arreglo[]){
       
       int s_suma=0;
       
      for(int i=0;i<arreglo.length;i++){
        s_suma+=arreglo[i].getNotas();
    }
    return s_suma;  
    }
     public static int MayordeArreglo(Ejer arreglo[]){
       float notas;
       int mayor=0;
       
       notas=arreglo[0].getNotas();
      for(int i=0;i<arreglo.length;i++){
        if(arreglo[i].getNotas()<notas){
            notas=arreglo[i].getNotas();
            mayor =i;
        }
    }
    return mayor;  
    }
     
     public static int MenordeArreglo(Ejer arreglo[]){
       float notas;
       int mayor=0;
       
       notas=arreglo[0].getNotas();
      for(int i=0;i<arreglo.length;i++){
        if(arreglo[i].getNotas()>notas){
            notas=arreglo[i].getNotas();
            mayor =i;
        }
    }
    return mayor;  
    }
    
    
    public static void main(String[] args) {
      Scanner entrada=new Scanner(System.in);
        int c_notas;
        float notas;
        float suma_notas;
        float promedio_a,promedio_b,resta;
    
    c_notas=Integer.parseInt(JOptionPane.showInputDialog("Digite cuantas notas va a ingresar: "));
       
    Ejer arreglo[]=new Ejer[c_notas];
    for(int i=0;i<arreglo.length;i++){
        System.out.println("La nota es: ");
       notas=entrada.nextFloat();
        arreglo[i]=new Ejer(notas);
    }
       
        promedio_a=SUMAdeArreglo(arreglo)/c_notas;
        
       promedio_b=2*MayordeArreglo(arreglo)-MenordeArreglo(arreglo);
        
        System.out.println("1er promedio es: "+promedio_a);
        System.out.println("2er promedio es: "+promedio_b);
        
    }
}
