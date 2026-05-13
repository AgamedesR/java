package prova_correcao;
import java.util.Scanner;

public class q5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int numero1 = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        int numero2 = sc.nextInt();

        System.out.println("Digite o terceiro número: ");
        int numero3 = sc.nextInt();

        System.out.println("\n----- Operações -----");
        // Soma
        int soma = numero1 + numero2 + numero3;
        System.out.println("Soma = "+soma);

        // Produto
        int produto = numero1 * numero2 * numero3;
        System.out.println("Produto = "+produto);

        // Média Aritmétrica
        int mediaAritmetrica = (numero1 + numero2 + numero3)/3;
        System.out.println("Média Aritmétrica = "+mediaAritmetrica);

        // Dobro
        int dobroSoma = soma * 2;
        System.out.println("Dobro da Soma = "+dobroSoma);

        // Quadrado do primeiro número
        int quadradoPrimeiro = numero1 * numero1;
        System.out.println("Quadrado do Primeiro Número = "+quadradoPrimeiro);

        // Exibir Números
        System.out.println("Os número digitados foram "+numero1+", "+numero2+", "+numero3+".\n");
    }
}
