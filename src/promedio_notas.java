import java.util.Scanner;

public class promedio_notas {

    public static void main(String[] args) {
        
        var entrada = new Scanner(System.in);

        System.out.println("Ingresa la primer nota");

        var nota1 = entrada.nextDouble();
        
        System.out.println("Ingresa la segunda nota");
        
        var nota2 = entrada.nextDouble();
        
        System.out.println("Ingresa la tercera nota");
        
        var nota3 = entrada.nextDouble();

        //var ecuacion = 0;
        var ecuacion = ecuacion(nota1, nota2, nota3);
        var salida = promedio(ecuacion);
        
        System.out.println("el estudiante con las notas " + nota1 +" - "+  nota2 + " - " + nota3 + " con promedio de " + ecuacion +salida  );
        
    }
    
    public static String promedio(double ecuacion) {
        
        
        String resultado = "";
        if (ecuacion >= 3.0){

            resultado = " el estudiante aprobo";

            return resultado;
            
        }else{
            
            resultado = " el estudiante reprobo";
            
            return resultado;
        }
        
        
    } 
    public static double ecuacion(double nota1, double nota2, double nota3){
    
        var ecuacion = (nota1 + nota2 + nota3) /3;
    
        return  ecuacion;
    }   
        
}

