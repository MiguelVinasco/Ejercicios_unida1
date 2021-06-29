import java.util.Scanner;

public class ejercio_cifras {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);


        System.out.println("Ingresa el numero:");

        int numero = entrada.nextInt();

        int digito = cifras(numero);

        System.out.println("el numero " + numero + " tiene "+ digito + " cifras.");


    }

    public static int cifras(int numero){

        int incremento_cifras = 0;

        while (numero != 0) {

            numero /= 10;
            incremento_cifras++;          
        }

        return incremento_cifras;



    }
    
}

