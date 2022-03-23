import java.util.Scanner;

public class Questao1Lista2 {
public static void main(String[] args) {
        
        float media = 0;
        float[] notas = new float[5];
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.printf("Insira sua nota: ");
            notas[i] = s.nextFloat();
        }

        media = (notas[0] + notas[1] + notas[2] + notas[3] + notas[4]) / 5;

        System.out.printf("\nA media das notas é %f", media);
        s.close();
    }

}
