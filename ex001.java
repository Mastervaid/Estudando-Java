import java.util.*;
public class ex001 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int numero;
        System.out.print("Digite um numero: ");
        numero = sc.nextInt();
        if (numero < 0) {
            System.out.printf("O numero %d é negativo",numero);
        }    
        else{
            System.out.printf("O numero %d é positivo",numero);
        }

    }
}