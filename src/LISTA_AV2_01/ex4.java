package LISTA_AV2_01;
import java.util.Scanner;

public class ex4 {
    static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int maiorIdade = 0;
        int menorIdade = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite uma idade: ");
            int idade = sc.nextInt();

            if (idade > maiorIdade) {
                maiorIdade = idade;
            }

            if (idade < menorIdade) {
                menorIdade = idade;
            }
        }

        System.out.println("\nMaior idade: "+maiorIdade+" anos\n");
        System.out.println("\nMenor idade: "+menorIdade+" anos\n");

    }
}
