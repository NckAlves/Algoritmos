import java.util.Scanner;

public class Questao3Lista1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.printf("Insira o tamanho da base menor: ");
        float baseMenor = s.nextFloat();

        System.out.printf("Insira o tamanho da base maior: ");
        float baseMaior = s.nextFloat();
        
        System.out.printf("Insra a altura do trapezio: ");
        float altura = s.nextFloat();

        float area = (baseMaior + baseMenor) * altura / 2;
        System.out.printf("A area do trapezio eh %f", area);

        s.close();
    }

}
