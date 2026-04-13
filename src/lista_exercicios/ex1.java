package lista_exercicios;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        // "sc" é o nome dado para usar o Scanner
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int numero = sc.nextInt();

        int antecessor = numero - 1;
        int sucessor = numero + 1;

        System.out.println("Antecessor: " + antecessor);
        System.out.println("Sucessor: " + sucessor);

        sc.close();
    }
}
