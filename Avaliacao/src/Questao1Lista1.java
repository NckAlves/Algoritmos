import java.util.Scanner;

public class Questao1Lista1 {
public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        System.out.print("Insira um numero inteiro: ");
        int inteiro = s.nextInt();

        System.out.print("Insira um numero com mais de 11 digitos: ");
        long longo = s.nextLong();

        System.out.print("Insira um numero decimal: ");
        float decimal = s.nextFloat();

        System.out.printf("\nO inteiro digitado foi %d. \nO long digitado foi %d. \nO float digitado foi %f", inteiro, longo, decimal);
        s.close();
    }
}
