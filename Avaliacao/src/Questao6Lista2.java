import java.util.Random;

public class Questao6Lista2 {
public static void main(String[] args) {
        
        int[] num = new int[100];
        Random aleratorio = new Random();

        for (int i = 0; i < 100; i++) {
            num[i] = aleratorio.nextInt();
            if ((num[i] % 2) == 0) {
                System.out.println(num[i]);
            } 
        }
    }
}
