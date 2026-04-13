package lista_exercicios2;
import java.util.Scanner;

public class calculadora2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nDigite o primeiro número: ");
        double numero_1 = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        double numero_2 = sc.nextDouble();

        System.out.println("\nOPERACOES DISPONIVEIS:");
        System.out.println("1 - Média");
        System.out.println("2 - Subtração do maior para o menor");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.print("SELECIONE A OPERÇÃO: ");
        int operacao_escolhida = sc.nextInt();

        sc.close();

        if (operacao_escolhida == 1) {
            double media = (numero_1 + numero_2) / 2;
            System.out.println("\nMédia: "+ media);
            System.out.println();
        } else if (operacao_escolhida == 2) {
            double subtracao;
            if (numero_1 >= numero_2) {
                subtracao = numero_1 - numero_2;
            } else {
                subtracao = numero_2 - numero_1;
            }
            System.out.println("\nSubtração (maior - menor): "+ subtracao);
            System.out.println();
        } else if (operacao_escolhida == 3) {
            double multiplicacao = numero_1 * numero_2;
            System.out.println("\nProduto: "+ multiplicacao);
            System.out.println();
        } else if (operacao_escolhida == 4) {
            if (numero_2 != 0) {
                double divisao = numero_1 / numero_2;
                System.out.println("\nDivisão: "+ divisao);
                System.out.println();
            } else {
                System.out.println("\nErro: divisão por zero.\n");
            }
        } else {
            System.out.println("\nErro: escolha um número entre 1 e 4.\n");
        }
    }
}