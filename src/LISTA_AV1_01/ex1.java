package LISTA_AV1_01;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        // "entrada" é o nome dado para usar o Scanner
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int numero = entrada.nextInt();

        int antecessor = numero - 1;
        int sucessor = numero + 1;

        System.out.println("Antecessor: " + antecessor);
        System.out.println("Sucessor: " + sucessor);

        entrada.close();
    }
}
