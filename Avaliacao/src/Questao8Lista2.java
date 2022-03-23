import java.util.Random;

public class Questao8Lista2 {
public static void main(String[] args) {
        
        int media;
        int soma = 0;
        Random alet = new Random();

        for (int i = 0; i < 100; i++) {
            soma += alet.nextInt();
        }

        media = soma / 100;
        System.out.printf("A media entre os númeor sé %d", media);

    }
}
