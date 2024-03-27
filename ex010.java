import java.util.Scanner;

public class ex010 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de vezes: ");
		int vezes = sc.nextInt();
		int tem = 0;
		int nao_tem = 0;
		
		for (int i=1; i <= vezes; i++){
			System.out.println("Digite o numero: ");
			int numero = sc.nextInt();			
			if (numero>= 10 && numero <= 20) {
				tem += 1;
			}else{
				nao_tem =+ 1;
			}
		}
		System.out.println(tem +"int");
		System.out.println(nao_tem + "out");
		sc.close();
	}
}