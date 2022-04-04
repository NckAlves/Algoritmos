import java.util.Random;

public class Questao8Lista2 {
public static void main(String[] args) {
        
        int media;
        int soma = 0;
        int[] vetor = new int[100];
        Random alet = new Random();

        for (int i = 0; i < 100; i++) {
            vetor[i] = alet.nextInt();
            soma += vetor[i];
        }

        media = soma / 100;
        System.out.printf("A media entre os numeorod eh %d", media);

    }
}
