import java.util.Random;

public class Questao3Lista2 {
public static void main(String[] args) {
        
        int[] num = new int[100];
        Random aleratorio = new Random();
        

        for (int i = 0; i < 100; i++) {
            num[i] = aleratorio.nextInt();
            System.out.println(num[i]);
        }

        for (int i = 99; i >=0; i--) {
            System.out.println("Ordem inversa " + num[i]);
        }
       
    }
}
