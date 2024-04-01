import java.util.Scanner;

public class ex011 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temperaturaF = 0;
		char resposta;
		do{
			System.out.print("Digite a temperatura em Célsius: ");
			int temperaturaC = sc.nextInt();
			temperaturaF = 9 * temperaturaC / 5 + 32;
			System.out.println("Equvalente a Fahrenheit: " + temperaturaF);
			System.out.println("Deseja repetir (s|n)?");
			resposta = sc.next().charAt(0);			 
		}while (resposta == 's');

		sc.close();
		
	}
}