import java.util.Scanner;

public class Questao2Lista1 {
	public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.printf("Digite sua altura: ");
        float altura = s.nextFloat();

        System.out.printf("Digite seu peso: ");
        float peso = s.nextFloat();

        float imc = peso / (altura * altura);
        System.out.printf("Seu IMC eh de %f", imc);

        s.close();
	}
}
