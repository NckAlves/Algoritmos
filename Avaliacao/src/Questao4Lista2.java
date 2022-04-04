import java.util.Random;

public class Questao4Lista2 {
public static void main(String[] args) {
        
        int[] num = new int[100];
        Random aleratorio = new Random();
        

        for (int i = 0; i < 100; i++) {
            num[i] = aleratorio.nextInt(100);

            for (int j = 2; j < (num[i] / 2); j++) {
                if ((num[i] % j) == 0) {
                   break;
                }
                else if (j == (num[i] / 2)) {
                    System.out.println(num[i]);
                }   
            }
        }  
    }
}
