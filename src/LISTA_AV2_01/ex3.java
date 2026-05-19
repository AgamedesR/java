package LISTA_AV2_01;
import java.util.Scanner;

public class ex3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um valor: ");
            soma += sc.nextInt();
        }

        int media = soma / 10;

        System.out.println("\nSoma total: "+soma);
        System.out.println("Média dos 10 números: "+media+"\n");
    }
}
