package aula04;
import java.util.Scanner;

public class calculadora {
    static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digitem seu nome: ");
        String nome = entrada.nextLine();

        System.out.println("Digite o primeiro número (int): ");
        int numero1 = entrada.nextInt();

        System.out.println("Digite o segundo número (double): ");
        double numero2 = entrada.nextDouble();

        int soma;
        soma = numero1 + (int)numero2;
        System.out.println("Nome: "+nome+ "\nSoma: "+numero1+" + "+numero2+" = "+soma);
    }
}
