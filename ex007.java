import java.util.*;
public class ex007 {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double coodernadaX;
        double coodernadaY;
        System.out.print("Digite a coodernadaX: ");
        coodernadaX = sc.nextDouble();
        System.out.print("digite a coodernadaY: ");
        coodernadaY = sc.nextDouble();

        if (coodernadaX > 0) {
            if (coodernadaY > 0) {
                System.out.println("Q1");
            }else if (coodernadaY < 0) {
                System.out.println("Q4");
            }
        }else if (coodernadaX < 0) {
            if (coodernadaY > 0) {
                System.out.println("Q2");
            }else if (coodernadaY < 0) {
                System.out.println("Q3");
            }            
        }else{
            System.out.println("origem");
        }
		sc.close();    
    }
}

