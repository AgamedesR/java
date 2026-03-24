package exercicios;
import java.util.Scanner;

public class ex5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Par");
        }
        else {
            System.out.println("Ímpar");
        }

        sc.close();
    }
}
