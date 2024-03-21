import java.util.*;
public class ex004 {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1;
        int numero2;
        int reposta;
        System.out.print("Digite o primerio numero: ");
        numero1 = sc.nextInt();
        System.err.print("digite o segundo numero: ");
        numero2 = sc.nextInt();         

        if (numero1 > numero2) {
            reposta = 24 - numero1 + numero2;       
        }else if (numero1 == numero2) {
            reposta = 24;
        }else{
            reposta = numero2 - numero1;
        }
        System.err.printf("O Jogo Durou %d horas",reposta);
		sc.close();
    }
}
