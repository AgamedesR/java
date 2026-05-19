package LISTA_AV2_01;

import java.util.Scanner;

public class ex6 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int numero = 0;

        do {
            System.out.print("Digite um número: ");
            numero = sc.nextInt();

            if (numero != 0) {
                System.out.println("Número digitado: " + numero+"\n");
            }

        } while (numero != 0);

        System.out.println("Programa encerrado.\n");

    }
}