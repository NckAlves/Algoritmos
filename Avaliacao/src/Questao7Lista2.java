import java.util.Random;

public class Questao7Lista2 {
public static void main(String[] args) {
        
        int num, maior = 0, menor = 0;
        Random aleatorio = new Random();

        for (int i = 0; i < 100; i++) {
            num = aleatorio.nextInt();
            
            if (i == 0) {
                maior = num;    
                menor = num;
            }
            else if (num > maior) {
                maior = num;
            }
            else if (num < menor) {
                menor = num;
            }
        }
        System.out.printf("O maior n�meo � %d \nO menor n�mero � %d", maior, menor);
    }
}
