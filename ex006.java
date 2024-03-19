import java.util.*;
public class ex006 {
   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double numero;
        System.out.println("Informe o numero: ");
        numero = sc.nextDouble();
        if (numero <= 25.0) {
            System.out.println("Intervalo [0,25]");
        }else if (numero <= 50.0) {
            System.out.println("Intervalo [25,50]");            
        }else if (numero <= 75.0) {
            System.out.println("Intervalo [50,75]");    
        }else if (numero <= 100.00) {
            System.out.println("Intervalo [75,100]");
        }else{
            System.out.println("Fora de intervalo");
        }
    }
}
