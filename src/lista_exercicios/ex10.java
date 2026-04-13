package lista_exercicios;
import java.util.Scanner;

public class ex10 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int idade = sc.nextInt();

        if (idade > 0 & idade <= 12) {
            System.out.println("Criança");
        } else if (idade >=13 & idade <=17) {
            System.out.println("Adolescente");
        } else if (idade >= 18 & idade <= 59) {
            System.out.println("Adulto");
        } else if (idade >= 60) {
            System.out.println("Idoso");
        } else {
            System.out.println("Erro: digite um valor correto.");
        }
    }
}
