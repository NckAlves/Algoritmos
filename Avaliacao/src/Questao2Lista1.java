import java.util.Scanner;
import java.util.Stack;

public class Questao2Lista1 {
	public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        Stack<Integer> num = new Stack<>();

        for (int i = 0; i < 10; i++) {
            System.out.printf("Insira um numero: ");
            num.add(s.nextInt());
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Ordem inversa " + num.pop());
        }

        s.close();
	}
}
