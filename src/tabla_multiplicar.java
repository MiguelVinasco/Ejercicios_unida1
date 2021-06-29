import java.util.Scanner;

public class tabla_multiplicar {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);

        System.out.println("Ingresa el numero para sacar su respectiva tabla de multiplicar");
        
        int numero = entrada.nextInt();

        int tabla = multiplica(numero);

        for (int i = 0; i <11; i++) {
            

            System.out.println("la tabla es " + numero + "*"+  i + " = " + (numero*i));
    
        }

        //System.out.print("la tabla del "+ numero + " es: ");
    }


    public static int multiplica(int numero){

       

        for (int i = 0; i <=10;  i++) {

            numero *= i;
            
            System.out.println(numero);

        }

        return numero;
    }
    
}
