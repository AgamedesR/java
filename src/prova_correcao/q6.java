package prova_correcao;

import java.util.Scanner;
import java.time.LocalDate;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu ano de nascimento: ");
        int anoNascimento = sc.nextInt();

        int anoAtual = LocalDate.now().getYear();
        int idade = anoAtual - anoNascimento;

        System.out.println("Idade: " + idade);
    }
}