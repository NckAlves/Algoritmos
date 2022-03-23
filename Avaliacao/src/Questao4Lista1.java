import java.util.Random;

public class Questao4Lista1 {

public static void main(String[] args) {
        
        int[] num = new int[100];
        Random aleratorio = new Random();

        for (int i = 0; i < 100; i++) {
            num[i] = aleratorio.nextInt();
            
            for (int j = 2; j <= (num[i]/2); j++) {
                
                System.out.println(num[i]);
            }
                
        }
    }
}
