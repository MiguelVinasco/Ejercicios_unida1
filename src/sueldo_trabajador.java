import java.util.Scanner;

public class sueldo_trabajador {

    public static void main(String[] args) {
        
        var entrada = new Scanner(System. in);

        System.out.println("Ingresa la cantidad de horas que trabajas");

        var horas = entrada.nextInt();

        var calculo = calculo(horas);

        System.out.println("tus " + horas + " horas " + " suman un total de " + calculo + " $");

    }
    public static int calculo(int horas){

        var valor_hora = 30000;
        var dinero_total = 0;

        dinero_total = horas * valor_hora;

        return dinero_total;
    }
    
}
