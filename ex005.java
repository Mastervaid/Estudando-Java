import java.util.*;
public class ex005 {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Double> map = new HashMap<>();
        int entrada1;
        int entrada2;
        map.put(1, 4.00);
        map.put(2, 4.50);
        map.put(3, 5.00);
        map.put(4, 2.00);
        map.put(5, 1.50);

        System.err.println("Digite os codigo: ");
        entrada1 = sc.nextInt();
        entrada2 = sc.nextInt();

        double total = (double)(map.get(entrada1) + map.get(entrada2));
        System.err.printf("TOTAL: R$ %.2f", total);

		sc.close();
    }
}
