import javax.swing.JOptionPane;

public class matematicas {

    public static void main(String[] args) {
        
        int num1, num2 ;
        System.out.print("ingresa la operacion que deseas hacer : \n1 Suma \n2 Resta \n3 Multiplicacion \n4 Division");
        var respuesta = JOptionPane.showInputDialog("ingresa tu ecuacion: ");
        System.out.println("");


        num1 = Integer.parseInt(JOptionPane.showInputDialog("ingresa el primer numero"));

        num2 = Integer.parseInt(JOptionPane.showInputDialog("ingresa el segundo numero"));


        var operacion = ecuaciones(respuesta, num1, num2);

        System.out.println("la operacion es una  "+ respuesta + " de " + num1 + " y "+ num2 + " es igual a " + operacion);
        

        
        
        
        
    }
    public static double ecuaciones(String respuesta, int num1, int num2){

        
        switch (respuesta) {
            case "suma":
    
                int resultado = num1 + num2;
    
                return resultado;
                
    
            case "resta":
    
                int resultado2 = num1 - num2;
    
                return resultado2;
                
    
            case "multiplicacion":
    
                int resultado3  = num1 * num2;
    
                return resultado3;
    
                
    
            case "division":
    
                double resultado4 = num1 / num2;
            
                return resultado4;
    
                
    
        
            default:
    
                return 0;
                
                
        }


    }
    
}
