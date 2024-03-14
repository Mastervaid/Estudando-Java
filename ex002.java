import java.util.*;
public class ex002 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.print("Digite um numero: ");
        numero = sc.nextInt();
        int sobra = numero % 2;
        if (sobra == 0) {
            System.out.printf("O numero %d é par",numero);
        }
        else{
            System.out.printf("O numero %d é im4par",numero);
        }
            
    }
}
