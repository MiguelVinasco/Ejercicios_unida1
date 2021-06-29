import java.util.Scanner;

public class tabla_multiplicar {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);

        System.out.println("Ingresa el numero para sacar su respectiva tabla de multiplicar");
        
        int numero = entrada.nextInt();

        tabla(numero);

        //ltiplica(numero,acumulador);

        
        
        }
    


    public static void tabla(int numero) {

        for (int i = 0; i <11; i++) {
            

            System.out.println("la tabla es " + numero + "*"+  i + " = " + multiplica(numero, i));


        }
        
    }


    public static int multiplica(int numero, int acumulador){


        return numero*acumulador;
    }
    
}
