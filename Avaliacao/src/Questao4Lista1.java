import java.util.Scanner;

public class Questao4Lista1 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        System.out.printf("Insira um numero: ");
        int num1 = s.nextInt();

        System.out.printf("Insira outro numero: ");
        int num2 = s.nextInt();

        if (num1 > num2) System.out.println("O primeiro numero eh maior");
        else System.out.println("O segundo numero eh maior");

        s.close();
    }
}