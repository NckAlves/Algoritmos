import java.util.Scanner;

public class Questao5Lista1 {

	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.printf("Digite um numero: ");
        int num = s.nextInt();

        if ((num % 2) == 0) {
            System.out.println("O numero eh par");
        }
        else {
            System.out.println("O numero eh impar");
        }

        s.close();
    }
}
