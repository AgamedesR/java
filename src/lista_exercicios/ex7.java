package lista_exercicios;
import java.util.Scanner;

public class ex7 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu ano de nascimento: ");
        int anoNascimento = sc.nextInt();

        int anoAtual = 2026;
        int idade = anoAtual - anoNascimento;

        System.out.println("Sua idade é: "+ idade);

        sc.close();

    }
}
