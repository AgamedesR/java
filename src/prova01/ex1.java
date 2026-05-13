package prova01;
import java.util.Scanner;

public class ex1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nDigite o su nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Digite seu sexo: ");
        String sexo = sc.next();

        System.out.println("\nNome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Sexo: "+sexo+"\n");
    }
}
