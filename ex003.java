import java.util.*;
public class ex003 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroA, numeroB, maiornumero=0, menornumero=0, sobra;
        System.out.print("Digite o numero A: ");
        numeroA = sc.nextInt();
        System.err.print("digite o numero B: ");
        numeroB = sc.nextInt();

        if (numeroA > numeroB) {
            maiornumero = numeroA;
            menornumero = numeroB;
        }else if (numeroB > numeroA){
            maiornumero = numeroB;
            menornumero = numeroA;
        }else{
            System.out.println("Os numero são iguas");
        }
        
        sobra = maiornumero % menornumero;
        if (sobra == 0) {
            System.out.println("São multiplos");
        }else{
            System.out.println("Não são multiplos");
        }
		sc.close();
    }
}
