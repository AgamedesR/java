package LISTA_AV2_01;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String resposta;

        do {
            System.out.print("Digite o primeiro número: ");
            double a = sc.nextDouble();

            System.out.print("Digite o segundo número: ");
            double b = sc.nextDouble();

            System.out.println("\n=== RESULTADOS ===");
            System.out.println("Soma:" + a + " + " + b + " = " + (a + b));
            System.out.println("Subtração: " + a + " - " + b + " = " + (a - b));
            System.out.println("Multiplicação: " + a + " x " + b + " = " + (a * b));

            if (b != 0) {
                System.out.println("Divisão: " + a + " / " + b + " = " + (a / b));
            } else {
                System.out.println("Divisão: não é possível dividir por zero.");
            }

            sc.nextLine(); // limpa o buffer após nextDouble()
            System.out.print("\nDeseja continuar? (Digite \"não\" para encerrar): ");
            resposta = sc.nextLine();

        } while (!resposta.equalsIgnoreCase("não") && !resposta.equalsIgnoreCase("nao"));

        System.out.println("\nPrograma encerrado.");
        sc.close();
    }
}